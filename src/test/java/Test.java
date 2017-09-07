import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.nageu.base.bean.Menu;
import com.nageu.base.bean.User;
import com.nageu.base.service.MenuService;
import com.nageu.base.service.UserService;
import com.nageu.base.util.TreeUtil;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class Test {
    @Autowired
    UserService userService;
    @Autowired
    MenuService menuService;

    @org.junit.Test
    public void test(){
        userService.selectList(new EntityWrapper<User>().eq("username","your name"));
        System.out.println(userService.selectList(new EntityWrapper<User>().eq("username","admin")));
        System.out.println("123");
        User user = new User();
        user.setUsername("再试一下");
        user.setPassword("ohh");
        boolean flag = userService.insert(user);
        System.out.println("添加用户是否成功："+flag);
        List<Menu> list = menuService.selectList(null);
        TreeUtil treeUtil = new TreeUtil(list);
        System.out.println("菜单list："+ JSON.toJSONString(treeUtil.generateTreeMenu("3").getChildren()));
    }
}
