package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.Customer;
import zky.demo.domain.ResultInfo;
import zky.demo.service.impl.CustomerServiceImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CustomerController {

    @Autowired
    private CustomerServiceImpl customerService;

    @RequestMapping("/queryAllCustomer")
    public String queryAllCustomer(@RequestParam("start")int start,@RequestParam("onePageCount")int onePageCount){
        int totalCustomer = customerService.TotalCustomer();
        List<Customer> customers = customerService.queryAllCustomerByPage(start,onePageCount);
        Gson gson = new Gson();
        if(customers==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String json = gson.toJson(resultInfo);
            return json;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("totalCount",totalCustomer);
        hashMap.put("customer",customers);
        String json = gson.toJson(hashMap);
        return json;
    }

    @RequestMapping("/deleteCustomer")
    public String deleteCustomer(@RequestParam("id")int id){
        int i = customerService.deleteCustomerById(id);
        Gson gson = new Gson();
        ResultInfo resultInfo = new ResultInfo();
        if(i>0){
            resultInfo.setCode(1000);
            resultInfo.setMsg("删除成功！");
            String json = gson.toJson(resultInfo);
            return json;
        }
        resultInfo.setMsg("删除失败！");
        resultInfo.setCode(1001);
        String s = gson.toJson(resultInfo);
        return s;
    }

    @RequestMapping("updateCustomer")
    public String updateCustomer(@RequestBody Customer customer){
        int i = customerService.updateCustomer(customer);
        Gson gson = new Gson();
        ResultInfo resultInfo = new ResultInfo();
        if(i>0){
            resultInfo.setCode(1000);
            resultInfo.setMsg("修改成功！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        resultInfo.setCode(1001);
        resultInfo.setMsg("修改失败！");
        String json = gson.toJson(resultInfo);
        return json;
    }

    @RequestMapping("/queryCustomerById")
    public String queryCustomerById(@RequestParam("id")int id){
        Customer customer = customerService.queryCustomerById(id);
        Gson gson = new Gson();
        ResultInfo resultInfo = new ResultInfo();
        if(customer==null){
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        String json = gson.toJson(customer);
        return json;
    }

    @RequestMapping("/queryLikeCustomer")
    public String queryLikeCustomer(@RequestParam("key")String key){
        List<Customer> customers = customerService.queryLikeCustomer(key);
        Gson gson = new Gson();
        if(customers==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询客户失败！");
            String json = gson.toJson(resultInfo);
            return json;
        }
        HashMap<String, Object> map = new HashMap<>();
        map.put("code",1000);
        map.put("customers",customers);
        String s = gson.toJson(map);
        return s;
    }

    @RequestMapping("/queryCustomerByName")
    public String queryCustomerByName(String name){
        Gson gson = new Gson();
        Customer customer = customerService.queryCustomerByName(name);
        if(customer==null){
            ResultInfo resultInfo = new ResultInfo();
            resultInfo.setCode(1001);
            resultInfo.setMsg("查询失败！");
            String s = gson.toJson(resultInfo);
            return s;
        }
        String s = gson.toJson(customer);
        return s;
    }

}
