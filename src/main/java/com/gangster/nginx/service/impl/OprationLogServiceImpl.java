package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.OprationLog;
import com.gangster.nginx.mapper.OprationLogMapper;
import com.gangster.nginx.service.IOprationLogService;
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
public class OprationLogServiceImpl extends ServiceImpl<OprationLogMapper, OprationLog> implements IOprationLogService {

}
