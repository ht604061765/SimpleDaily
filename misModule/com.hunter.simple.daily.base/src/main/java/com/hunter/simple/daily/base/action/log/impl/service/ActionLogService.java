package com.hunter.simple.daily.base.action.log.impl.service;

import com.alibaba.fastjson.JSON;
import com.hunter.base.common.utils.RandomUtils;
import com.hunter.base.common.vo.ActionLogVo;
import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.service.HunterBaseService;
import com.hunter.simple.daily.base.action.log.service.IActionLogService;
import com.hunter.simple.daily.base.action.log.service.dao.IActionLogDao;
import com.hunter.simple.daily.base.action.log.service.domain.po.ActionLog;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
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
        actionLog.setCreateTime(System.currentTimeMillis());
        actionLog.setGid(RandomUtils.getUUID());
        actionLogDao.save(actionLog);
    }

    @KafkaListener(topics = "${spring.kafka.topic}")
    public void listenKafkaMsg(ConsumerRecord<?, String> record) {
        // 生成一条新数据
        ActionLog actionLog = JSON.parseObject(record.value(), ActionLog.class);
        // 设置初始属性
        actionLog.setCreateTime(System.currentTimeMillis());
        actionLog.setGid(RandomUtils.getUUID());
        // 保存
        actionLogDao.save(actionLog);
    }



}
