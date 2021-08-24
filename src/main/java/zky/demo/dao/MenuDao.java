package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.MainMenu;

import java.util.List;
@Mapper
public interface MenuDao {

    public List<MainMenu> queryMenuByAuth(@Param("auth") String auth);

}
