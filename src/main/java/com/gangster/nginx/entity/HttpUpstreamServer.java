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
@TableName("http_upstream_server")
public class HttpUpstreamServer implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 负载组节点IP、域名
     */
    private String server;

    /**
     * 负载组端口
     */
    private Integer port;

    /**
     * 权重
     */
    private Integer weight;

    /**
     * 失败等待时间
     */
    private Integer failTimeout;

    /**
     * 最大失败次数
     */
    private Integer maxFail;

    /**
     * 最大连接数
     */
    private Integer maxConn;

    /**
     * 状态策略（‘none’：默认【无】，down:停用，backup：备用）
     */
    private String status;

    private Integer monitorStatus;

    /**
     * 负载组的ID
     */
    private Long httpUpstreamId;


}
