//package com.hunter.simple.daily.base.action;
//
//import com.hunter.base.common.annotation.actionlog.ActionLog;
//import com.hunter.base.common.feign.BaseServerFeign;
//import com.hunter.base.common.vo.ActionLogVo;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
///**
// * @author Hunter
// * @date 2020/10/3
// **/
//@Aspect
//@Service
//public class ActionLogAspect {
//
//    @Autowired
//    private BaseServerFeign baseServerFeign;
//    /**
//     * 指定作用范围
//     */
//    @Pointcut("@annotation(com.hunter.base.common.annotation.actionlog.ActionLog)")
//    public void pointcut() {
//    }
//
//    /**
//     * 接口执行前拦截
//     */
//    @Before("pointcut() && @annotation(actionLog)")
//    public void before(final JoinPoint joinPoint, ActionLog actionLog) {
//        ActionLogVo logVo = new ActionLogVo();
//        System.out.println("方法执行前拦截");
//        if(!Objects.isNull(actionLog)){
//            System.out.println(actionLog.description());
//            logVo.setDescription(actionLog.description());
//        }
//        System.out.println("调用日志存储接口 start");
//        baseServerFeign.addActionLog(logVo);
//        System.out.println("调用日志存储接口 end");
//    }
//
//    /**
//     * 接口返回后执行
//     */
//    @AfterReturning("pointcut() && @annotation(actionLog)")
//    public void afterReturning(final JoinPoint joinPoint, ActionLog actionLog) {
//        System.out.println("接口返回后执行");
//        if(!Objects.isNull(actionLog)){
//            System.out.println(actionLog.description());
//        }
//    }
//}
