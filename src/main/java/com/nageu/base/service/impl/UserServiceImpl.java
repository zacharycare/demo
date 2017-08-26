package com.nageu.base.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.nageu.base.bean.User;
import com.nageu.base.dao.UserDao;
import com.nageu.base.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {
}
