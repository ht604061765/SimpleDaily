package com.hunter.base.common.vo;

import lombok.Data;

import javax.persistence.Id;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Data
public class HunterBaseVo {

    /**
     * 主键Gid
     */
    @Id
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
