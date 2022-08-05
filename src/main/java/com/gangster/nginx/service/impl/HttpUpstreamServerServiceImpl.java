package com.gangster.nginx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gangster.nginx.entity.HttpUpstreamServer;
import com.gangster.nginx.mapper.HttpUpstreamServerMapper;
import com.gangster.nginx.service.IHttpUpstreamServerService;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

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
    @Override
    public List<HttpUpstreamServer> findAllHttpUpstreamServers() {
        return this.list(null);
    }

    @Override
    public HttpUpstreamServer findHttpUpstreamServerById(Long httpUpstreamServerId) {
        HttpUpstreamServer httpUpstreamServer = this.getById(httpUpstreamServerId);
        Assert.notNull(httpUpstreamServer, "指定ID的HttpUpstreamServer不存在");
        return httpUpstreamServer;
    }

    @Override
    public Long insertHttpUpstreamServer(HttpUpstreamServer httpUpstreamServer) {
        if (this.save(httpUpstreamServer)) {
            throw new IllegalStateException("添加HttpUpstreamServer失败");
        }
        return httpUpstreamServer.getId();
    }

    @Override
    public Boolean updateHttpUpstreamServerById(HttpUpstreamServer httpUpstreamServer) {
        if (this.updateById(httpUpstreamServer)) {
            throw new IllegalStateException("修改HttpUpstreamServer失败");
        }
        return true;
    }

    @Override
    public Boolean deleteHttpUpstreamServerById(Long httpUpstreamServerId) {
        if (this.removeById(httpUpstreamServerId)) {
            throw new IllegalStateException("删除HttpUpstreamServer失败");
        }
        return true;
    }
}
