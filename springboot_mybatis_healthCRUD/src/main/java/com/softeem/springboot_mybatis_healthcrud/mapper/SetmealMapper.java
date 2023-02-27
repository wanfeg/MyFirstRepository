package com.softeem.springboot_mybatis_healthcrud.mapper;

import com.softeem.springboot_mybatis_healthcrud.model.Setmeal;

import java.util.List;

public interface SetmealMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Setmeal record);

    int insertSelective(Setmeal record);

    Setmeal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Setmeal record);

    int updateByPrimaryKey(Setmeal record);

    Setmeal findSetmealById(Integer id);

    List<Setmeal> findAll();


}