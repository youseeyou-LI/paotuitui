package com.guoshuai.spring.boot;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.annotation.ApplicationScope;

@SpringBootApplication
@MapperScan("com.guoshuai.spring.boot.mapper")

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);

    }
}