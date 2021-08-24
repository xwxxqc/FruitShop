package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import zky.demo.domain.echarts.GoodsInventory;
import zky.demo.domain.echarts.GoodsSaleMoney;
import zky.demo.domain.echarts.SaleProfit;
import zky.demo.domain.echarts.SaleWeightPercentage;

import java.util.List;

@Mapper
public interface EchartsDao {

    public List<GoodsInventory> queryGoodsInventoryForEcharts();

    public List<SaleWeightPercentage> querySaleWeightPercentage();

    public List<GoodsSaleMoney> queryMonthGoodsSaleMoney();

    public List<SaleProfit> querySaleProfitByDate();

}
