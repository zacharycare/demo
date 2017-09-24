import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.nageu.base.bean.Menu;
import com.nageu.base.bean.User;
import com.nageu.base.service.MenuService;
import com.nageu.base.service.UserService;
import com.nageu.base.util.TreeUtil;
import com.nageu.custom.bean.Tech;
import com.nageu.custom.service.TechService;
import org.apache.commons.lang3.StringUtils;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
    private static Logger logger = LoggerFactory.getLogger(Test.class);
    @Autowired
    UserService userService;
    @Autowired
    MenuService menuService;
    @Autowired
    TechService techService;

    @org.junit.Test
    public void test(){
//        userService.selectList(new EntityWrapper<User>().eq("username","your name"));
//        System.out.println(userService.selectList(new EntityWrapper<User>().eq("username","admin")));
//        System.out.println("123");
//        User user = new User();
//        user.setUsername("再试一下");
//        user.setPassword("ohh");
//        boolean flag = userService.insert(user);
//        System.out.println("添加用户是否成功："+flag);

//        List<Menu> list = menuService.selectList(null);
//        TreeUtil treeUtil = new TreeUtil(list);
//        System.out.println("菜单list："+ JSON.toJSONString(treeUtil.generateTreeMenu("3").getChildren()));

//        Page<Menu> page = menuService.selectPage(new Page<>());
//        System.out.println("菜单列表："+page);

//        for (int i=0;i<50000;i++){
//            logger.error("error");
//            logger.debug("debug");
//            logger.info("info");
//            logger.trace("trace");
//            logger.warn("warn");
//        }

        List<Tech> teches = new ArrayList<>();
//        Tech tech = new Tech();
//        tech.setTitle("title1");
//        tech.setContent("content1");
//        Tech tech2 = new Tech();
//        tech2.setTitle("title2");
//        tech2.setContent("content2");
//
//        teches.add(tech);
//        teches.add(tech2);
//        boolean flag = techService.insertOrUpdateBatch(teches);
//        System.out.println("success?:"+flag);
//        teches = techService.selectList(null);
//        Tech tech = new Tech();
//        tech.setId(1223);
//        tech.setTitle("title4");
//        tech.setContent("content4");
//        teches.add(tech);
//        boolean flag = techService.insertOrUpdateBatch(teches);
//        System.out.println("success?:"+flag);
//        System.out.println("list is:"+teches);

        String a = " ";
        String b = null;
        String c = "a";
        System.out.println(StringUtils.isNotBlank(a));
        System.out.println(StringUtils.isNotEmpty(a));
        System.out.println(StringUtils.isNotBlank(b));
        System.out.println(StringUtils.isNotEmpty(b));
        System.out.println(StringUtils.isNotBlank(c));
        System.out.println(StringUtils.isNotEmpty(c));
    }
}
