package com.gangster.nginx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gangster.nginx.entity.HttpServer;
import com.gangster.nginx.mapper.HttpServerMapper;
import com.gangster.nginx.service.IHttpServerService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
@Service
public class HttpServerServiceImpl extends ServiceImpl<HttpServerMapper, HttpServer> implements IHttpServerService {
    @Override
    public List<HttpServer> findAllHttpServers() {
        return this.list(null);
    }

    @Override
    public HttpServer findHttpServerById(Long httpServerId) {
        HttpServer httpServer = this.getById(httpServerId);
        Assert.notNull(httpServer, "指定ID的HttpServer不存在");
        return httpServer;
    }

    @Override
    public Long insertHttpServer(HttpServer httpServer) {
        if (this.save(httpServer)) {
            throw new IllegalStateException("添加HttpServer失败");
        }
        return httpServer.getId();
    }

    @Override
    public Boolean updateHttpServerById(HttpServer httpServer) {
        if (this.updateById(httpServer)) {
            throw new IllegalStateException("修改HttpServer失败");
        }
        return true;
    }

    @Override
    public Boolean deleteHttpServerById(Long httpServerId) {
        if (this.removeById(httpServerId)) {
            throw new IllegalStateException("删除HttpServer失败");
        }
        return true;
    }
}
