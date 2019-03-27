package com.example.study.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/26
 **/
@RestController
public class MyController {

    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private Integer age;


    @RequestMapping("/my")
    public String my(){
        return name+age;
    }
}
