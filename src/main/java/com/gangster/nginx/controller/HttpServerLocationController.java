package com.gangster.nginx.controller;

import com.gangster.nginx.entity.HttpServerLocation;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpServerLocationService;
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
@RequestMapping(Constant.V1 + "/http-server-location")
public class HttpServerLocationController {
    @Resource
    private IHttpServerLocationService httpServerLocationService;

    @GetMapping("")
    public List<HttpServerLocation> findAllHttpServerLocations() {
        return httpServerLocationService.findAllHttpServerLocations();
    }

    @GetMapping("/{id}")
    public HttpServerLocation findHttpServerLocationById(@PathVariable("id") Long httpId) {
        return httpServerLocationService.findHttpServerLocationById(httpId);
    }

    /**
     * Validated(HttpInsertValidationGroup.class) 验证指定验证组的参数规则
     *
     * @param httpServerLocation 实体
     * @return 实体主键
     */
    @PostMapping("")
    public Long insertHttpServerLocation(@Validated(InsertValidationGroup.class) @RequestBody HttpServerLocation httpServerLocation) {
        return httpServerLocationService.insertHttpServerLocation(httpServerLocation);
    }

    @PutMapping("/{id}")
    public Boolean updateHttpServerLocationById(@PathVariable("id") Long httpId, @Validated(UpdateValidationGroup.class) @RequestBody HttpServerLocation httpServerLocation) {
        httpServerLocation.setId(httpId);
        return httpServerLocationService.updateHttpServerLocationById(httpServerLocation);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteHttpServerLocation(@PathVariable("id") Long httpId) {
        return httpServerLocationService.deleteHttpServerLocationById(httpId);
    }
}
