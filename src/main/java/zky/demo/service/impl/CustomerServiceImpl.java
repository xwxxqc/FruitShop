package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.CustomerDao;
import zky.demo.domain.Customer;
import zky.demo.service.CustomerService;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public int TotalCustomer() {
        int i = customerDao.TotalCustomer();
        return i;
    }

    @Override
    public List<Customer> queryAllCustomerByPage(int start,int onePageCount) {
        List<Customer> customers = customerDao.queryAllCustomerByPage(start,onePageCount);
        return customers;
    }

    @Override
    public int deleteCustomerById(int id) {
        int i = customerDao.deleteCustomerById(id);
        return i;
    }

    @Override
    public int updateCustomer(Customer customer) {
        int i = customerDao.updateCustomer(customer);
        return i;
    }

    @Override
    public Customer queryCustomerById(int id) {
        Customer customer = customerDao.queryCustomerById(id);
        return customer;
    }

    @Override
    public List<Customer> queryLikeCustomer(String key) {
        List<Customer> customers = customerDao.queryLikeCustomer(key);
        return customers;
    }

    @Override
    public Customer queryCustomerByName(String name) {
        Customer customer = customerDao.queryCustomerByName(name);
        return customer;
    }
}
