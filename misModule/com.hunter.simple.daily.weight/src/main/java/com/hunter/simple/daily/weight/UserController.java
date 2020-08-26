package com.hunter.simple.daily.weight;

import com.hunter.base.framework.DuplicateSubmitToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2020/8/25
 **/

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/test")
    @DuplicateSubmitToken
    public Map<String, Object> test (HttpServletRequest request){
        System.out.println("===开始执行方法===");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Map<String, Object> map = new HashMap<>(16);
        request.getSession().setAttribute("request Url", request.getRequestURL());
        map.put("request Url", request.getRequestURL());
        System.out.println("===执行结束===");

        return map;
    }

}
