package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.HttpUpstreamServer;
import com.gangster.nginx.mapper.HttpUpstreamServerMapper;
import com.gangster.nginx.service.IHttpUpstreamServerService;
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
public class HttpUpstreamServerServiceImpl extends ServiceImpl<HttpUpstreamServerMapper, HttpUpstreamServer> implements IHttpUpstreamServerService {

}
