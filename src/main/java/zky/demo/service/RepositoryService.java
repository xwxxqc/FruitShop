package zky.demo.service;

import zky.demo.domain.GoodsDistributed;
import zky.demo.domain.IntoRecord;
import zky.demo.domain.RepositoryAdmin;
import zky.demo.domain.Stock;

import java.util.List;

public interface RepositoryService {

    public List<GoodsDistributed> queryAllGoodsDistributed(int start,int onePageCount);

    public int queryAllGoodsDistributedCount();

    public List<Stock> queryAllStock();

    public List<GoodsDistributed> queryGoodsDistributedByName(int start,int onePageCount,String name);

    public List<IntoRecord> queryAllIntoRecordByPage(int start,int onePageCount);

    public int queryAllIntoRecordCount();

    public List<IntoRecord> queryIntoRecordByDate(String time);

    public List<RepositoryAdmin> queryAllRepositoryAdmin();

    public int deleteRepositoryAdmin(int id);

}
