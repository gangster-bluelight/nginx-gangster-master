package com.gangster.nginx.lang;

import lombok.Getter;

/**
 * @author blue-light
 * Date: 2022-08-04
 * Description:
 */
@Getter
public enum RespCode {
    /**
     * 成功
     */
    SUCCESS(0, "success"),
    BAD_REQUEST(400, "请求异常"),
    UNAUTHORIZED(401, "请求异常"),
    FORBIDDEN(403, "请求异常"),
    NOT_FOUND(404, "不存在"),
    METHOD_NOT_ALLOWED(405,"请求方式错误"),
    REQUEST_TIMEOUT(408,"请求超时"),
    FAILURE(500, "系统异常");

    /**
     * 状态码
     */
    private final Integer code;
    /**
     * 响应消息
     */
    private final String message;

    RespCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
