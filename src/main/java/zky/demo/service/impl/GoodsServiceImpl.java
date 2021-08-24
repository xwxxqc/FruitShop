package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.GoodsDao;
import zky.demo.domain.GoodsMessage;
import zky.demo.domain.echarts.GoodsAndProfit;
import zky.demo.domain.echarts.TimeAndWeight;
import zky.demo.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public List<GoodsMessage> queryAllGoodsMessage() {
        List<GoodsMessage> goodsMessages = goodsDao.queryAllGoodsMessage();
        return goodsMessages;
    }

    @Override
    public List<TimeAndWeight> queryAllTImeAndWeightByDate() {
        List<TimeAndWeight> timeAndWeights = goodsDao.queryAllTImeAndWeightByDate();
        return timeAndWeights;
    }

    @Override
    public List<GoodsAndProfit> queryAllGoodsAndProfit() {
        List<GoodsAndProfit> goodsAndProfits = goodsDao.queryAllGoodsAndProfit();
        return goodsAndProfits;
    }
}
