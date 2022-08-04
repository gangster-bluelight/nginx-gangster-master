package com.gangster.nginx.service.impl;

import com.gangster.nginx.entity.Setting;
import com.gangster.nginx.mapper.SettingMapper;
import com.gangster.nginx.service.ISettingService;
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
public class SettingServiceImpl extends ServiceImpl<SettingMapper, Setting> implements ISettingService {

}
