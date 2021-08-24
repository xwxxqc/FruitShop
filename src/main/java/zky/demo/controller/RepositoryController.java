package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.GoodsDistributed;
import zky.demo.domain.IntoRecord;
import zky.demo.domain.RepositoryAdmin;
import zky.demo.domain.Stock;
import zky.demo.service.impl.RepositoryServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RepositoryController {

    @Autowired
    private RepositoryServiceImpl repositoryService;
    @Autowired
    private Gson gson;
    @Autowired
    private Map map;

    @RequestMapping("/queryAllGoodsDistributed")
    public String queryAllGoodsDistributed(@RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount){
        List<GoodsDistributed> goodsDistributeds = repositoryService.queryAllGoodsDistributed(start, onePageCount);
        if(goodsDistributeds==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        int i = repositoryService.queryAllGoodsDistributedCount();
        List<Stock> stocks = repositoryService.queryAllStock();
        map.put("code",1000);
        map.put("total",i);
        map.put("stocks",stocks);
        map.put("goodsDistributed",goodsDistributeds);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryGoodsDistributedByName")
    public String queryGoodsDistributedByName(@RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount,
                                        @RequestParam("name")String name){
        List<GoodsDistributed> goodsDistributeds = repositoryService.queryGoodsDistributedByName(start, onePageCount, name);
        if(goodsDistributeds==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("goodsDistributed",goodsDistributeds);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryAllIntoRecordByPage")
    public String queryAllIntoRecordByPage(@RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount){
        List<IntoRecord> intoRecords = repositoryService.queryAllIntoRecordByPage(start, onePageCount);
        HashMap<String, Object> map = new HashMap<>();
        if(intoRecords==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        int i = repositoryService.queryAllIntoRecordCount();
        map.put("code",1000);
        map.put("totalCount",i);
        map.put("intoRecords",intoRecords);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryIntoRecordByDate")
    public String queryIntoRecordByDate(@RequestParam("time")String time){
        List<IntoRecord> intoRecords = repositoryService.queryIntoRecordByDate(time);
        HashMap<String, Object> map = new HashMap<>();
        if(intoRecords==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("intoRecords",intoRecords);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryAllRepositoryAdmin")
    public String queryAllRepositoryAdmin(){
        List<RepositoryAdmin> repositoryAdmins = repositoryService.queryAllRepositoryAdmin();
        HashMap<String, Object> map = new HashMap<>();
        if(repositoryAdmins==null){
            map.put("code",1001);
            map.put("msg","查询错误!");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("repositoryAdmin",repositoryAdmins);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/deleteRepositoryAdmin")
    public String deleteRepositoryAdmin(@RequestParam("id")int id){
        int i = repositoryService.deleteRepositoryAdmin(id);
        HashMap<String, Object> map = new HashMap<>();
        if(i>0){
            map.put("code",1000);
            map.put("msg","删除成功！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1001);
        map.put("msg","删除失败！");
        String s = gson.toJson(map);
        return s;
    }

}
