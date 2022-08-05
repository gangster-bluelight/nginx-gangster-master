package com.gangster.nginx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gangster.nginx.entity.HttpServer;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
public interface IHttpServerService extends IService<HttpServer> {
    /**
     * 查询所有站点信息
     * @return list Servers
     */
    List<HttpServer> findAllHttpServers();

    /**
     * 根据指定ID查询站点
     * @param httpServerId 站点ID
     * @return http Server
     */
    HttpServer findHttpServerById(Long httpServerId);

    /**
     * 添加站点
     * @param httpServer 站点
     * @return 站点主键ID
     */
    Long insertHttpServer(HttpServer httpServer);

    /**
     * 修改站点信息
     * @param httpServer 站点信息
     * @return true|false
     */
    Boolean updateHttpServerById(HttpServer httpServer);

    /**
     * 根据指定ID删除站点
     * @param httpServerId 站点ID
     * @return true|false
     */
    Boolean deleteHttpServerById(Long httpServerId);
}
