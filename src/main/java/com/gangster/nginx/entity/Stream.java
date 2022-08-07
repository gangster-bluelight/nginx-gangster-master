package com.gangster.nginx.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
@Getter
@Setter
public class Stream implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数值
     */
    private String value;

    private Long seq;
}
