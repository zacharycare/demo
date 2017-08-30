package com.nageu.base.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.nageu.base.bean.User;
import com.nageu.base.service.UserService;
import com.nageu.base.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class AuthController extends BaseController {
    @Autowired
    UserService userService;
    /**
     * @apiNote 进入后台登录页
     * @return
     */
    @RequestMapping(value = "u/login")
    public ModelAndView toLoginPage(String account, String password, HttpSession session){
        ModelAndView view = new ModelAndView("base/login");
        if (account != null && password != null){   //前端传进的account和password都不为null，则去数据库查询user
            User user = userService.selectOne(new EntityWrapper<User>().eq("username",account).eq("password", MD5.getMD5(password)));
            if (user == null){
                view.addObject("msg","用户名或密码错误");
            } else if (!"1".equals(user.getState())){
                view.addObject("msg","您的账户异常");
            } else {    //登录
                view.setViewName("base/main");
                session.setAttribute("SUS",user);
            }
        }
        return view;
    }
}
