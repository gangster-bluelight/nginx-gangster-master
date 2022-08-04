package com.gangster.nginx.controller;

import com.gangster.nginx.entity.Http;
import com.gangster.nginx.lang.Constant;
import com.gangster.nginx.service.IHttpService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

    @PostMapping("")
    public Long insertHttp(@Validated @RequestBody Http http){
        return 1L;
    }
}
