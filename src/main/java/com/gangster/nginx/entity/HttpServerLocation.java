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
@TableName("http_server_location")
public class HttpServerLocation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 所属反向代理serverId
     */
    private Long httpServerId;

    /**
     * 控路径 例:/
     */
    private String path;

    /**
     * 代理类型 0:动态代理(默认) 1:静态代理 2:负载均衡 3:空白代理
     */
    private Integer type;

    private String locationParamJson;

    /**
     * 动态代理目标 (例:http://10.10.10.1:8080/)
     */
    private String value;

    /**
     * 代理负载协议,http or https
     */
    private String proxyPassSchema;

    /**
     * 代理负载均衡upstream的名称
     */
    private String proxyPass;

    /**
     * 代理负载额外路径,默认为空
     */
    private String httpUpstreamPath;

    /**
     * 静态代理路径 (例:/home/www)
     */
    private String rootPath;

    /**
     * 静态代理默认页面 (例:index.html)
     */
    private String rootPage;

    /**
     * 静态代理类型 root:根路径模式 alias:别名模式
     */
    private String rootType;

    /**
     * 是否携带Host参数 0否 1是(默认)
     */
    private Integer header;

    /**
     * 是否开启websocket支持 0否(默认) 1是
     */
    private Integer websocket;

    private String desc;


}
