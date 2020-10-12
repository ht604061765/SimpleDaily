package com.hunter.simple.daily.weight.record.service.domain.vo;

import com.hunter.base.common.vo.HunterBaseVo;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Data
public class WeightRecordVo extends HunterBaseVo {

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

    /**
     * 创建人名称
     */
    private String createUserName;
}
