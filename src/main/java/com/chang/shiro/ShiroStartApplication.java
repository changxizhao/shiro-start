package com.chang.shiro;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.chang.shiro.mapper"})
public class ShiroStartApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShiroStartApplication.class, args);
    }

}
