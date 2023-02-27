package com.softeem.springboot_mybatis_healthcrud.mapper;

import com.softeem.springboot_mybatis_healthcrud.model.CheckItem;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CheckItemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckItem record);

    int insertSelective(CheckItem record);

    CheckItem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckItem record);

    int updateByPrimaryKey(CheckItem record);

    List<CheckItem> findCheckItemById(@Param("id")Integer groupid);
}