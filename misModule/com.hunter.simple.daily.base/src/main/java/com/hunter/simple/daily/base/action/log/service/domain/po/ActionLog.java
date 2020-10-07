package com.hunter.simple.daily.base.action.log.service.domain.po;

import com.hunter.base.common.po.HunterBasePo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Administrator
 * @date 2020/10/5
 **/
@Data
@Entity
@Table(name = "T_ACTION_LOG")
public class ActionLog extends HunterBasePo {

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



}
