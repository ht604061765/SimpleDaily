package com.hunter.simple.daily.weight.record.impl.controller;

import com.hunter.base.common.controller.HunterBaseController;
import com.hunter.simple.daily.weight.record.service.IWeightRecordService;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@RestController
@RequestMapping("/weight/record")
public class WeightRecordController extends HunterBaseController<IWeightRecordService> {

    @PostMapping("/addWeightRecord")
    public WeightRecordVo addWeightRecord(WeightRecordVo vo){
        return getService().addWeightRecord(vo);
    }
}
