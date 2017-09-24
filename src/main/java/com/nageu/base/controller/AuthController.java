package com.nageu.base.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.nageu.base.bean.Result;
import com.nageu.base.bean.User;
import com.nageu.base.service.UserService;
import com.nageu.base.util.Constants;
import com.nageu.base.util.MD5;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class AuthController extends BaseController {
    @Autowired
    UserService userService;
    /**
     * @apiNote 进入后台登录页
     * @return
     */
    @RequestMapping(value = "u/login")
    public ModelAndView toLoginPage(String account, String password,String remember, HttpSession session,HttpServletRequest request,HttpServletResponse response) throws IOException {
        ModelAndView view = new ModelAndView("base/login");
        if (account != null && password != null){   //前端传进的account和password都不为null，则去数据库查询user
            User user = userService.selectOne(new EntityWrapper<User>().eq("username",account).eq("password", MD5.getMD5(password)));
            if (user == null){
                view.addObject("msg","用户名或密码错误");
            } else if (!"1".equals(user.getState())){
                view.addObject("msg","您的账户异常");
            } else {    //登录
                session.setAttribute(Constants.SessionName,user);
                System.out.println("session id : "+session.getId());
                if ("remember-me".equals(remember)){
                    Cookie cookie = new Cookie("nc",account);
                    cookie.setMaxAge(3600);
                    response.addCookie(cookie);
                }
                response.sendRedirect(request.getContextPath()+"/manage");
            }
        }
        return view;
    }

    /**
     * @apiNote 进入后台主页
     * @return
     */
    @RequestMapping(value = "manage")
    public ModelAndView toMainPage(){
        ModelAndView view = new ModelAndView("base/main");
        return view;
    }

    /**
     * @apiNote 进入修改密码页面
     * @return
     */
    @RequestMapping(value = "manage/to-modify-password")
    public ModelAndView toModifyPasswordPage(){
        ModelAndView view = new ModelAndView("base/user/modify_password");
        return view;
    }

    /**
     * @apiNote 修改密码
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "manage/modify-password")
    public Result modifyPassword(HttpServletRequest request, String old, @RequestParam(value = "new") String newpw, String confirm){
        System.out.println("原密码："+old+",新密码："+newpw+"，确认："+confirm);
        org.apache.commons.lang3.StringUtils.isNotBlank(confirm);

        User session = (User) request.getSession().getAttribute(Constants.SessionName);
        User user = userService.selectById(session.getId());
        if (!user.getPassword().equalsIgnoreCase(MD5.getMD5(old))){
            result("1001","原密码错误",null);
            return result;
        }

        if (StringUtils.isNotBlank(newpw) && StringUtils.isNotBlank(confirm) && newpw.equals(confirm)){
            user.setPassword(MD5.getMD5(newpw));
            userService.updateById(user);
            resultSuccess(null);
        } else {
            result("1001","新密码不一致",null);
        }

        return result;
    }

    /**
     * @apiNote 后台用户注销
     * @param request
     * @param response
     */
    @RequestMapping(value = "manage/logout")
    public void logout(HttpServletRequest request,HttpServletResponse response) throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(request.getContextPath()+"/u/login");
    }

    /**
     * @apiNote 前往欢迎页
     * @return
     */
    @RequestMapping(value = "manage/welcome")
    public ModelAndView toWelcomePage(){
        ModelAndView view = new ModelAndView("base/welcome");
        return view;
    }

    /**
     * @apiNote 判断用户session是否过期
     * @param request
     * @return
     */
    @RequestMapping(value = "isExpire")
    @ResponseBody
    public Result sessionExpire(HttpServletRequest request){
        Object object = request.getSession().getAttribute(Constants.SessionName);
        if (object == null){    //过期
            result(Constants.FAILURE_CODE,Constants.FAILURE_MSG,request.getContextPath()+"u/login");
        } else {
            result(Constants.SUCCESS_CODE,Constants.SUCCESS_MSG,null);
        }
        return result;
    }
}
