package zky.demo.service;

import zky.demo.domain.SaleHistoryDetails;
import zky.demo.domain.SaleRecord;

import java.util.List;

public interface SaleRecordService {

    public List<SaleRecord> querySaleRecordBetweenDate(String begin,String end,int start,int onePageCount);

    public int querySaleRecordCount();

    public Double querySumMoneyByDay(String oneDay);

    public List<SaleHistoryDetails> querySaleHistoryDetailsByDate(String oneDay);

}
