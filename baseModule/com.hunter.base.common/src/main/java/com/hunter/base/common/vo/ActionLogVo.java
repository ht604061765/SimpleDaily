package com.hunter.base.common.vo;

import com.hunter.base.common.vo.HunterBaseVo;
import lombok.Data;

/**
 * @author Administrator
 * @date 2020/8/28
 **/
@Data
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
}
