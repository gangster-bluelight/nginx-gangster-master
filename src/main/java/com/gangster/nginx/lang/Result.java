package com.gangster.nginx.lang;

import lombok.Data;

/**
 * @author blue-light
 * Date: 2022-08-04
 * Description:
 */
@Data
public class Result {
    /**
     * 状态码
     */
    private Integer code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应体数据
     */
    private Object data;

    public Result(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(RespCode resp, Object data) {
        this.code = resp.getCode();
        this.message = resp.getMessage();
        this.data = data;
    }

    public static Result success(Object data) {
        return new Result(RespCode.SUCCESS, data);
    }

    public static Result failure(String message) {
        return new Result(-1, message, null);
    }

    public static Result failure(RespCode resp) {
        return new Result(resp, null);
    }


}
