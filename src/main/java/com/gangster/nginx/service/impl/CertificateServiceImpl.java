package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Certificate;
import com.gangster.nginx.mapper.CertificateMapper;
import com.gangster.nginx.service.ICertificateService;
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
public class CertificateServiceImpl extends ServiceImpl<CertificateMapper, Certificate> implements ICertificateService {

}
