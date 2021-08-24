package zky.demo.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import zky.demo.domain.Role;
import zky.demo.domain.User;
import zky.demo.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomUserDetailService implements UserDetailsService {

    @Autowired
    private UserServiceImpl userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userService.queryUserByName(s);
        ArrayList<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if(user!=null){
            List<Role> roles = userService.queryRoleByUserId(user.getId());
            for (Role role : roles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRoleName());
                grantedAuthorities.add(authority);
            }
            user.setAuthorities(grantedAuthorities);
        }
        System.out.println(user);
        return user;
    }
}
