package com.example.study.Controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/22
 **/
@RestController
public class HelloController {

//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

    @RequestMapping("/test")
    public String test(String str){
        if(!StringUtils.isEmpty(str)){
            return str;
        }else{
            return "first test";
        }
    }
}
