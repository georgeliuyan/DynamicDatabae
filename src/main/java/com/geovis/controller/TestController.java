/**
 * @class: DynamicDatabase
 * @description: 测试控制类
 * @author: liuyan
 * @create: 2019-04-29 16:37
 **/

package com.geovis.controller;

import com.geovis.bean.Demo;
import com.geovis.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private TestService testService;



    @RequestMapping("/test1")
    public String test(){
        for(Demo d:testService.getListByDs1()){
            System.out.println(d);
        }
        return"ok";
    }
}


