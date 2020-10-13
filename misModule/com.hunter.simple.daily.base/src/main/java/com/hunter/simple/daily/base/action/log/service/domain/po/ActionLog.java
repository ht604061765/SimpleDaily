package com.hunter.simple.daily.base.action.log.service.domain.po;

import com.hunter.base.common.enumerate.FunctionModuleEnum;
import com.hunter.base.common.po.HunterBasePo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

/**
 * @author Administrator
 * @date 2020/10/5
 **/
@Entity
@Table(name = "T_ACTION_LOG")
public class ActionLog extends HunterBasePo {

    /**
     * 模块
     */
    @Enumerated(EnumType.STRING)
    private FunctionModuleEnum module;

    /**
     * 操作人
     */
    private String userGid;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 接口描述
     */
    private String description;

    /**
     * 接口名称
     */
    private String methodName;

    public String getUserGid() {
        return userGid;
    }

    public void setUserGid(String userGid) {
        this.userGid = userGid;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public FunctionModuleEnum getModule() {
        return module;
    }

    public void setModule(FunctionModuleEnum module) {
        this.module = module;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }
}
