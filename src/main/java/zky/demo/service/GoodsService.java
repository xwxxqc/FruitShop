package zky.demo.service;

import zky.demo.domain.GoodsMessage;
import zky.demo.domain.echarts.GoodsAndProfit;
import zky.demo.domain.echarts.TimeAndWeight;

import java.util.List;

public interface GoodsService {

    public List<GoodsMessage> queryAllGoodsMessage();

    public List<TimeAndWeight> queryAllTImeAndWeightByDate();

    public List<GoodsAndProfit> queryAllGoodsAndProfit();

}
