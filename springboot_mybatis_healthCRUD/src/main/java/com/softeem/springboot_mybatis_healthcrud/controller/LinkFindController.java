package com.softeem.springboot_mybatis_healthcrud.controller;


import com.softeem.springboot_mybatis_healthcrud.mapper.SetmealMapper;
import com.softeem.springboot_mybatis_healthcrud.model.Setmeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class LinkFindController {

    @Resource
    private SetmealMapper setmealMapper ;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        ArrayList list = new ArrayList();
        List<Setmeal> setmeals = setmealMapper.findAll();
        for (Setmeal setmeal : setmeals) {
            Setmeal setmealById = setmealMapper.findSetmealById(setmeal.getId());
            list.add(setmealById);
        }
        System.out.println("list = " + list);
        model.addAttribute("setmealList",list);
        return "findAll";
    }
}
