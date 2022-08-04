package com.gangster.nginx.entity;

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
@TableName("certificate_code")
public class CertificateCode implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 证书ID
     */
    private Long certificateId;

    private String domain;

    private String type;

    private String value;


}
