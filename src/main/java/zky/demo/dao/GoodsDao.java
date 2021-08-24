package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import zky.demo.domain.GoodsMessage;
import zky.demo.domain.echarts.GoodsAndProfit;
import zky.demo.domain.echarts.TimeAndWeight;

import java.util.List;

@Mapper
public interface GoodsDao {

    public List<GoodsMessage> queryAllGoodsMessage();

    public List<TimeAndWeight> queryAllTImeAndWeightByDate();

    public List<GoodsAndProfit> queryAllGoodsAndProfit();

}
