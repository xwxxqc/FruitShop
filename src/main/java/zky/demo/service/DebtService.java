package zky.demo.service;

import zky.demo.domain.Debt;

import java.util.List;

public interface DebtService {

    public List<Debt> queryDebtByDate(int range,int start);

    public int queryDebtCount();

}
