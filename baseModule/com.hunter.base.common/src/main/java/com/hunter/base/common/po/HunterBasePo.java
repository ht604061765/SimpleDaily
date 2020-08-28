package com.hunter.base.common.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Data
public class HunterBasePo<ID extends Serializable>{

    /**
     * 主键Gid
     */
    private ID gid;

    /**
     * 组织GID
     */
    private String orgGid;

    /**
     * 组织code
     */
    private String orgCode;

    /**
     * 租户GID
     */
    private String tenantGid;

    @Column(
            name = "GID",
            length = 36
    )
    @Id
    public ID getGid() {
        return this.gid;
    }

    public void setGid(ID newgid) {
        this.gid = newgid;
    }

}
