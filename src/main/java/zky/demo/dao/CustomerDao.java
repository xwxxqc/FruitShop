package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.Customer;

import java.util.List;

@Mapper
public interface CustomerDao {

    public int TotalCustomer();

    public List<Customer> queryAllCustomerByPage(@Param("start") int start, @Param("OnePageCount") int OnePageCount);

    public int deleteCustomerById(@Param("id")int id);

    public int updateCustomer(Customer customer);

    public Customer queryCustomerById(@Param("id")int id);

    public List<Customer> queryLikeCustomer(@Param("key")String key);

    public Customer queryCustomerByName(@Param("name")String name);
}
