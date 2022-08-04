package com.gangster.nginx.exception;

import com.gangster.nginx.lang.RespCode;
import com.gangster.nginx.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author blue-light
 * Date: 2022-08-04
 * Description:
 */
@Slf4j
@RestControllerAdvice
public class GlobalException {
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result doException() {
        return Result.failure(RespCode.FAILURE);
    }

    @ExceptionHandler(Throwable.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result doThrowable() {
        return Result.failure(RespCode.FAILURE);
    }

    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Result doRuntimeException(RuntimeException exception) {
        return Result.failure(exception.getMessage());
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result doMethodArgumentNotValidException(MethodArgumentNotValidException exception) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = exception.getBindingResult().getAllErrors().get(0);
        return Result.failure(objectError.getDefaultMessage());
    }
}
