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

    private BigDecimal weight;

    private String remark;

    private Long createTime;

    private String createUserGid;

    private String createUserName;
}
