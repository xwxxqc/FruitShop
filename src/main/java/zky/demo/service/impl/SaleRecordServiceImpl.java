package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.SaleRecordDao;
import zky.demo.domain.SaleHistoryDetails;
import zky.demo.domain.SaleRecord;
import zky.demo.service.SaleRecordService;

import java.util.List;

@Service
public class SaleRecordServiceImpl implements SaleRecordService {

    @Autowired
    private SaleRecordDao saleRecordDao;

    @Override
    public List<SaleRecord> querySaleRecordBetweenDate(String begin, String end,int start,int onePageCount) {
        List<SaleRecord> saleRecords = saleRecordDao.querySaleRecordBetweenDate(begin, end,start,onePageCount);
        return saleRecords;
    }

    @Override
    public int querySaleRecordCount() {
        int i = saleRecordDao.querySaleRecordCount();
        return i;
    }

    @Override
    public Double querySumMoneyByDay(String oneDay) {
        Double sum = saleRecordDao.querySumMoneyByDay(oneDay);
        return sum;
    }

    @Override
    public List<SaleHistoryDetails> querySaleHistoryDetailsByDate(String oneDay) {
        List<SaleHistoryDetails> saleHistoryDetails = saleRecordDao.querySaleHistoryDetailsByDate(oneDay);
        return saleHistoryDetails;
    }
}
