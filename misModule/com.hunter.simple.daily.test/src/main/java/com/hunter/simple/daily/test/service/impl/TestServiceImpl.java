package com.hunter.simple.daily.test.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hunter.simple.daily.test.service.ITestService;
import com.hunter.simple.daily.test.service.dao.TestMapper;
import com.hunter.simple.daily.test.service.domain.entity.TestPo;
import com.hunter.simple.daily.test.service.domain.vo.TestVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, TestPo> implements ITestService {

    @Override
    public List<TestVo> findAll() {
        List<TestVo> result = new ArrayList<>();
        List<TestPo> testPos = getBaseMapper().findAll();
        if(!CollectionUtils.isEmpty(testPos)){
            testPos.forEach(testPo -> {
                TestVo vo = new TestVo();
                BeanUtils.copyProperties(testPo, vo);
                result.add(vo);
            });
        }
        return result;
    }

    @Override
    public TestVo save(TestVo vo) {
        TestPo po = new TestPo();
        BeanUtils.copyProperties(vo, po);
        save(po);
        return vo;
    }
}
