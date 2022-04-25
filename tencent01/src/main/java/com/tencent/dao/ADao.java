package com.tencent.dao;

import com.tencent.model.A;
import com.tencent.model.SumData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ADao {
    A selectById(@Param("id") String A);

    List<A> selectByParameter(@Param("slice") String s);

    int insertA(A record);

    void updateA(A record);

    void deleteA(@Param("id") String A);

    int sumAaa();
    int sumAbb();
    int sumAcc();
    int sumAdd();
    int sumAee();
}
