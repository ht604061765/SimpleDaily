package com.hunter.simple.daily.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hunter"})
@ServletComponentScan
@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
        System.out.println("======base应用启动完成======");
    }

}
