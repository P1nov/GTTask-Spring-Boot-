package com.leiyonglin.spb_design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class SpbDesignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpbDesignApplication.class, args);
    }

}
