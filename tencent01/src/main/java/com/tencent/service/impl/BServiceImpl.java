package com.tencent.service.impl;

import com.tencent.dao.BDao;
import com.tencent.model.B;
import com.tencent.service.BService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BServiceImpl implements BService {
    @Resource
    private BDao bDao;
    @Override
    public B queryB(String A, String B) {
        return bDao.selectById(A,B);
    }

    @Override
    public List<B> queryByB(String B) {
        return bDao.selectByB(B);
    }

    @Override
    public void insertB(B record) {
        bDao.insertB(record);
    }

    @Override
    public void updateB(B record) {
        bDao.updateB(record);
    }

    @Override
    public void deleteB(String A, String B) {
        bDao.deleteB(A,B);
    }

    @Override
    public void batchDelete(String B) {
        bDao.deleteByB(B);
    }

    @Override
    public List<B> queryAll() {
        return bDao.selectAll();
    }

    @Override
    public int sumBaa() {
        return bDao.sumBaa();
    }

    @Override
    public int sumBbb() {
        return bDao.sumBbb();
    }

    @Override
    public int sumBcc() {
        return bDao.sumBcc();
    }

    @Override
    public int sumBdd() {
        return bDao.sumBdd();
    }

    @Override
    public int sumBee() {
        return bDao.sumBee();
    }
}
