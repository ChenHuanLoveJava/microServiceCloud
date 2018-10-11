package com.sedin.microcloudEureka7002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: Eureka server 7001 启动类
 * @Author: 陈欢
 * @Date: 2018/10/10 09:32
 */
@SpringBootApplication
@EnableEurekaServer
public class MicrocloudEureka7002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudEureka7002Application.class, args);
    }

}
