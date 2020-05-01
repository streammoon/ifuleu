package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类  -- master V0.4   --合并分支处理
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class DemoCentercfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCentercfgApplication.class, args);
    }
    public void master(){
        System.out.println("This is master updated!");
    }

}
