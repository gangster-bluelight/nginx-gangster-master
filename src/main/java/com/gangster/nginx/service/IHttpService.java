package com.gangster.nginx.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gangster.nginx.entity.Http;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
public interface IHttpService extends IService<Http> {
    /**
     * 查询所有Http信息
     * @return list s
     */
    List<Http> findAllHttps();

    /**
     * 根据指定ID查询Http
     * @param httpId HttpID
     * @return http 
     */
    Http findHttpById(Long httpId);

    /**
     * 添加Http
     * @param http Http
     * @return Http主键ID
     */
    Long insertHttp(Http http);

    /**
     * 修改Http信息
     * @param http Http信息
     * @return true|false
     */
    Boolean updateHttpById(Http http);

    /**
     * 根据指定ID删除Http
     * @param httpId HttpID
     * @return true|false
     */
    Boolean deleteHttpById(Long httpId);
}
