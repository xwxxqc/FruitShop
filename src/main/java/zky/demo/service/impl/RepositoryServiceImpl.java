package zky.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zky.demo.dao.RepositoryDao;
import zky.demo.domain.GoodsDistributed;
import zky.demo.domain.IntoRecord;
import zky.demo.domain.RepositoryAdmin;
import zky.demo.domain.Stock;
import zky.demo.service.RepositoryService;

import java.util.List;

@Service
public class RepositoryServiceImpl implements RepositoryService {

    @Autowired
    private RepositoryDao repositoryDao;

    @Override
    public List<GoodsDistributed> queryAllGoodsDistributed(int start,int onePageCount) {
        List<GoodsDistributed> goodsDistributeds = repositoryDao.queryAllGoodsDistributed(start, onePageCount);
        return goodsDistributeds;
    }

    @Override
    public int queryAllGoodsDistributedCount() {
        int i = repositoryDao.queryAllGoodsDistributedCount();
        return i;
    }

    @Override
    public List<Stock> queryAllStock() {
        List<Stock> stocks = repositoryDao.queryAllStock();
        return stocks;
    }

    @Override
    public List<GoodsDistributed> queryGoodsDistributedByName(int start, int onePageCount, String name) {
        List<GoodsDistributed> goodsDistributeds = repositoryDao.queryGoodsDistributedByName(start, onePageCount, name);
        return goodsDistributeds;
    }

    @Override
    public List<IntoRecord> queryAllIntoRecordByPage(int start, int onePageCount) {
        List<IntoRecord> intoRecords = repositoryDao.queryAllIntoRecordByPage(start, onePageCount);
        return intoRecords;
    }

    @Override
    public int queryAllIntoRecordCount() {
        int i = repositoryDao.queryAllIntoRecordCount();
        return i;
    }

    @Override
    public List<IntoRecord> queryIntoRecordByDate(String time) {
        List<IntoRecord> intoRecords = repositoryDao.queryIntoRecordByDate(time);
        return intoRecords;
    }

    @Override
    public List<RepositoryAdmin> queryAllRepositoryAdmin() {
        List<RepositoryAdmin> repositoryAdmins = repositoryDao.queryAllRepositoryAdmin();
        return repositoryAdmins;
    }

    @Override
    public int deleteRepositoryAdmin(int id) {
        int i = repositoryDao.deleteRepositoryAdmin(id);
        return i;
    }
}
