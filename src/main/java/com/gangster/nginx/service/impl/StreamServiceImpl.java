package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Stream;
import com.gangster.nginx.mapper.StreamMapper;
import com.gangster.nginx.service.IStreamService;
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
public class StreamServiceImpl extends ServiceImpl<StreamMapper, Stream> implements IStreamService {

}
