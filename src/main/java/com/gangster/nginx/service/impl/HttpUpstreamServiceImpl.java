package com.gangster.nginx.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gangster.nginx.entity.HttpUpstream;
import com.gangster.nginx.mapper.HttpUpstreamMapper;
import com.gangster.nginx.service.IHttpUpstreamService;
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
public class HttpUpstreamServiceImpl extends ServiceImpl<HttpUpstreamMapper, HttpUpstream> implements IHttpUpstreamService {
    @Override
    public List<HttpUpstream> findAllHttpUpstreams() {
        return this.list(null);
    }

    @Override
    public HttpUpstream findHttpUpstreamById(Long httpUpstreamId) {
        HttpUpstream httpUpstream = this.getById(httpUpstreamId);
        Assert.notNull(httpUpstream, "指定ID的HttpUpstream不存在");
        return httpUpstream;
    }

    @Override
    public Long insertHttpUpstream(HttpUpstream httpUpstream) {
        if (this.save(httpUpstream)) {
            throw new IllegalStateException("添加HttpUpstream失败");
        }
        return httpUpstream.getId();
    }

    @Override
    public Boolean updateHttpUpstreamById(HttpUpstream httpUpstream) {
        if (this.updateById(httpUpstream)) {
            throw new IllegalStateException("修改HttpUpstream失败");
        }
        return true;
    }

    @Override
    public Boolean deleteHttpUpstreamById(Long httpUpstreamId) {
        if (this.removeById(httpUpstreamId)) {
            throw new IllegalStateException("删除HttpUpstream失败");
        }
        return true;
    }
}
