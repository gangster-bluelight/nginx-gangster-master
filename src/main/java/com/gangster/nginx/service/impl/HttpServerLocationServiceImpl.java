package com.gangster.nginx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gangster.nginx.entity.HttpServerLocation;
import com.gangster.nginx.mapper.HttpServerLocationMapper;
import com.gangster.nginx.service.IHttpServerLocationService;
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
public class HttpServerLocationServiceImpl extends ServiceImpl<HttpServerLocationMapper, HttpServerLocation> implements IHttpServerLocationService {
    @Override
    public List<HttpServerLocation> findAllHttpServerLocations() {
        return this.list(null);
    }

    @Override
    public HttpServerLocation findHttpServerLocationById(Long httpServerLocationId) {
        HttpServerLocation httpServerLocation = this.getById(httpServerLocationId);
        Assert.notNull(httpServerLocation, "指定ID的HttpServerLocation不存在");
        return httpServerLocation;
    }

    @Override
    public Long insertHttpServerLocation(HttpServerLocation httpServerLocation) {
        if (this.save(httpServerLocation)) {
            throw new IllegalStateException("添加HttpServerLocation失败");
        }
        return httpServerLocation.getId();
    }

    @Override
    public Boolean updateHttpServerLocationById(HttpServerLocation httpServerLocation) {
        if (this.updateById(httpServerLocation)) {
            throw new IllegalStateException("修改HttpServerLocation失败");
        }
        return true;
    }

    @Override
    public Boolean deleteHttpServerLocationById(Long httpServerLocationId) {
        if (this.removeById(httpServerLocationId)) {
            throw new IllegalStateException("删除HttpServerLocation失败");
        }
        return true;
    }
}
