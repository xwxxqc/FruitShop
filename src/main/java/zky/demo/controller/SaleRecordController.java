package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.ResultInfo;
import zky.demo.domain.SaleHistoryDetails;
import zky.demo.domain.SaleRecord;
import zky.demo.service.impl.SaleRecordServiceImpl;

import java.util.HashMap;
import java.util.List;

@RestController
public class SaleRecordController {

    @Autowired
    private SaleRecordServiceImpl saleRecordService;

    @RequestMapping("/querySaleRecordBetweenDate")
    public String querySaleRecordBetweenDate(@RequestParam("begin")String begin,@RequestParam("end")String end,
                                             @RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount){
        List<SaleRecord> saleRecords = saleRecordService.querySaleRecordBetweenDate(begin, end,start,onePageCount);
        Gson gson = new Gson();
        if(saleRecords==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        int i = saleRecordService.querySaleRecordCount();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("total",i);
        map.put("saleRecords",saleRecords);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/querySumByDate")
    public String querySumByDate(@RequestParam("oneDay")String oneDay){
        Double sum = saleRecordService.querySumMoneyByDay(oneDay);
        if(sum==null){
            sum=0.00;
        }
        Gson gson = new Gson();
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("sumMoney",sum);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryHistoryDetailsByDate")
    public String queryHistoryDetailsByDate(@RequestParam("oneDay")String oneDay){
        List<SaleHistoryDetails> saleHistoryDetails = saleRecordService.querySaleHistoryDetailsByDate(oneDay);
        Gson gson = new Gson();
        if(saleHistoryDetails==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("details",saleHistoryDetails);
        String s = gson.toJson(map);
        return s;
    }

}
