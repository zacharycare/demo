package com.nageu.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MenuController extends BaseController {
    @RequestMapping(value = "manage/menu/toEditPage")
    public ModelAndView toEditPage(){
        ModelAndView view = new ModelAndView("base/menu/edit");
        return view;
    }
}
