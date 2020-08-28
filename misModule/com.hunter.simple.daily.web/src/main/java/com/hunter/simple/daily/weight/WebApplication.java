package com.hunter.simple.daily.weight;

import com.hunter.base.common.utils.StringUtils;
import com.hunter.base.common.enumerate.RemoveBlankTypeEnum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.hunter"})
@ServletComponentScan
@SpringBootApplication
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
        String aaa = StringUtils.removeBlank("   asdg   ", RemoveBlankTypeEnum.ALL);
        System.out.println("======WebApplication启动完成======");
    }

}
