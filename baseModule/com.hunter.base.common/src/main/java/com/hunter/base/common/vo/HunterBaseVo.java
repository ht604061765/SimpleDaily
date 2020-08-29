package com.hunter.base.common.vo;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Data
@MappedSuperclass
public class HunterBaseVo implements Serializable {

    /**
     * 主键Gid
     */
    private String gid;

    /**
     * 组织GID
     */
    private String orgGid;

    /**
     * 组织名称
     */
    private String orgName;

    /**
     * 组织code
     */
    private String orgCode;

    /**
     * 租户GID
     */
    private String tenantGid;

}
