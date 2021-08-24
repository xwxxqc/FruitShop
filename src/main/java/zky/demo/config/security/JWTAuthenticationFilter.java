package zky.demo.config.security;

import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
import org.springframework.util.StringUtils;
import zky.demo.utils.JWTUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class JWTAuthenticationFilter extends BasicAuthenticationFilter {


    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        super(authenticationManager);
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain chain) throws IOException, ServletException {
        String token = request.getHeader("Authorization");
        if(StringUtils.isEmpty(token)){
            chain.doFilter(request,response);
            return;
        }
        try {
            DecodedJWT decodedJWT = JWTUtils.verifyToken(token);
            String username = decodedJWT.getClaim("username").asString();
            String auth = decodedJWT.getClaim("auth").asString();
            ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(auth);
            grantedAuthorities.add(authority);
            UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                    new UsernamePasswordAuthenticationToken(username, null, grantedAuthorities);
            SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
            chain.doFilter(request,response);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
