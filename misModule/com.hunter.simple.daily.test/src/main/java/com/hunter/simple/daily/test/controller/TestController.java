package com.hunter.simple.daily.test.controller;

import com.hunter.simple.daily.test.common.OgBaseController;
import com.hunter.simple.daily.test.service.ITestService;
import com.hunter.simple.daily.test.service.domain.vo.TestVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController extends OgBaseController<ITestService> {

    @GetMapping("/findAll")
    public List<TestVo> findAllUser(){
        return getService().findAll();
    }

    @PostMapping("/save")
    public TestVo findAllUser(TestVo vo){
        return getService().save(vo);
    }
}
