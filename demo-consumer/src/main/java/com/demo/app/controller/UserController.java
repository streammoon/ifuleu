package com.demo.app.controller;


import com.alibaba.fastjson.JSONObject;
import com.demo.app.bean.Tang;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    RestTemplate restTemplate;
    //@Autowired
//    EurekaClient eclient;//千峰教育这么做的，可以实现动态获取服务端地址（通过注册的名称）
    @GetMapping("/users")
    @ResponseBody
    public Object loadUsers(){
        System.out.println("==============UserController.loadUsers====================");
//        InstanceInfo nextServerFromEureka = eclient.getNextServerFromEureka("DEMO-ORDER", false);
//        System.out.println(nextServerFromEureka.getHomePageUrl());
//        String url = nextServerFromEureka.getHomePageUrl();
        //resttemplate 注解了LoadBalanced就可以实现按服务名负载获取服务端(默认轮训)
        Object t = restTemplate.getForObject("http://DEMO-ORDER/orderController/orders", Tang.class);

        return t;
    }
}
