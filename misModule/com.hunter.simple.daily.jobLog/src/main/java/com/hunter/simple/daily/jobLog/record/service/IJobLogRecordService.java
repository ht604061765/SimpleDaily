package com.hunter.simple.daily.jobLog.record.service;

import com.hunter.base.common.service.IHunterBaseService;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordParamVo;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordVo;

import java.util.List;

public interface IJobLogRecordService extends IHunterBaseService {

    JobLogRecordVo addJobLogRecord(JobLogRecordVo vo);

    List<JobLogRecordVo> getJobLogRecordList(JobLogRecordParamVo paramVo);

    Boolean deleteRecordBygGid(String gid);
}
