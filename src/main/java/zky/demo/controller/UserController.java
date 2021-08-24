package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.*;
import zky.demo.service.impl.UserServiceImpl;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private Gson gson;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @RequestMapping("/getUserMessage")
    public String getUserMessage(HttpServletResponse response) throws IOException {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        return authorities.toString();
    }

    @RequestMapping("/queryAllUser")
    public String queryAllUser(){
        List<Role> roles = userService.queryAllRole();
        if(roles==null){
            return "查询失败！";
        }
        HashMap<String, Object> map = new HashMap<>();
        List<UserMessage> userMessages = userService.queryAllUserMessage();
        map.put("userMessage",userMessages);
        map.put("roles",roles);
        String s1 = gson.toJson(map);
        return s1;
    }

    @RequestMapping("/queryUserMessageByRole")
    public String queryUserMessageByRole(@RequestParam("role")String role){
        List<UserMessage> userMessages = userService.queryUserMessageByRole(role);
        if(role==null){
            return "查询失败！";
        }
        String s = gson.toJson(userMessages);
        return s;
    }

    @RequestMapping("/deleteUserMessageById")
    public String deleteUserMessageById(@RequestParam("id")int id){
        int i = userService.deleteUserMessageById(id);
        ResultInfo resultInfo = new ResultInfo();
        if(i>0){
            resultInfo.setCode(1000);
            resultInfo.setMsg("删除成功！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        resultInfo.setCode(1001);
        resultInfo.setMsg("删除失败！");
        String s = gson.toJson(resultInfo);
        return s;
    }

    @RequestMapping("/updateUserMessageById")
    public String updateUserMessageById(@RequestBody User user){
        String password = user.getPassword();
        String encode = passwordEncoder.encode(password);
        user.setPassWord(encode);
        int i = userService.updateUserMessageById(user);
        ResultInfo resultInfo = new ResultInfo();
        if(i>0){
            resultInfo.setCode(1000);
            resultInfo.setMsg("修改成功！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        resultInfo.setCode(1001);
        resultInfo.setMsg("修改失败！");
        String s = gson.toJson(resultInfo);
        return s;
    }

    @RequestMapping("/queryUserByName")
    public String queryUserByName(@RequestParam("name")String name){
        User user = userService.queryUserByName(name);
        if(user==null){
            return "查询失败！";
        }
        String s = gson.toJson(user);
        return s;
    }

    @RequestMapping("/queryAllUserRole")
    public String queryAllUserRole(){
        List<UserRole> userRoles = userService.queryAllUserRole();
        if(userRoles==null){
            return "查询失败！";
        }
        String s = gson.toJson(userRoles);
        return s;
    }

    @RequestMapping("/queryAllRole")
    public String queryAllRole(){
        List<Role> roles = userService.queryAllRole();
        if(roles==null){
            return "查询失败！";
        }
        String s = gson.toJson(roles);
        return s;
    }

    @RequestMapping("/updateUserRoleByName")
    public String updateUserRoleByName(@RequestParam("name")String name,@RequestParam("role")String role){
        int i = userService.updateUserRoleByName(name, role);
        ResultInfo resultInfo = new ResultInfo();
        if(i>0){
            resultInfo.setCode(1000);
            resultInfo.setMsg("修改成功！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        resultInfo.setCode(1001);
        resultInfo.setMsg("修改失败！");
        String s = gson.toJson(resultInfo);
        return s;
    }

}
