package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.CustomerHistory;
import zky.demo.domain.ResultInfo;
import zky.demo.service.impl.CustomerHistoryServiceImpl;

import java.util.HashMap;
import java.util.List;

@RestController
public class CustomerHistoryController {

    @Autowired
    private CustomerHistoryServiceImpl customerHistoryService;

    @RequestMapping("/queryCustomerHistoryByPage")
    public String queryCustomerHistoryByPage(@RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount){
        List<CustomerHistory> customerHistories = customerHistoryService.queryCustomerHistoryByPage(start, onePageCount);
        Gson gson = new Gson();
        if(customerHistories==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        int i = customerHistoryService.queryHistoryCount();
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",i);
        map.put("history",customerHistories);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryCustomerHistoryByTimeAndGoods")
    public String queryCustomerHistoryByTimeAndGoods(@RequestParam("time")String time,@RequestParam("goods")String goods){
        CustomerHistory customerHistory = customerHistoryService.queryCustomerHistoryByTimeAndGoods(time, goods);
        Gson gson = new Gson();
        if(customerHistory==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("customerHistory",customerHistory);
        String s = gson.toJson(map);
        return s;
    }

}
