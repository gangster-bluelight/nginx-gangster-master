package com.gangster.nginx.resp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gangster.nginx.annotation.NotResponseBody;
import com.gangster.nginx.lang.Result;
import org.jetbrains.annotations.NotNull;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author neo-w7
 * Date: 2022-08-07
 * Description:
 */
@RestControllerAdvice(basePackages = {"com.gangster.nginx"})
public class ControllerUniteResp implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter methodParameter, @NotNull Class<? extends HttpMessageConverter<?>> aClass) {
        // response是ResultVo类型，或者注释了NotControllerResponseAdvice都不进行包装
        return !(methodParameter.getParameterType().isAssignableFrom(Result.class) || methodParameter.hasMethodAnnotation(NotResponseBody.class));
    }

    @Override
    public Object beforeBodyWrite(Object data,
                                  MethodParameter returnType,
                                  @NotNull MediaType mediaType,
                                  @NotNull Class<? extends HttpMessageConverter<?>> aClass,
                                  @NotNull ServerHttpRequest request,
                                  @NotNull ServerHttpResponse response) {
        // String类型不能直接包装
        if (returnType.getGenericParameterType().equals(String.class)) {
            try {
                ObjectMapper objectMapper = new ObjectMapper();
                // 将数据包装在ResultVo里后转换为json串进行返回
                return objectMapper.writeValueAsString(Result.success(data));
            } catch (JsonProcessingException e) {
                throw new IllegalStateException("未知异常");
            }
        }
        // 否则直接包装成Result返回
        return Result.success(data);
    }
}
