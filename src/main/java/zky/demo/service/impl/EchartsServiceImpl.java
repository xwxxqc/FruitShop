package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.EchartsDao;
import zky.demo.domain.echarts.GoodsInventory;
import zky.demo.domain.echarts.GoodsSaleMoney;
import zky.demo.domain.echarts.SaleProfit;
import zky.demo.domain.echarts.SaleWeightPercentage;
import zky.demo.service.EchartsService;

import java.util.List;

@Service
public class EchartsServiceImpl implements EchartsService {

    @Autowired
    private EchartsDao echartsDao;

    @Override
    public List<GoodsInventory> queryGoodsInventoryForEcharts() {
        List<GoodsInventory> goodsInventories = echartsDao.queryGoodsInventoryForEcharts();
        return goodsInventories;
    }

    @Override
    public List<SaleWeightPercentage> querySaleWeightPercentage() {
        List<SaleWeightPercentage> saleWeightPercentages = echartsDao.querySaleWeightPercentage();
        return saleWeightPercentages;
    }

    @Override
    public List<GoodsSaleMoney> queryMonthGoodsSaleMoney() {
        List<GoodsSaleMoney> goodsSaleMonies = echartsDao.queryMonthGoodsSaleMoney();
        return goodsSaleMonies;
    }

    @Override
    public List<SaleProfit> querySaleProfitByDate() {
        List<SaleProfit> saleProfits = echartsDao.querySaleProfitByDate();
        return saleProfits;
    }
}
