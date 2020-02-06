package com.duyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.duyi.mapper")//写这个了，就不用在dao上写@Mapper注解了
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
