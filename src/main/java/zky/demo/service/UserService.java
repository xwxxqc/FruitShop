package zky.demo.service;

import zky.demo.domain.Role;
import zky.demo.domain.User;
import zky.demo.domain.UserMessage;
import zky.demo.domain.UserRole;

import java.util.List;

public interface UserService {

    public User queryUserByName(String userName);

    public int addUser(User user);

    public List<Role> queryRoleByUserId(int id);

    public List<Role> queryAllRole();

    public List<UserMessage> queryAllUserMessage();

    public List<UserMessage> queryUserMessageByRole(String role);

    public int deleteUserMessageById(int id);

    public int updateUserMessageById(User user);

    public List<UserRole> queryAllUserRole();

    public int updateUserRoleByName(String name,String role);

}
