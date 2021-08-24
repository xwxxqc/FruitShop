package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.baidumap.Point;
import zky.demo.service.impl.MapServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
public class MapController {

    @Autowired
    private MapServiceImpl mapService;
    @Autowired
    private Gson gson;
    @Autowired
    private Map map;

    @RequestMapping("/queryAllRepository")
    public String queryAllRepository(){
        List<Point> points = mapService.queryAllRepository();
        if(points==null){
            map.put("code",1001);
            map.put("msg","查询错误！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("points",points);
        String s = gson.toJson(map);
        return s;
    }

}
