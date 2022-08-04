package com.gangster.nginx.utils;

import com.gangster.nginx.conf.Configure;
import com.gangster.nginx.core.NginxConfig;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * Properties 文件操作工具类
 * Properties file manager util
 *
 * @author gsk
 */
public class PropertiesUtil {


    /**
     * 读取指定path下的Properties文件
     * Read properties file in the path
     *
     * @param path Properties 文件路径
     *             Properties file path
     * @return
     */
    public static Properties read(String path) {
        Properties properties = new Properties();
        try (InputStream stream = PropertiesUtil.class.getClassLoader().getResourceAsStream(path)) {
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }

    public static void main(String[] args) throws IOException {
        NginxConfig parse = NginxConfig.parse(Files.readString(Path.of(Configure.CONF_DIR), StandardCharsets.UTF_8));
        System.out.printf("%s", parse.getItems());
    }
}
