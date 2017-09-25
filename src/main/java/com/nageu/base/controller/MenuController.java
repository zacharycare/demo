package com.nageu.base.controller;

import com.baomidou.mybatisplus.plugins.Page;
import com.nageu.base.bean.Menu;
import com.nageu.base.bean.Result;
import com.nageu.base.bean.User;
import com.nageu.base.service.MenuService;
import com.nageu.base.util.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@Controller
public class MenuController extends BaseController {
    static Logger logger = LoggerFactory.getLogger(MenuController.class);
    @Autowired
    MenuService menuService;

    /**
     * @apiNote 前往菜单列表页面
     * @return
     */
    @RequestMapping(value = "manage/menu/toListPage")
    public ModelAndView toListPage(){
        ModelAndView view = new ModelAndView("base/menu/list");
        return view;
    }

    /**
     * @apiNote 获取菜单列表
     * @return
     */
    @RequestMapping(value = "manage/menu/get")
    @ResponseBody
    public Map<String,Object> get(){
        Map<String,Object> map = new HashMap<>();
        try {
            map.put("rows",menuService.selectList(null));
            map.put("total",menuService.selectCount(null));
        }catch (Exception e){
            logger.error("查询菜单列表错误："+e);
        }
        return map;
    }

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
        menu.setCreate_id(((User)request.getSession().getAttribute(Constants.SessionName)).getId());
        boolean flag = menuService.insert(menu);
        if (flag){
            result(Constants.SUCCESS_CODE,Constants.SUCCESS_MSG,null);
        } else {
            result(Constants.FAILURE_CODE,Constants.FAILURE_MSG,null);
        }
        return result;
    }
}
