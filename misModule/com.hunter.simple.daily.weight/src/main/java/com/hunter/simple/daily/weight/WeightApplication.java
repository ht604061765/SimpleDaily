package com.hunter.simple.daily.weight;

import com.hunter.base.common.utils.StringUtils;
import com.hunter.base.common.enumerate.RemoveBlankTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hunter"})
@ServletComponentScan
@SpringBootApplication
@EnableEurekaClient
public class WeightApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeightApplication.class, args);
        String aaa = StringUtils.removeBlank("   asdg   ", RemoveBlankTypeEnum.ALL);
        System.out.println("======体重应用启动完成======");
    }

}
