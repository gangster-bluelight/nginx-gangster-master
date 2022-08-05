package com.gangster.nginx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gangster.nginx.entity.HttpUpstream;

import java.util.List;

/**
 * <p>
 *  类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
public interface IHttpUpstreamService extends IService<HttpUpstream> {
    /**
     * 查询所有负载组信息
     * @return list upstreams
     */
    List<HttpUpstream> findAllHttpUpstreams();

    /**
     * 根据指定ID查询负载组
     * @param httpUpstreamId 负载组ID
     * @return http upstream
     */
    HttpUpstream findHttpUpstreamById(Long httpUpstreamId);

    /**
     * 添加负载组
     * @param httpUpstream 负载组
     * @return 负载组主键ID
     */
    Long insertHttpUpstream(HttpUpstream httpUpstream);

    /**
     * 修改负载组信息
     * @param httpUpstream 负载组信息
     * @return true|false
     */
    Boolean updateHttpUpstreamById(HttpUpstream httpUpstream);

    /**
     * 根据指定ID删除负载组
     * @param httpUpstreamId 负载组ID
     * @return true|false
     */
    Boolean deleteHttpUpstreamById(Long httpUpstreamId);
}
