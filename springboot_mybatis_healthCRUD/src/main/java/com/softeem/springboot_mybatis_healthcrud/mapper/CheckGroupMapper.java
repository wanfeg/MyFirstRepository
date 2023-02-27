package com.softeem.springboot_mybatis_healthcrud.mapper;

import com.softeem.springboot_mybatis_healthcrud.model.CheckGroup;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckGroup record);

    int insertSelective(CheckGroup record);

    CheckGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckGroup record);

    int updateByPrimaryKey(CheckGroup record);

    List<CheckGroup> findCheckGroupById(@Param("id") Integer setmealId);
}