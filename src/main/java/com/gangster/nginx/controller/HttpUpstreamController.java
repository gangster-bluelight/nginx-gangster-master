package com.gangster.nginx.controller;

import com.gangster.nginx.entity.HttpUpstream;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpUpstreamService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
@RestController
@RequestMapping(Constant.V1 + "/http-upstream")
public class HttpUpstreamController {
    @Resource
    private IHttpUpstreamService httpUpstreamService;

    @GetMapping("")
    public List<HttpUpstream> findAllHttpUpstreams() {
        return httpUpstreamService.findAllHttpUpstreams();
    }

    @GetMapping("/{id}")
    public HttpUpstream findHttpUpstreamById(@PathVariable("id") Long httpId) {
        return httpUpstreamService.findHttpUpstreamById(httpId);
    }

    /**
     * Validated(HttpInsertValidationGroup.class) 验证指定验证组的参数规则
     *
     * @param httpUpstream 实体
     * @return 实体主键
     */
    @PostMapping("")
    public Long insertHttpUpstream(@Validated(InsertValidationGroup.class) @RequestBody HttpUpstream httpUpstream) {
        return httpUpstreamService.insertHttpUpstream(httpUpstream);
    }

    @PutMapping("/{id}")
    public Boolean updateHttpUpstreamById(@PathVariable("id") Long httpId, @Validated(UpdateValidationGroup.class) @RequestBody HttpUpstream httpUpstream) {
        httpUpstream.setId(httpId);
        return httpUpstreamService.updateHttpUpstreamById(httpUpstream);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteHttpUpstream(@PathVariable("id") Long httpId) {
        return httpUpstreamService.deleteHttpUpstreamById(httpId);
    }
}
