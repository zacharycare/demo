package com.nageu.base.controller;

import com.nageu.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "selectUsers")
    public Map selectUsers(){
        Map map = new HashMap();
        System.out.println("111");
        return map;
    }

    @RequestMapping(value = "main")
    public String toMainPage(){
        return "base/main";
    }
}
