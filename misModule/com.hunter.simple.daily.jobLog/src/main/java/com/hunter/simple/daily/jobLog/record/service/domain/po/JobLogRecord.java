package com.hunter.simple.daily.jobLog.record.service.domain.po;

import com.hunter.base.common.po.HunterBasePo;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Entity
@Table(name = "T_JOB_LOG_RECORD")
public class JobLogRecord extends HunterBasePo {

    /**
     * 类别
     */
    private String type;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 用户Id
     */
    private String userGid;

    /**
     * 描述
     */
    private String description;

    @Enumerated(EnumType.STRING)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getUserGid() {
        return userGid;
    }

    public void setUserGid(String userGid) {
        this.userGid = userGid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
