package com.hunter.base.framework.annotation.action;

import java.lang.annotation.*;

/**
 * @author Administrator
 * @date 2020/10/3
 **/
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface ActionLog {

    String description() default "no description";
}
