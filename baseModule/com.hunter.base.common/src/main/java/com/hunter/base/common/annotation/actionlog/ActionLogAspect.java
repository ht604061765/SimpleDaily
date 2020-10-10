package com.hunter.base.common.annotation.actionlog;

import com.hunter.base.common.feign.BaseServerFeign;
import com.hunter.base.common.vo.ActionLogVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @author Hunter
 * @date 2020/10/3
 **/
@Aspect
@Service
public class ActionLogAspect {

    @Autowired
    private BaseServerFeign baseServerFeign;

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
        ActionLogVo logVo = new ActionLogVo();
        if(!Objects.isNull(actionLog)){
            logVo.setDescription(actionLog.description());
        }
        // 存操作日志
        baseServerFeign.addActionLog(logVo);
    }

    /**
     * 接口返回后执行
     */
    @AfterReturning("pointcut() && @annotation(actionLog)")
    public void afterReturning(final JoinPoint joinPoint, ActionLog actionLog) {

    }
}
