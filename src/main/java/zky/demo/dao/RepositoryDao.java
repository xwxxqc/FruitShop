package zky.demo.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import zky.demo.domain.GoodsDistributed;
import zky.demo.domain.IntoRecord;
import zky.demo.domain.RepositoryAdmin;
import zky.demo.domain.Stock;

import java.util.List;
@Mapper
public interface RepositoryDao {

    public List<GoodsDistributed> queryAllGoodsDistributed(@Param("start")int start,@Param("onePageStart")int onePageCount);

    public int queryAllGoodsDistributedCount();

    public List<Stock> queryAllStock();

    public List<GoodsDistributed> queryGoodsDistributedByName(@Param("start")int start,@Param("onePageStart")int onePageCount,
                                                              @Param("name")String name);

    public List<IntoRecord> queryAllIntoRecordByPage(@Param("start")int start,@Param("onePageCount")int onePageCount);

    public int queryAllIntoRecordCount();

    public List<IntoRecord> queryIntoRecordByDate(@Param("time")String time);

    public List<RepositoryAdmin> queryAllRepositoryAdmin();

    public int deleteRepositoryAdmin(@Param("id")int id);
}
