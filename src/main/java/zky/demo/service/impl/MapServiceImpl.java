package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.MapDao;
import zky.demo.domain.baidumap.Point;
import zky.demo.service.MapService;

import java.util.List;

@Service
public class MapServiceImpl implements MapService {

    @Autowired
    private MapDao mapDao;

    @Override
    public List<Point> queryAllRepository() {
        List<Point> points = mapDao.queryAllRepository();
        return points;
    }
}
