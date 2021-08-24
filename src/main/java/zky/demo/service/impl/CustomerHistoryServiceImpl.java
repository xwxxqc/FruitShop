package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.CustomerHistoryDao;
import zky.demo.domain.CustomerHistory;
import zky.demo.service.CustomerHistoryService;

import java.util.List;

@Service
public class CustomerHistoryServiceImpl implements CustomerHistoryService {

    @Autowired
    private CustomerHistoryDao customerHistoryDao;

    @Override
    public int addCustomerHistory(CustomerHistory customerHistory) {
        int i = customerHistoryDao.addCustomerHistory(customerHistory);
        return i;
    }

    @Override
    public List<CustomerHistory> queryCustomerHistoryByPage(int start, int onePageCount) {
        List<CustomerHistory> customerHistories = customerHistoryDao.queryCustomerHistoryByPage(start, onePageCount);
        return customerHistories;
    }

    @Override
    public int queryHistoryCount() {
        int i = customerHistoryDao.queryHistoryCount();
        return i;
    }

    @Override
    public CustomerHistory queryCustomerHistoryByTimeAndGoods(String time, String goods) {
        CustomerHistory customerHistory = customerHistoryDao.queryCustomerHistoryByTimeAndGoods(time, goods);
        return customerHistory;
    }
}
