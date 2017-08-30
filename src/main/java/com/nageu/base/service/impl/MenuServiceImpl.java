package com.nageu.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.nageu.base.bean.Menu;
import com.nageu.base.dao.MenuDao;
import com.nageu.base.service.MenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao,Menu> implements MenuService {
}
