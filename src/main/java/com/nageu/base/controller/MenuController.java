package com.nageu.base.controller;

import com.nageu.base.bean.Menu;
import com.nageu.base.bean.Result;
import com.nageu.base.bean.User;
import com.nageu.base.service.MenuService;
import com.nageu.base.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MenuController extends BaseController {
    @Autowired
    MenuService menuService;
    /**
     * @apiNote 前往菜单编辑页面
     * @return
     */
    @RequestMapping(value = "manage/menu/toEditPage")
    public ModelAndView toEditPage(){
        ModelAndView view = new ModelAndView("base/menu/edit");
        return view;
    }

    /**
     * @apiNote 保存菜单信息
     * @return
     */
    @RequestMapping(value = "manage/menu/save")
    @ResponseBody
    public Result save(Menu menu, HttpServletRequest request){
        Menu parentMenu = menuService.selectById(menu.getPid());
        if (parentMenu != null){
            menu.setLevel(parentMenu.getLevel() + 1);
        }
        menu.setCreate_id(((User)request.getSession().getAttribute("SUS")).getId());
        boolean flag = menuService.insert(menu);
        if (flag){
            result(Constants.SUCCESS_CODE,Constants.SUCCESS_MSG,null);
        } else {
            result(Constants.FAILURE_CODE,Constants.FAILURE_MSG,null);
        }
        return result;
    }
}
