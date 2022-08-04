package com.gangster.nginx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Remote implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 协议
     */
    private String protocol;

    private String ip;

    private Integer port;

    /**
     * 0:掉线，1：在线
     */
    private String ststus;

    private String creditKey;

    private String name;

    private String pass;

    private String version;

    private String system;

    private String desc;

    private Integer monitor;

    private Integer parentId;

    /**
     * 0:服务器，1：分组
     */
    private Integer type;

    /**
     * 0：未运行，1：在运行，2：未知
     */
    private Integer nginx;


}
