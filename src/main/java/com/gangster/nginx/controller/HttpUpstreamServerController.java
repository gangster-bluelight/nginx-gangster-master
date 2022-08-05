package com.gangster.nginx.controller;

import com.gangster.nginx.entity.HttpUpstreamServer;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpUpstreamServerService;
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
@RequestMapping(Constant.V1 + "/http-upstream-server")
public class HttpUpstreamServerController {
    @Resource
    private IHttpUpstreamServerService httpUpstreamServerService;

    @GetMapping("")
    public List<HttpUpstreamServer> findAllHttpUpstreamServers() {
        return httpUpstreamServerService.findAllHttpUpstreamServers();
    }

    @GetMapping("/{id}")
    public HttpUpstreamServer findHttpUpstreamServerById(@PathVariable("id") Long httpId) {
        return httpUpstreamServerService.findHttpUpstreamServerById(httpId);
    }

    /**
     * Validated(HttpInsertValidationGroup.class) 验证指定验证组的参数规则
     *
     * @param httpUpstreamServer 实体
     * @return 实体主键
     */
    @PostMapping("")
    public Long insertHttpUpstreamServer(@Validated(InsertValidationGroup.class) @RequestBody HttpUpstreamServer httpUpstreamServer) {
        return httpUpstreamServerService.insertHttpUpstreamServer(httpUpstreamServer);
    }

    @PutMapping("/{id}")
    public Boolean updateHttpUpstreamServerById(@PathVariable("id") Long httpId, @Validated(UpdateValidationGroup.class) @RequestBody HttpUpstreamServer httpUpstreamServer) {
        httpUpstreamServer.setId(httpId);
        return httpUpstreamServerService.updateHttpUpstreamServerById(httpUpstreamServer);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteHttpUpstreamServer(@PathVariable("id") Long httpId) {
        return httpUpstreamServerService.deleteHttpUpstreamServerById(httpId);
    }
}
