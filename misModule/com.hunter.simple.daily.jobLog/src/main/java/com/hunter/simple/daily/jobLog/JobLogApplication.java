package com.hunter.simple.daily.jobLog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hunter"})
@EnableFeignClients(basePackages = {"com.hunter"})
@ServletComponentScan
@SpringBootApplication
@EnableEurekaClient
public class JobLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobLogApplication.class, args);
    }

}
