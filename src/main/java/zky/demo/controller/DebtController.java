package zky.demo.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import zky.demo.domain.Debt;
import zky.demo.service.impl.DebtServiceImpl;

import java.util.HashMap;
import java.util.List;

@RestController
public class DebtController {

    @Autowired
    private DebtServiceImpl debtService;

    @RequestMapping("/queryDebtByDate")
    public String queryDebtByDate(@RequestParam("range")int range,@RequestParam("start")int start){
        List<Debt> debts = debtService.queryDebtByDate(range,start);
        HashMap<String, Object> map = new HashMap<>();
        Gson gson = new Gson();
        if(debts==null){
            map.put("code",1001);
            map.put("msg","查询失败！");
            String s = gson.toJson(map);
            return s;
        }
        int i = debtService.queryDebtCount();
        map.put("total",i);
        map.put("code",1000);
        map.put("debts",debts);
        String s = gson.toJson(map);
        return s;
    }

}
