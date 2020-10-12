package com.hunter.simple.daily.jobLog.record.service.domain.vo;

/**
 * @author Administrator
 * @date 2020/9/28
 **/
public class JobLogRecordParamVo {

    private Long startTime;

    private Long endTime;

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }
}
