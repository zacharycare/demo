package com.nageu.custom.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.nageu.custom.bean.Tech;
import com.nageu.custom.dao.TechDao;
import com.nageu.custom.service.TechService;
import org.springframework.stereotype.Service;

/**
 * author : zhou
 * datetime : 2017/9/15 14:53
 */
@Service
public class TechServiceImpl extends ServiceImpl<TechDao, Tech> implements TechService {
}
