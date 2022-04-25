package com.tencent.service.impl;

import com.tencent.dao.CDao;
import com.tencent.model.C;
import com.tencent.service.CService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CServiceImpl implements CService {
    @Resource
    private CDao cDao;
    @Override
    public C queryC(String B) {
        return cDao.selectById(B);
    }

    @Override
    public void updateC(C record) {
        cDao.updateC(record);
    }

    @Override
    public List<C> queryAll() {
        return cDao.selectAll();
    }
}
