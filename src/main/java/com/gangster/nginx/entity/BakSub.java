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
@TableName("bak_sub")
public class BakSub implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private Long bakId;

    private String name;

    private String content;


}
