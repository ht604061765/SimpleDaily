package com.hunter.base.common.annotation.actionlog;

import com.alibaba.fastjson.JSON;
import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.vo.ActionLogVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * @author Hunter
 * @date 2020/10/3
 **/
@Aspect
@Service
public class ActionLogAspect {

    @Value("${spring.kafka.topic}")
    private String TOPIC;

    @Autowired
    private BaseServerFeign baseServerFeign;

    @Resource
    private KafkaTemplate<String, String> kafkaTemplate;

    /**
     * 指定生效域
     */
    @Pointcut("@annotation(com.hunter.base.common.annotation.actionlog.ActionLog)")
    public void pointcut() {
    }

    /**
     * 接口执行前拦截
     */
    @Before("pointcut() && @annotation(actionLog)")
    public void before(final JoinPoint joinPoint, ActionLog actionLog) {
//        ActionLogVo logVo = new ActionLogVo();
//        if(!Objects.isNull(actionLog)){
//            logVo.setDescription(actionLog.description());
//            logVo.setModule(actionLog.module());
//        }
//        // 存操作日志
//        baseServerFeign.addActionLog(logVo);
    }

    /**
     * 接口返回后执行
     */
    @AfterReturning("pointcut() && @annotation(actionLog)")
    public void afterReturning(final JoinPoint joinPoint, ActionLog actionLog) {
        ActionLogVo logVo = new ActionLogVo();
        // 方法名称
        logVo.setMethodName(joinPoint.getSignature().getName());
        if(!Objects.isNull(actionLog)){
            logVo.setDescription(actionLog.description());
            logVo.setModule(actionLog.module());
        }
        // kafka 调用
        String msg = JSON.toJSONString(logVo) ;
        // 这里Topic如果不存在，会自动创建
        kafkaTemplate.send(TOPIC, msg);

    }
}
