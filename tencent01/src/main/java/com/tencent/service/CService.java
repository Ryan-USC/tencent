package com.tencent.service;


import com.tencent.model.A;
import com.tencent.model.C;

import java.util.List;

public interface CService {
    C queryC(String B);
    void updateC(C record);
    List<C> queryAll();
}
