package zky.demo.service;

import zky.demo.domain.CustomerHistory;

import java.util.List;

public interface CustomerHistoryService {

    public int addCustomerHistory(CustomerHistory customerHistory);

    public List<CustomerHistory> queryCustomerHistoryByPage(int start,int onePageCount);

    public int queryHistoryCount();

    public CustomerHistory queryCustomerHistoryByTimeAndGoods(String time,String goods);

}
