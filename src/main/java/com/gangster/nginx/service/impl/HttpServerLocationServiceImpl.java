package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.HttpServerLocation;
import com.gangster.nginx.mapper.HttpServerLocationMapper;
import com.gangster.nginx.service.IHttpServerLocationService;
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
public class HttpServerLocationServiceImpl extends ServiceImpl<HttpServerLocationMapper, HttpServerLocation> implements IHttpServerLocationService {

}
