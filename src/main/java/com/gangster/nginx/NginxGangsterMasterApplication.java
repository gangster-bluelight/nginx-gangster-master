package com.gangster.nginx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author blue-light
 */
@SpringBootApplication
@MapperScan("com.gangster.nginx.mapper")
public class NginxGangsterMasterApplication {
    public static void main(String[] args) {
        SpringApplication.run(NginxGangsterMasterApplication.class, args);
    }
}
