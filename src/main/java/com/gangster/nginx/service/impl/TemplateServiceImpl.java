package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Template;
import com.gangster.nginx.mapper.TemplateMapper;
import com.gangster.nginx.service.ITemplateService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author blue-light
 * @since 2022-08-04
 */
@Service
public class TemplateServiceImpl extends ServiceImpl<TemplateMapper, Template> implements ITemplateService {

}
