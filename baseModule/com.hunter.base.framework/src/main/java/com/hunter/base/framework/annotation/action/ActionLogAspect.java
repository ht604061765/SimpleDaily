package com.hunter.base.framework.annotation.action;

import com.hunter.base.framework.annotation.duplicatesubmit.DuplicateSubmit;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * @author Administrator
 * @date 2020/10/3
 **/
@Aspect
@Component
public class ActionLogAspect {

    /**
     * 指定作用范围
     */
    @Pointcut("@annotation(com.hunter.base.framework.annotation.action.ActionLog)")
    public void pointcut() {
    }

    /**
     * 接口执行前拦截
     */
    @Before("pointcut() && @annotation(actionLog)")
    public void before(final JoinPoint joinPoint, ActionLog actionLog) {
        System.out.println("方法执行前拦截");
        if(!Objects.isNull(actionLog)){
            System.out.println(actionLog.description());
        }
    }

    /**
     * 接口返回后执行
     */
    @AfterReturning("pointcut() && @annotation(actionLog)")
    public void afterReturning(final JoinPoint joinPoint, ActionLog actionLog) {
        System.out.println("接口返回后执行");
        if(!Objects.isNull(actionLog)){
            System.out.println(actionLog.description());
        }
    }
}
