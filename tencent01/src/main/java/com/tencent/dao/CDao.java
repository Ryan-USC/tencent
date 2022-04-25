package com.tencent.dao;

import com.tencent.model.C;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CDao {
    C selectById(@Param("slice") String slice);
    void updateC(C record);
    List<C> selectAll();
}
