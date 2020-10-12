package com.hunter.simple.daily.weight.record.service.domain.po;

import com.hunter.base.common.po.HunterBasePo;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Entity
@Table(name = "T_WEIGHT_RECORD")
public class WeightRecord extends HunterBasePo {

    /**
     * 体重
     */
    private BigDecimal weight;

    /**
     * 描述
     */
    private String remark;

    /**
     * 创建时间
     */
    private Long createTime;

    /**
     * 创建人
     */
    private String createUserGid;

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserGid() {
        return createUserGid;
    }

    public void setCreateUserGid(String createUserGid) {
        this.createUserGid = createUserGid;
    }
}
