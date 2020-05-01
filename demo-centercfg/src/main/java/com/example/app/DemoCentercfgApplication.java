package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 启动类---分之T01-V01
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class DemoCentercfgApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoCentercfgApplication.class, args);
    }

    public void T01(){
        System.out.println("This is T01 updated！");
        System.out.println("This is uptated by T01=====");
    }
}
