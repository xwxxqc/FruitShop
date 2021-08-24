package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.MainMenu;
import zky.demo.service.impl.MenuServiceImpl;
import java.util.Collection;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    private MenuServiceImpl menuService;

    @RequestMapping("/getUserMenu")
    public String getUserMenu(){
        System.out.println(SecurityContextHolder.getContext().getAuthentication().toString());
        List<MainMenu> mainMenus = null;
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        for (GrantedAuthority authority : authorities) {
            mainMenus = menuService.queryMenuByAuth(authority.toString());
        }
        Gson gson = new Gson();
        String json = gson.toJson(mainMenus);
        System.out.println(json);
        return json;
    }

}
