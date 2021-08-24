package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.echarts.GoodsInventory;
import zky.demo.domain.echarts.GoodsSaleMoney;
import zky.demo.domain.echarts.SaleProfit;
import zky.demo.domain.echarts.SaleWeightPercentage;
import zky.demo.service.impl.EchartsServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EchartsController {

    @Autowired
    private EchartsServiceImpl echartsService;
    @Autowired
    private Gson gson;
    @Autowired
    private Map map;

    @RequestMapping("/queryGoodsInventoryForEcharts")
    public String queryGoodsInventoryForEcharts(){
        List<GoodsInventory> goodsInventories = echartsService.queryGoodsInventoryForEcharts();
        if(goodsInventories==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("goodsInventories",goodsInventories);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/querySaleWeightPercentage")
    public String querySaleWeightPercentage(){
        List<SaleWeightPercentage> saleWeightPercentages = echartsService.querySaleWeightPercentage();
        if(saleWeightPercentages==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("percentage",saleWeightPercentages);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryMonthGoodsSaleMoney")
    public String queryMonthGoodsSaleMoney(){
        List<GoodsSaleMoney> goodsSaleMonies = echartsService.queryMonthGoodsSaleMoney();
        if(goodsSaleMonies==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("goodsSaleMoney",goodsSaleMonies);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/querySaleProfitByDate")
    public String querySaleProfitByDate(){
        List<SaleProfit> saleProfits = echartsService.querySaleProfitByDate();
        if(saleProfits==null){
            map.put("code",1001);
            map.put("msg","查询错误");
            String s = gson.toJson(map);
            return s;
        }
        map.put("code",1000);
        map.put("saleProfits",saleProfits);
        String s = gson.toJson(map);
        return s;
    }

}
