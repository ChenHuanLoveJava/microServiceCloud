package com.sedin.microcloudproviderdept8002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //服务启动后自动注册到eureka服务中
public class MicrocloudProviderDept8002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderDept8002Application.class, args);
    }
}
