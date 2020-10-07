package com.hunter.simple.daily.weight.record.impl.controller;

import com.hunter.base.common.annotation.actionlog.ActionLog;
import com.hunter.base.common.controller.HunterBaseController;
import com.hunter.base.common.vo.CommonResult;
import com.hunter.simple.daily.weight.record.service.IWeightRecordService;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightManageParamVo;
import com.hunter.simple.daily.weight.record.service.domain.vo.WeightRecordVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@CrossOrigin
@RestController
@RequestMapping("/weight/record")
public class WeightRecordController extends HunterBaseController<IWeightRecordService> {

    @ActionLog(description = "新增体重数据")
    @PostMapping("/addWeightRecord")
    public CommonResult addWeightRecord(@RequestBody WeightRecordVo vo){
        return CommonResult.SUCCESS(getService().addWeightRecord(vo));
    }

    @ActionLog(description = "获取体重列表")
    @PostMapping("/getWeightList")
    public CommonResult getWeightList(@RequestBody WeightManageParamVo paramVo){
        return CommonResult.SUCCESS(getService().getWeightList(paramVo));
    }
}
