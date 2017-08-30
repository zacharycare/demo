package com.nageu.base.util;

import com.nageu.base.bean.Menu;

import java.util.ArrayList;
import java.util.List;

public class TreeUtil {
    private List<Menu> menuList = new ArrayList<>();

    public TreeUtil(List<Menu> list) {
        menuList = list;
    }

    public Menu getMenuById(String id){
        Menu menu = new Menu();
        for(Menu item : menuList){
            if (item.getId() .equals(id)) {
                menu = item;
                break;
            }
        }
        return menu;
    }

    public List<Menu> getChildMenusById(String id){
        List<Menu> menus = new ArrayList<>();
        for(Menu menu : menuList){
            if(menu.getPid() .equals(id)){
                menus.add(menu);
            }
        }
        return menus;
    }

    public Menu generateTreeMenu(String rootId){
        Menu menu = getMenuById(rootId);
        List<Menu> menus = getChildMenusById(rootId);
        for(Menu item : menus){
            Menu aaa = generateTreeMenu(item.getId());
            menu.getChildren().add(aaa);
        }
        return menu;
    }
}
