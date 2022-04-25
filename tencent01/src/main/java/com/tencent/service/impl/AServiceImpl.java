package com.tencent.service.impl;

import com.tencent.dao.ADao;
import com.tencent.model.A;
import com.tencent.model.SumData;
import com.tencent.service.AService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AServiceImpl implements AService {
    @Resource
    private ADao aDao;

    @Override
    public A queryA(String id) {
        return aDao.selectById(id);
    }

    @Override
    public List<A> queryByParameter(String slice) {
        return aDao.selectByParameter(slice);
    }

    @Override
    public void insertA(A record) {
        aDao.insertA(record);
    }

    @Override
    public void updateA(A record) {
        aDao.updateA(record);
    }

    @Override
    public void deleteA(String id) {
        aDao.deleteA(id);
    }

    @Override
    public int sumAaa() {
        return aDao.sumAaa();
    }

    @Override
    public int sumAbb() {
        return aDao.sumAbb();
    }

    @Override
    public int sumAcc() {
        return aDao.sumAcc();
    }

    @Override
    public int sumAdd() {
        return aDao.sumAdd();
    }

    @Override
    public int sumAee() {
        return aDao.sumAee();
    }
}
