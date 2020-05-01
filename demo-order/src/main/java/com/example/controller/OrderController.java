package com.example.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.bean.Tang;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderController")
public class OrderController {

    @Value("${server.port}")
    private String port1;
    @GetMapping("/orders")
    @ResponseBody
    public Object orders(){

        System.out.println("==========OrderController ==> order ========="+port1);
        return JSONObject.toJSONString(new Tang("111111","wangfuqin","32"));

    }
}
