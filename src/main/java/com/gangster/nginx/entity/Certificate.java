package com.gangster.nginx.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
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
public class Certificate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 域名
     */
    private String domain;

    /**
     * pem文件路径
     */
    private String pem;

    /**
     * key文件路径
     */
    private String key;

    /**
     * 获取方式 0 申请证书 1 手动上传 2 DNS验证
     */
    private String type;

    /**
     * 加密方式 'RAS' 'ECC'
     */
    private String encryption;

    /**
     * 创建时间
     */
    private LocalDateTime creatdTime;

    /**
     * 签发时间戳
     */
    private Long makeTime;

    /**
     * 到期时间戳
     */
    private Long endTime;

    /**
     * 是否自动续签 0否 1是
     */
    private Integer autoRenew;

    /**
     * dns提供商 ali:阿里云  dp:腾讯云  cf:Cloudflare  gd:Godaddy
     */
    private String dnsType;

    /**
     * dpKey(腾讯云需要的参数)
     */
    private String dpId;

    /**
     * dpKey(腾讯云需要的参数)
     */
    private String dpKey;

    /**
     * aliSecret(阿里云需要的参数) 
     */
    private String aliKey;

    /**
     * aliSecret(阿里云需要的参数)
     */
    private String aliSecrest;

    /**
     * cfKey(Cloudflare需要的参数)
     */
    private String cfEmail;

    /**
     * cfKey(Cloudflare需要的参数)
     */
    private String cfKey;

    /**
     * gdSecret(Godaddy需要的参数)
     */
    private String gdKey;

    /**
     * gdSecret(Godaddy需要的参数)
     */
    private String gdSecret;

    /**
     * hwProjectID(华为云需要的参数)
     */
    private String hwUsername;

    /**
     * hwProjectID(华为云需要的参数)
     */
    private String hwPassword;

    /**
     * hwProjectID(华为云需要的参数)
     */
    private String hwProjectId;

    /**
     * hwProjectID(华为云需要的参数)
     */
    private String hwDomainName;


}
