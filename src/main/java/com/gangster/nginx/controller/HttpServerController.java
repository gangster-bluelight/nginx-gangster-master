package com.gangster.nginx.controller;

import com.gangster.nginx.entity.HttpServer;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpServerService;
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
@RequestMapping(Constant.V1 + "/http-server")
public class HttpServerController {
    @Resource
    private IHttpServerService httpServerService;

    @GetMapping("")
    public List<HttpServer> findAllHttpServers() {
        return httpServerService.findAllHttpServers();
    }

    @GetMapping("/{id}")
    public HttpServer findHttpServerById(@PathVariable("id") Long httpId) {
        return httpServerService.findHttpServerById(httpId);
    }

    /**
     * Validated(HttpInsertValidationGroup.class) 验证指定验证组的参数规则
     *
     * @param httpServer 实体
     * @return 实体主键
     */
    @PostMapping("")
    public Long insertHttpServer(@Validated(InsertValidationGroup.class) @RequestBody HttpServer httpServer) {
        return httpServerService.insertHttpServer(httpServer);
    }

    @PutMapping("/{id}")
    public Boolean updateHttpServerById(@PathVariable("id") Long httpId, @Validated(UpdateValidationGroup.class) @RequestBody HttpServer httpServer) {
        httpServer.setId(httpId);
        return httpServerService.updateHttpServerById(httpServer);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteHttpServer(@PathVariable("id") Long httpId) {
        return httpServerService.deleteHttpServerById(httpId);
    }
}
