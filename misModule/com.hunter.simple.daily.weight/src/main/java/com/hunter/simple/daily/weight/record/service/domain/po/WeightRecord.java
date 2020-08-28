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
@Data
@Entity
@Table(name = "T_WEIGHT_RECORD")
public class WeightRecord extends HunterBasePo {

    private BigDecimal weight;

    private String remark;

    private Long createTime;

    private String createUserGid;
}
