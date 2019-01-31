package com.tao.dao;

import com.tao.pojo.db.SystemTask;
import com.tao.pojo.db.SystemTaskExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemTaskMapper {
    long countByExample(SystemTaskExample example);

    int deleteByExample(SystemTaskExample example);

    int deleteByPrimaryKey(String id);

    int insert(SystemTask record);

    int insertSelective(SystemTask record);

    List<SystemTask> selectByExample(SystemTaskExample example);

    SystemTask selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SystemTask record, @Param("example") SystemTaskExample example);

    int updateByExample(@Param("record") SystemTask record, @Param("example") SystemTaskExample example);

    int updateByPrimaryKeySelective(SystemTask record);

    int updateByPrimaryKey(SystemTask record);
}