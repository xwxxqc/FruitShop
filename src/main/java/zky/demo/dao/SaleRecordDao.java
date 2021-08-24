package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.SaleHistoryDetails;
import zky.demo.domain.SaleRecord;

import java.util.List;

@Mapper
public interface SaleRecordDao {

    public List<SaleRecord> querySaleRecordBetweenDate(@Param("begin")String begin,@Param("end")String end,
                                                       @Param("start")int start,@Param("onePageCount")int onePageCount);

    public int querySaleRecordCount();

    public Double querySumMoneyByDay(@Param("oneDay")String oneDay);

    public List<SaleHistoryDetails> querySaleHistoryDetailsByDate(@Param("oneDay")String oneDay);

}
