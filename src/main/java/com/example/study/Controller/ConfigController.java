package com.example.study.Controller;

import com.alibaba.fastjson.JSON;
import com.example.study.model.ConfigBean;
import com.example.study.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: bootStudy
 * @description:
 * @author: linxiaojiu
 * @create: 2019/3/26
 **/
@RestController
//@EnableConfigurationProperties({ConfigBean.class, User.class})
public class ConfigController {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private User user;

    @RequestMapping("/config")
    public ConfigBean configBean(){
        return configBean;
    }

    @RequestMapping("/user")
    public String user(){
        return user.getName()+user.getAge();
    }

    @RequestMapping("/user1")
    public String user1(){
        try {
//            System.out.println(JSON.toJSONString(user));
            return JSON.toJSONString(user.getAge());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
