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
@TableName("http_server")
public class HttpServer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 监听域名
     */
    private String serverName;

    /**
     * 监听ip端口 (格式 ip:port或port)
     */
    private Integer listen;

    /**
     * 是否为默认server 0否(默认) 1是
     */
    private Integer def;

    /**
     * 是否http跳转https 0否(默认) 1是
     */
    private Integer rewrite;

    /**
     * http跳转https监听ip端口,默认为80 (格式 ip:port或port)
     */
    private Integer rewriteListen;

    /**
     * 是否开启ssl 0否(默认) 1是
     */
    private Integer ssl;

    /**
     * 是否开启http2 0否(默认) 1是
     */
    private Integer http2;

    /**
     * 是否开启proxy_protocol 0否(默认) 1是
     */
    private Integer proxyProtocol;

    /**
     * ssl证书pem文件路径
     */
    private String pem;

    /**
     * ssl证书key文件路径
     */
    private String key;

    /**
     * 代理类型 0:http(默认) 1:tcp 2:udp
     */
    private Integer proxyType;

    /**
     * 代理upstream的id
     */
    private Long proxyHttpUpstreamId;

    private String pemStr;

    private String keyStr;

    /**
     * 是否启用 true:启用(默认) false:禁用
     */
    private String enable;

    /**
     * 描述
     */
    private String desc;

    /**
     * 加密协议 (默认:TLSv1 TLSv1.1 TLSv1.2 TLSv1.3)
     */
    private String protocols;

    /**
     * 使用的password文件Id
     */
    private Long passwordId;

    private Long seq;


}
