package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.Debt;

import java.util.List;

@Mapper
public interface DebtDao {

    public List<Debt> queryDebtByDate(@Param("range")int range,@Param("start")int start);

    public int queryDebtCount();

}
