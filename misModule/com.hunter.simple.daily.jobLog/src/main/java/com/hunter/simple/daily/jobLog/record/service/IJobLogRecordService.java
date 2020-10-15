package com.hunter.simple.daily.jobLog.record.service;

import com.hunter.base.common.service.IHunterBaseService;
import com.hunter.simple.daily.jobLog.record.service.domain.po.JobLogRecord;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordParamVo;
import com.hunter.simple.daily.jobLog.record.service.domain.vo.JobLogRecordVo;

import java.util.List;

public interface IJobLogRecordService extends IHunterBaseService {

    /**
     * 新增工作日志
     * @param vo 工作日志Vo
     * @return 保存后的Vo
     */
    JobLogRecordVo addJobLogRecord(JobLogRecordVo vo);

    /**
     * 获取工作日志列表
     * @param paramVo 查询参数Vo
     * @return 工作日志列表
     */
    List<JobLogRecordVo> getJobLogRecordList(JobLogRecordParamVo paramVo);

    /**
     * 删除工作日志
     * @param gid 数据Gid
     * @return true：删除成功，false：删除失败
     */
    Boolean deleteRecordBygGid(String gid);

    /**
     * 查询一条工作日志数据
     * @param gid 数据Gid
     * @return 工作日志数据
     */
    JobLogRecordVo findByGid(String gid);
}
