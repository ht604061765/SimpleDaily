package com.hunter.simple.daily.base.action.log.impl.controller;

import com.hunter.base.common.vo.ActionLogVo;
import com.hunter.base.common.controller.HunterBaseController;
import com.hunter.base.common.vo.CommonResult;
import com.hunter.simple.daily.base.action.log.service.IActionLogService;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @date 2020/10/5
 **/
@RestController
@RequestMapping("/action/log")
public class ActionLogController extends HunterBaseController<IActionLogService> {

    @PostMapping("/addActionLog")
    public CommonResult addActionLog(@RequestBody ActionLogVo vo){
        getService().addActionLog(vo);
        return CommonResult.SUCCESS(null);
    }

}
