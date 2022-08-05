package com.gangster.nginx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gangster.nginx.entity.HttpServerLocation;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
public interface IHttpServerLocationService extends IService<HttpServerLocation> {
    /**
     * 查询所有上下文信息
     * @return list ServerLocations
     */
    List<HttpServerLocation> findAllHttpServerLocations();

    /**
     * 根据指定ID查询上下文
     * @param httpServerLocationId 上下文ID
     * @return http ServerLocation
     */
    HttpServerLocation findHttpServerLocationById(Long httpServerLocationId);

    /**
     * 添加上下文
     * @param httpServerLocation 上下文
     * @return 上下文主键ID
     */
    Long insertHttpServerLocation(HttpServerLocation httpServerLocation);

    /**
     * 修改上下文信息
     * @param httpServerLocation 上下文信息
     * @return true|false
     */
    Boolean updateHttpServerLocationById(HttpServerLocation httpServerLocation);

    /**
     * 根据指定ID删除上下文
     * @param httpServerLocationId 上下文ID
     * @return true|false
     */
    Boolean deleteHttpServerLocationById(Long httpServerLocationId);
}
