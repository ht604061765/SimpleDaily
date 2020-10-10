package com.hunter.base.common.vo;

import com.hunter.base.common.vo.HunterBaseVo;
import lombok.Data;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
public class ActionLogVo extends HunterBaseVo {

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
}
