package com.hunter.simple.daily.jobLog.record.service.domain.vo;

import com.hunter.base.common.vo.HunterBaseVo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class JobLogRecordVo extends HunterBaseVo {

    /**
     * 类别
     */
    private String type;

    /**
     * 类别名称
     */
    private String typeName;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 用户Id
     */
    private String userGid;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 记录描述
     */
    private String description;

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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
