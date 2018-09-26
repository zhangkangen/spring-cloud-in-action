package com.example.uaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 授权服务
 * @author zxk
 */
@SpringBootApplication
@EnableEurekaClient
public class UaaServiceApplication {
    public static void main(String[] args) {

        SpringApplication.run(UaaServiceApplication.class, args);
    }
}
