package com.gangster.nginx.annotation;

import java.lang.annotation.*;

/**
 * @author neo-w7
 * Date: 2022-08-07
 * Description:
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotResponseBody {
}
