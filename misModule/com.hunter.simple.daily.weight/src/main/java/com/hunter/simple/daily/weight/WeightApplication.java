package com.hunter.simple.daily.weight;

import com.hunter.base.common.utils.StringUtils;
import com.hunter.base.common.vo.RemoveBlankTypeEnum;
import com.ygsoft.esc.cwjy.framework.FrameworkVo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class WeightApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeightApplication.class, args);
        FrameworkVo frameworkVo = new FrameworkVo();
        String aaa = StringUtils.removeBlank("   asdg   ", RemoveBlankTypeEnum.ALL);
        System.out.println("======体重应用启动完成======");
    }

}
