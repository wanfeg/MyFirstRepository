package com.softeem.springboot_mybatis_healthcrud.model;

import com.softeem.springboot_mybatis_healthcrud.mapper.SetmealMapper;

import java.util.List;

public class Setmeal {
    private Integer id;

    private String name;

    private String code;

    private String helpcode;

    private String sex;

    private String age;

    private Float price;

    private String remark;

    private String attention;

    private String img;

    private List<CheckGroup> checkGroups;//体检套餐对应的检查组，多对多关系

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getHelpcode() {
        return helpcode;
    }

    public void setHelpcode(String helpcode) {
        this.helpcode = helpcode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<CheckGroup> getCheckGroups() {
        return checkGroups;
    }

    public void setCheckGroups(List<CheckGroup> checkGroups) {
        this.checkGroups = checkGroups;
    }

    @Override
    public String toString() {
        return "Setmeal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", helpcode='" + helpcode + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", price=" + price +
                ", remark='" + remark + '\'' +
                ", attention='" + attention + '\'' +
                ", img='" + img + '\'' +
                ", checkGroups=" + checkGroups +
                '}';
    }

}