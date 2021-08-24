package zky.demo.config.security;

import com.google.gson.Gson;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import zky.demo.domain.ResultInfo;
import zky.demo.domain.User;
import zky.demo.utils.JWTUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
                                        HttpServletResponse httpServletResponse,
                                        Authentication authentication) throws IOException, ServletException {
        User user = (User) authentication.getPrincipal();
        String username = user.getUsername();
        String auth="";
        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
        for (GrantedAuthority authority : authorities) {
            auth=authority.toString();
        }
        HashMap<String, String> map = new HashMap<>();
        map.put("username",username);
        map.put("auth",auth);
        String token = JWTUtils.getToken(map);
        httpServletResponse.setHeader("token",token);
        httpServletResponse.setHeader("Access-Control-Expose-Headers","token");

        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setCode(1000);
        resultInfo.setMsg("OK");
        Gson gson = new Gson();
        String s = gson.toJson(resultInfo);
        PrintWriter writer = httpServletResponse.getWriter();
        writer.println(s);
        writer.flush();
        writer.close();
    }
}
