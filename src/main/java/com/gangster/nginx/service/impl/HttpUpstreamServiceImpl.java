package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.HttpUpstream;
import com.gangster.nginx.mapper.HttpUpstreamMapper;
import com.gangster.nginx.service.IHttpUpstreamService;
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
public class HttpUpstreamServiceImpl extends ServiceImpl<HttpUpstreamMapper, HttpUpstream> implements IHttpUpstreamService {

}
