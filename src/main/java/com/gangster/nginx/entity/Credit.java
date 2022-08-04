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
public class Credit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 远程调用的token
     */
    private String key;

    private String accountId;


}
