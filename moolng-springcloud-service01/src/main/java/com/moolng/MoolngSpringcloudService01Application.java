package com.moolng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@NacosPropertySource(dataId = "example", autoRefreshed = true)
@EnableDiscoveryClient
public class MoolngSpringcloudService01Application {

    public static void main(String[] args) {
        SpringApplication.run(MoolngSpringcloudService01Application.class, args);
    }

}
