package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.CustomerHistory;

import java.util.List;

@Mapper
public interface CustomerHistoryDao {

    public int addCustomerHistory(CustomerHistory customerHistory);

    public List<CustomerHistory> queryCustomerHistoryByPage(@Param("start")int start,@Param("onePageCount")int onePageCount);

    public int queryHistoryCount();

    public CustomerHistory queryCustomerHistoryByTimeAndGoods(@Param("time")String time,@Param("goods")String goods);

}
