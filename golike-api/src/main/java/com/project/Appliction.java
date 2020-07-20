package com.project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;


/**
 * @author nameM
 */
@SpringBootApplication
@MapperScan(basePackages = "com.project.mapper")
public class Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Appliction.class);
    }
}
