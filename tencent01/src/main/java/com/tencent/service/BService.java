package com.tencent.service;

import com.tencent.model.A;
import com.tencent.model.B;

import java.util.List;

public interface BService {
    B queryB(String A, String B);
    List<B> queryByB(String B);
    void insertB(B record);
    void updateB(B record);
    void deleteB(String A, String B);
    void batchDelete(String B);
    List<B> queryAll();

    int sumBaa();
    int sumBbb();
    int sumBcc();
    int sumBdd();
    int sumBee();
}
