package com.deerlili.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author deerlili
 * @Classname TestController
 * @Description 测试
 * @Date 2020-07-13 11:19
 * @Version V1.0
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test() {
        return "test";
    }


}
