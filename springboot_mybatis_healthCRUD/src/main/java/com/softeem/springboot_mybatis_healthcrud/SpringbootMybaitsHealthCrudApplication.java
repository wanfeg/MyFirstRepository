package com.softeem.springboot_mybatis_healthcrud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.softeem.springboot_mybatis_healthcrud.mapper")
public class SpringbootMybaitsHealthCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybaitsHealthCrudApplication.class, args);
    }

}
