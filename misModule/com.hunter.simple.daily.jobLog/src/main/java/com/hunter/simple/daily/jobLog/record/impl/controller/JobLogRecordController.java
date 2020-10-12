package com.hunter.simple.daily.jobLog.record.impl.controller;

import com.hunter.base.common.annotation.actionlog.ActionLog;
import com.hunter.base.common.controller.HunterBaseController;
import com.hunter.base.common.enumerate.FunctionModuleEnum;
import com.hunter.base.common.vo.CommonResult;
import com.hunter.simple.daily.jobLog.record.service.IJobLogRecordService;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordParamVo;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordVo;
import org.springframework.web.bind.annotation.*;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@CrossOrigin
@RestController
@RequestMapping("/record")
public class JobLogRecordController extends HunterBaseController<IJobLogRecordService> {

    @ActionLog(module = FunctionModuleEnum.JOB_LOG, description = "新增一条工作日志")
    @PostMapping("/addJobLogRecord")
    public CommonResult addJobLogRecord(@RequestBody JobLogRecordVo vo){
        return CommonResult.SUCCESS(getService().addJobLogRecord(vo));
    }

    @ActionLog(module = FunctionModuleEnum.JOB_LOG, description = "获取工作日志列表")
    @PostMapping("/getJobLogRecordList")
    public CommonResult getJobLogRecordList(@RequestBody JobLogRecordParamVo paramVo){
        return CommonResult.SUCCESS(getService().getJobLogRecordList(paramVo));
    }

}
