package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Log;
import com.gangster.nginx.mapper.LogMapper;
import com.gangster.nginx.service.ILogService;
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
public class LogServiceImpl extends ServiceImpl<LogMapper, Log> implements ILogService {

}
