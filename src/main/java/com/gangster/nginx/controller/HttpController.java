package com.gangster.nginx.controller;

import com.gangster.nginx.entity.Http;
import com.gangster.nginx.group.InsertValidationGroup;
import com.gangster.nginx.group.UpdateValidationGroup;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpService;
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
@RequestMapping(Constant.V1 + "/http")
public class HttpController {
    @Resource
    private IHttpService httpService;

    @GetMapping("")
    public List<Http> findAllHttps() {
        return httpService.findAllHttps();
    }

    @GetMapping("/{id}")
    public Http findHttpById(@PathVariable("id") Long httpId) {
        return httpService.findHttpById(httpId);
    }

    /**
     * Validated(HttpInsertValidationGroup.class) 验证指定验证组的参数规则
     *
     * @param http 实体
     * @return 实体主键
     */
    @PostMapping("")
    public Long insertHttp(@Validated(InsertValidationGroup.class) @RequestBody Http http) {
        return httpService.insertHttp(http);
    }

    @PutMapping("/{id}")
    public Boolean updateHttpById(@PathVariable("id") Long httpId,@Validated(UpdateValidationGroup.class) @RequestBody Http http) {
        http.setId(httpId);
        return httpService.updateHttpById(http);
    }

    @DeleteMapping("/{id}")
    public Boolean deleteHttp(@PathVariable("id") Long httpId) {
        return httpService.deleteHttpById(httpId);
    }
}
