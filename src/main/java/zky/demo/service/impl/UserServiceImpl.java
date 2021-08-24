package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.UserDao;
import zky.demo.domain.Role;
import zky.demo.domain.User;
import zky.demo.domain.UserMessage;
import zky.demo.domain.UserRole;
import zky.demo.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public User queryUserByName(String userName) {
        User user = userDao.queryUserByName(userName);
        return user;
    }

    @Override
    public int addUser(User user) {
        int i = userDao.addUser(user);
        return i;
    }

    @Override
    public List<Role> queryRoleByUserId(int id) {
        List<Role> roles = userDao.queryRoleByUserId(id);
        return roles;
    }

    @Override
    public List<Role> queryAllRole() {
        List<Role> roles = userDao.queryAllRole();
        return roles;
    }

    @Override
    public List<UserMessage> queryAllUserMessage() {
        List<UserMessage> userMessages = userDao.queryAllUserMessage();
        return userMessages;
    }

    @Override
    public List<UserMessage> queryUserMessageByRole(String role) {
        List<UserMessage> userMessages = userDao.queryUserMessageByRole(role);
        return userMessages;
    }

    @Override
    public int deleteUserMessageById(int id) {
        int i = userDao.deleteUserMessageById(id);
        return i;
    }

    @Override
    public int updateUserMessageById(User user) {
        int i = userDao.updateUserMessageById(user);
        return i;
    }

    @Override
    public List<UserRole> queryAllUserRole() {
        List<UserRole> userRoles = userDao.queryAllUserRole();
        return userRoles;
    }

    @Override
    public int updateUserRoleByName(String name, String role) {
        int i = userDao.updateUserRoleByName(name, role);
        return i;
    }
}
