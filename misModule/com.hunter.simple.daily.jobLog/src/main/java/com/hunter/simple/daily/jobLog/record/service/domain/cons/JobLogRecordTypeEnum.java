package com.hunter.simple.daily.jobLog.record.service.domain.cons;

/**
 * 数据状态.
 * @author hantao
 * @date 2020/08/19
 */
public enum JobLogRecordTypeEnum {

    ABOUT_LIFE("生活相关"),

    ABOUT_JOB("工作相关"),

    DEFAULT("无");

    private String name;

    JobLogRecordTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
