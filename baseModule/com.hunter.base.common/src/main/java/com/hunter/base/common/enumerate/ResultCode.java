package com.hunter.base.common.enumerate;

/**
 * 响应码枚举，参考HTTP状态码的语义
 * @author Administrator
 * @date 2020/10/6
 **/
public enum ResultCode {

    SUCCESS(200, "成功"),

    FAIL(400, "失败"),

    UNAUTHORIZED(401,"未认证（签名错误）"),

    NOT_FOUND(404,"接口不存在"),

    INTERNAL_SERVER_ERROR(500,"服务器内部错误");

    /**
     * 编码
     */
    public int code;

    /**
     * 提示信息
     */
    public String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
