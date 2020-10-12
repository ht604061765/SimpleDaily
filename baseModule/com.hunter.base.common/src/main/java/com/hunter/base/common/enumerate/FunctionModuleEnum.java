package com.hunter.base.common.enumerate;

/**
 * 数据状态.
 * @author hantao
 * @date 2020/08/19
 */
public enum FunctionModuleEnum {

    DEFAULT("DEFAULT"),

    WEIGHT_MANAGE("WEIGHT_MANAGE"),

    JOB_LOG("JOB_LOG");

    private String name;

    FunctionModuleEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
