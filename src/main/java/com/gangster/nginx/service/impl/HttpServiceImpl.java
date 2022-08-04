package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Http;
import com.gangster.nginx.mapper.HttpMapper;
import com.gangster.nginx.service.IHttpService;
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
public class HttpServiceImpl extends ServiceImpl<HttpMapper, Http> implements IHttpService {

}
