package com.zhj.Dao;

import com.zhj.bean.TFruit;
import com.zhj.bean.TFruitExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TFruitMapper {
    long countByExample(TFruitExample example);

    int deleteByExample(TFruitExample example);

    int deleteByPrimaryKey(Integer fid);

    int insert(TFruit record);

    int insertSelective(TFruit record);

    List<TFruit> selectByExample(TFruitExample example);

    TFruit selectByPrimaryKey(Integer fid);

    int updateByExampleSelective(@Param("record") TFruit record, @Param("example") TFruitExample example);

    int updateByExample(@Param("record") TFruit record, @Param("example") TFruitExample example);

    int updateByPrimaryKeySelective(TFruit record);

    int updateByPrimaryKey(TFruit record);
}