package com.tencent.dao;

import com.tencent.model.A;
import com.tencent.model.B;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BDao {
    B selectById(@Param("A") String A, @Param("B") String B);
    List<B> selectByB(@Param("B") String B);
    int insertB(B record);
    void updateB(B record);
    void deleteB(@Param("A") String A, @Param("B") String B);
    void deleteByB(@Param("B") String B);
    List<B> selectAll();

    int sumBaa();
    int sumBbb();
    int sumBcc();
    int sumBdd();
    int sumBee();
}
