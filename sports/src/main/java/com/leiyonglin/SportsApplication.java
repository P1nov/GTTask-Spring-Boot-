package com.leiyonglin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@MapperScan(basePackages = "com.leiyonglin.dao.*")
@RestController
public class SportsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SportsApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SportsApplication.class);
    }

    @RequestMapping("/")
    public String hello(){

        return "hello, friend";
    }
}
