package com.gangster.nginx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.io.Serial;
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

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO, value = "id")
    @NotEmpty(message = "ID不能为空", groups = {UpdateValidationGroup.class})
    private Long id;

    /**
     * 参数名
     */
    @NotBlank(message = "名称不能为空",groups = {UpdateValidationGroup.class, InsertValidationGroup.class})
    private String name;

    /**
     * 参数值
     */
    @NotBlank(message = "值不能为空",groups = {UpdateValidationGroup.class, InsertValidationGroup.class})
    private String value;

    /**
     * 参数单位
     */
    private String unit;

    private Long seq;
}