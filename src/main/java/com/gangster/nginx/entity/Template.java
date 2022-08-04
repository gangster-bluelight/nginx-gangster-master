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
public class Template implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Long id;

    private String name;

    /**
     * 默认配置 "" "server" "server1" "server2" "location" "upstream"
     */
    private String def;


}
