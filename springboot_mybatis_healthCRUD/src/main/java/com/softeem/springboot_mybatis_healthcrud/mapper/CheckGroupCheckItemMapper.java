package com.softeem.springboot_mybatis_healthcrud.mapper;

import com.softeem.springboot_mybatis_healthcrud.model.CheckGroupCheckItemKey;

public interface CheckGroupCheckItemMapper {
    int deleteByPrimaryKey(CheckGroupCheckItemKey key);

    int insert(CheckGroupCheckItemKey record);

    int insertSelective(CheckGroupCheckItemKey record);
}