package com.atguigu.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.atguigu.gulimall.product.dao")
@SpringBootApplication
public class GulimallPoductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallPoductApplication.class, args);
    }

}
