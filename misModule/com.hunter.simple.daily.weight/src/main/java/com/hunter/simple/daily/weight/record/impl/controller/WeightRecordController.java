package com.hunter.simple.daily.weight.record.impl.controller;

import com.hunter.base.common.controller.HunterBaseController;
import com.hunter.base.common.vo.CommonResult;
import com.hunter.simple.daily.weight.record.service.IWeightRecordService;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@CrossOrigin
@RestController
@RequestMapping("/weight/record")
public class WeightRecordController extends HunterBaseController<IWeightRecordService> {

    @PostMapping("/addWeightRecord")
    public WeightRecordVo addWeightRecord(@RequestBody WeightRecordVo vo){
        return getService().addWeightRecord(vo);
    }

    @PostMapping("/getWeightList")
    public CommonResult getWeightList(){
        return new CommonResult(getService().getWeightList());
    }
}
