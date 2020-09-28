package com.hunter.base.common.vo;

/**
 * @author Administrator
 * @date 2020/9/27
 **/
public class CommonResult {

    private int code = 200;

    private Object data;

    private String msg;

    public CommonResult(Object data){
        setData(data);
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
