package com.lei.dao;

import com.lei.entity.PoetryWord;
import com.lei.entity.PoetryWordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetryWordMapper {
    long countByExample(PoetryWordExample example);

    int deleteByExample(PoetryWordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PoetryWord record);

    int insertSelective(PoetryWord record);

    List<PoetryWord> selectByExample(PoetryWordExample example);

    PoetryWord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PoetryWord record, @Param("example") PoetryWordExample example);

    int updateByExample(@Param("record") PoetryWord record, @Param("example") PoetryWordExample example);

    int updateByPrimaryKeySelective(PoetryWord record);

    int updateByPrimaryKey(PoetryWord record);
}