package com.hunter.simple.daily.weight;

import com.ygsoft.esc.cwjy.framework.FrameworkVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class BaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaseApplication.class, args);
        FrameworkVo frameworkVo = new FrameworkVo();
        System.out.println("======base应用启动完成======");
    }

}
