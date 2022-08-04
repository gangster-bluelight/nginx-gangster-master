package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Password;
import com.gangster.nginx.mapper.PasswordMapper;
import com.gangster.nginx.service.IPasswordService;
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
public class PasswordServiceImpl extends ServiceImpl<PasswordMapper, Password> implements IPasswordService {

}
