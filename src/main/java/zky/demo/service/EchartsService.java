package zky.demo.service;

import zky.demo.domain.echarts.GoodsInventory;
import zky.demo.domain.echarts.GoodsSaleMoney;
import zky.demo.domain.echarts.SaleProfit;
import zky.demo.domain.echarts.SaleWeightPercentage;

import java.util.List;

public interface EchartsService {

    public List<GoodsInventory> queryGoodsInventoryForEcharts();

    public List<SaleWeightPercentage> querySaleWeightPercentage();

    public List<GoodsSaleMoney> queryMonthGoodsSaleMoney();

    public List<SaleProfit> querySaleProfitByDate();

}
