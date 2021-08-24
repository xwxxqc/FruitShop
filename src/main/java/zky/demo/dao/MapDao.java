package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import zky.demo.domain.baidumap.Point;

import java.util.List;

@Mapper
public interface MapDao {

    public List<Point> queryAllRepository();

}
