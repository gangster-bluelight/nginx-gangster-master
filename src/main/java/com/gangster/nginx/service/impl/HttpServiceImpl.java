package com.gangster.nginx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gangster.nginx.entity.Http;
import com.gangster.nginx.mapper.HttpMapper;
import com.gangster.nginx.service.IHttpService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Service
public class HttpServiceImpl extends ServiceImpl<HttpMapper, Http> implements IHttpService {
    @Override
    public List<Http> findAllHttps() {
        return this.list(null);
    }

    @Override
    public Http findHttpById(Long httpId) {
        Http http = this.getById(httpId);
        Assert.notNull(http, "指定ID的HTTP不存在");
        return http;
    }

    @Override
    public Long insertHttp(Http http) {
        if (this.save(http)) {
            throw new IllegalStateException("添加HTTP失败");
        }
        return http.getId();
    }

    @Override
    public Boolean updateHttpById(Http http) {
        if (this.updateById(http)) {
            throw new IllegalStateException("修改HTTP失败");
        }
        return true;
    }

    @Override
    public Boolean deleteHttpById(Long httpId) {
        if (this.removeById(httpId)) {
            throw new IllegalStateException("删除HTTP失败");
        }
        return true;
    }
}
