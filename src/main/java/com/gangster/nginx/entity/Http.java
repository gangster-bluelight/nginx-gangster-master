package com.gangster.nginx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
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
public class Http implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 参数名
     */
    @NotBlank(message = "名称不能为空")
    private String name;

    /**
     * 参数值
     */
    private String value;

    /**
     * 参数单位
     */
    private String unit;

    private Long seq;


}
