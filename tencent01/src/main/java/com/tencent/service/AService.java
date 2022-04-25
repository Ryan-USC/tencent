package com.tencent.service;

import com.tencent.model.A;
import com.tencent.model.SumData;

import java.util.List;

public interface AService {

    A queryA(String id);

    List<A> queryByParameter(String slice);

    void insertA(A record);
    void updateA(A record);
    void deleteA(String id);

    int sumAaa();
    int sumAbb();
    int sumAcc();
    int sumAdd();
    int sumAee();

}
