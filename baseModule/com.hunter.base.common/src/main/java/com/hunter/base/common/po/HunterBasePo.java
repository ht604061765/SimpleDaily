package com.hunter.base.common.po;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2020/8/28
 **/

@MappedSuperclass
public class HunterBasePo implements Serializable {

    /**
     * 主键Gid
     */
    @Id
    @Column(name = "GID", length = 36)
    private String gid;

    /**
     * 租户GID
     */
    private String tenantGid;

    /**
     * 组织GID
     */
    private String orgGid;

    /**
     * 组织code
     */
    private String orgCode;

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getTenantGid() {
        return tenantGid;
    }

    public void setTenantGid(String tenantGid) {
        this.tenantGid = tenantGid;
    }

    public String getOrgGid() {
        return orgGid;
    }

    public void setOrgGid(String orgGid) {
        this.orgGid = orgGid;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }
}
