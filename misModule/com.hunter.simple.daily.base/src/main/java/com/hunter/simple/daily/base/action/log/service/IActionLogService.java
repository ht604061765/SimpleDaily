package com.hunter.simple.daily.base.action.log.service;

import com.hunter.base.common.vo.ActionLogVo;
import com.hunter.base.common.service.IHunterBaseService;

public interface IActionLogService extends IHunterBaseService {

    void addActionLog(ActionLogVo vo);

//    List<ActionLogVo> findActionLogList(ActionLogParamVo paramVo);

}
