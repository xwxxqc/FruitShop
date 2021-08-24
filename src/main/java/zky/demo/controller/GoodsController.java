package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.GoodsMessage;
import zky.demo.domain.echarts.GoodsAndProfit;
import zky.demo.domain.echarts.TimeAndWeight;
import zky.demo.service.impl.GoodsServiceImpl;

import java.util.List;


@RestController
public class GoodsController {

    @Autowired
    private GoodsServiceImpl goodsService;
    @Autowired
    private Gson gson;

    @RequestMapping("/queryAllGoodMessage")
    public String queryAllGoodMessage(){
        List<GoodsMessage> goodsMessages = goodsService.queryAllGoodsMessage();
        if(goodsMessages==null){
            return "查询失败！";
        }
        String s = gson.toJson(goodsMessages);
        return s;
    }

    @RequestMapping("/queryAllTImeAndWeightByDate")
    public String queryAllTImeAndWeightByDate(){
        List<TimeAndWeight> timeAndWeights = goodsService.queryAllTImeAndWeightByDate();
        if(timeAndWeights==null){
            return "查询失败！";
        }
        String s = gson.toJson(timeAndWeights);
        return s;
    }

    @RequestMapping("/queryAllGoodsAndProfit")
    public String queryAllGoodsAndProfit(){
        List<GoodsAndProfit> goodsAndProfits = goodsService.queryAllGoodsAndProfit();
        if(goodsAndProfits==null){
            return "查询失败！";
        }
        String s = gson.toJson(goodsAndProfits);
        return s;
    }

}
