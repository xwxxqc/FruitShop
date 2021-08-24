package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.DebtDao;
import zky.demo.domain.Debt;
import zky.demo.service.DebtService;

import java.util.List;

@Service
public class DebtServiceImpl implements DebtService {

    @Autowired
    private DebtDao debtDao;

    @Override
    public List<Debt> queryDebtByDate(int range,int start) {
        List<Debt> debts = debtDao.queryDebtByDate(range,start);
        return debts;
    }

    @Override
    public int queryDebtCount() {
        int i = debtDao.queryDebtCount();
        return i;
    }
}
