package com.gangster.nginx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gangster.nginx.entity.HttpUpstreamServer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
public interface IHttpUpstreamServerService extends IService<HttpUpstreamServer> {
    /**
     * 查询所有负载组服务信息
     * @return list upstream servers
     */
    public List<HttpUpstreamServer> findAllHttpUpstreamServers();

    /**
     * 根据指定ID查询负载组服务
     * @param httpUpstreamServerId 负载组服务ID
     * @return http upstream server
     */
    public HttpUpstreamServer findHttpUpstreamServerById(Long httpUpstreamServerId);

    /**
     * 添加负载组服务
     * @param httpUpstreamServer 负载组服务
     * @return 负载组服务主键ID
     */
    public Long insertHttpUpstreamServer(HttpUpstreamServer httpUpstreamServer);

    /**
     * 修改负载组服务信息
     * @param httpUpstreamServer 负载组服务信息
     * @return true|false
     */
    public Boolean updateHttpUpstreamServerById(HttpUpstreamServer httpUpstreamServer);

    /**
     * 根据指定ID删除负载组服务
     * @param httpUpstreamServerId 负载组服务ID
     * @return true|false
     */
    public Boolean deleteHttpUpstreamServerById(Long httpUpstreamServerId);
}
