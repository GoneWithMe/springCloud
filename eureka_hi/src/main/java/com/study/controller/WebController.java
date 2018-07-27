package com.study.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxin
 * @Title: WebController
 * @ProjectName springCloud
 * @Description: TODO
 * @date 2018/7/27 15:26
 */
@RestController
public class WebController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("hi")
    public Object getMessage(@RequestParam(value = "name", defaultValue = "forezp") String name){
        return "hi " + name + " ,i am from port:" + port;
    }
}
