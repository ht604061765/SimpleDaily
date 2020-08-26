package com.hunter.base.framework.annotation.duplicatesubmit;

import java.lang.annotation.*;

/**
 * @description 防止表单重复提交注解
 * @author hantao
 * @date 2020/8/25
 **/
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DuplicateSubmit {

    /**
     * 保存重复提交标记 默认为需要保存
     **/
    boolean save() default true;
}
