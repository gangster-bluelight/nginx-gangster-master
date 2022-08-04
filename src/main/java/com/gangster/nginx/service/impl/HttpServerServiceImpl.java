package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.HttpServer;
import com.gangster.nginx.mapper.HttpServerMapper;
import com.gangster.nginx.service.IHttpServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
@Service
public class HttpServerServiceImpl extends ServiceImpl<HttpServerMapper, HttpServer> implements IHttpServerService {

}
