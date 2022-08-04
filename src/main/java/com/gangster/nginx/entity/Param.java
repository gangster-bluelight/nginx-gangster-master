package com.gangster.nginx.entity;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

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
public class Param implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long httpServerId;

    private Long httpServerLocationId;

    private Long httpUpstreamId;

    private Long templateId;

    /**
     * 参数名
     */
    private String name;

    /**
     * 参数值
     */
    private String value;

    private String templateValue;

    private String templateName;


}
