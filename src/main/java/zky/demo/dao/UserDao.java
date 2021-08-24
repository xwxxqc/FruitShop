package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.security.core.parameters.P;
import zky.demo.domain.Role;
import zky.demo.domain.User;
import zky.demo.domain.UserMessage;
import zky.demo.domain.UserRole;

import java.util.List;

@Mapper
public interface UserDao {

    public User queryUserByName(@Param("userName")String userName);

    public int addUser(User user);

    public List<Role> queryRoleByUserId(@Param("id")int id);

    public List<Role> queryAllRole();

    public List<UserMessage> queryAllUserMessage();

    public List<UserMessage> queryUserMessageByRole(@Param("role")String role);

    public int deleteUserMessageById(@Param("id")int id);

    public int updateUserMessageById(User user);

    public List<UserRole> queryAllUserRole();

    public int updateUserRoleByName(@Param("userName")String name,@Param("role")String role);

}
