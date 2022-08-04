package com.gangster.nginx.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("opration_log")
public class OprationLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 操作时间
     */
    private LocalDateTime time;

    /**
     * 操作账户
     */
    private String account;

    /**
     * 客户端地址
     */
    private String address;

    /**
     * 操作状态（success：成功，failure：失败）
     */
    private String status;

    /**
     * 操作描述
     */
    private String desc;


}
