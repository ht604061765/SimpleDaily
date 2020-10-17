package com.hunter.simple.daily.test.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hunter.simple.daily.test.service.domain.entity.TestPo;
import com.hunter.simple.daily.test.service.domain.vo.TestVo;

import java.util.List;

public interface ITestService extends IService<TestPo>{

    List<TestVo> findAll();

    TestVo save(TestVo vo);

}
