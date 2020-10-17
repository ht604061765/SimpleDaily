package com.hunter.simple.daily.test.service.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hunter.simple.daily.test.service.domain.entity.TestPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TestMapper extends BaseMapper<TestPo> {

    @Select("SELECT * FROM T_TEST")
    List<TestPo> findAll();
}
