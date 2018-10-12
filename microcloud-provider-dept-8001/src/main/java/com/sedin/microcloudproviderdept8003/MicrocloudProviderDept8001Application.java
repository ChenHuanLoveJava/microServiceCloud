package com.sedin.microcloudproviderdept8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient   //服务启动后自动注册到eureka服务中
public class MicrocloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicrocloudProviderDept8001Application.class, args);
    }
}
