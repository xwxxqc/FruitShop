package zky.demo.service;

import zky.demo.domain.Customer;

import java.util.List;

public interface CustomerService {

    public int TotalCustomer();

    public List<Customer> queryAllCustomerByPage(int start,int onePageCount);

    public int deleteCustomerById(int id);

    public int updateCustomer(Customer customer);

    public Customer queryCustomerById(int id);

    public List<Customer> queryLikeCustomer(String key);

    public Customer queryCustomerByName(String name);

}
