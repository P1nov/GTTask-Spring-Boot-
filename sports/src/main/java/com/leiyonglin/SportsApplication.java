package com.leiyonglin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.leiyonglin.dao.*")
public class SportsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SportsApplication.class, args);
    }

}
