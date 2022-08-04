package com.gangster.nginx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("http_upstream")
public class HttpUpstream implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 负载组名称
     */
    private String name;

    /**
     * 负载策略: '':无(默认) 'sticky':会话保持 'ip_hash':ip绑定 'least_conn':最少连接'least_time':最短时间
     */
    private String tactics;

    /**
     * 监控邮件通知 0:否(默认) 1:是
     */
    private Integer monitor;

    /**
     * 描述
     */
    private String desc;

    private Long seq;


}
