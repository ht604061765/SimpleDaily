package com.hunter.base.common.annotation.actionlog;

import com.hunter.base.common.enumerate.FunctionModuleEnum;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @date 2020/10/3
 **/
@Inherited
@Retention(RetentionPolicy.RUNTIME) // 生命周期一直存在
@Target(ElementType.METHOD)
@Documented
public @interface ActionLog {

    /**
     * 模块分类
     */
    FunctionModuleEnum module() default FunctionModuleEnum.DEFAULT;

    /**
     * 接口描述
     */
    String description() default "no description";


}
