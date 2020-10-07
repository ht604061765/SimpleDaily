package com.hunter.simple.daily.base.action.log.impl.service;

import com.hunter.base.common.utils.RandomUtils;
import com.hunter.base.common.vo.ActionLogVo;
import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.service.HunterBaseService;
import com.hunter.simple.daily.base.action.log.service.IActionLogService;
import com.hunter.simple.daily.base.action.log.service.dao.IActionLogDao;
import com.hunter.simple.daily.base.action.log.service.domain.po.ActionLog;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author Administrator
 * @date 2020/10/5
 **/
@Service
public class ActionLogService extends HunterBaseService implements IActionLogService {

    @Autowired
    private IActionLogDao actionLogDao;

    @Autowired
    private BaseServerFeign baseServerFeign;

    public void addActionLog(ActionLogVo vo){
        ActionLog actionLog = new ActionLog();
        BeanUtils.copyProperties(vo, actionLog);
        actionLog.setGid(RandomUtils.getUUID());
        actionLogDao.save(actionLog);
        System.out.println("调用成功！");
    }



}
