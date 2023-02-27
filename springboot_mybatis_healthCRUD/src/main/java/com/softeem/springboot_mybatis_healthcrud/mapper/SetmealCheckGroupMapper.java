package com.softeem.springboot_mybatis_healthcrud.mapper;

import com.softeem.springboot_mybatis_healthcrud.model.SetmealCheckGroupKey;

public interface SetmealCheckGroupMapper {
    int deleteByPrimaryKey(SetmealCheckGroupKey key);

    int insert(SetmealCheckGroupKey record);

    int insertSelective(SetmealCheckGroupKey record);
}