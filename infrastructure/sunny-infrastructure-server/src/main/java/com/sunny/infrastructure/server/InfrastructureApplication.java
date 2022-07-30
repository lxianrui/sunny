package com.sunny.infrastructure.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 基础设施应用程序
 *
 * @author Jeffrey Liu
 * @date 2022/07/11
 */
@EnableDiscoveryClient
@SpringBootApplication
public class InfrastructureApplication {
    public static void main(String[] args) {
        SpringApplication.run(InfrastructureApplication.class, args);
    }
}
