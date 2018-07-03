package com.lostfound.lost_found;


import com.lostfound.lost_found.common.Msg;
import com.lostfound.lost_found.dao.PickInformationMapper;
import com.lostfound.lost_found.pojo.Message;
import com.lostfound.lost_found.pojo.PickForShow;
import com.lostfound.lost_found.pojo.PickInformation;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.service.LostService;
import com.lostfound.lost_found.service.MsgService;
import com.lostfound.lost_found.service.PickService;
import com.lostfound.lost_found.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    ApplicationContext context = SpringApplication.run(DemoApplication.class);

    @Test
    public void contextLoads() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        UserService userService = context.getBean(UserService.class);
        Class clazz = userService.getClass();
        Method createUserId = clazz.getDeclaredMethod("createUserId");
        createUserId.setAccessible(true);
        int userId = (Integer) createUserId.invoke(userService);
        User user = createUser();
        user.setUserId(userId);
        userService.insert(user);
    }

    @Test
    public void testDeleteLost()
    {
        LostService lostService = context.getBean(LostService.class);
        lostService.deleteLost(3);
    }

    @Test
    public void getNewistPick()
    {
        PickService pickService = context.getBean(PickService.class);
        List<PickForShow> newistPick = pickService.getNewistPick();
        for (PickForShow pickForShow : newistPick)
            System.out.println(pickForShow.toString());
    }

    private User createUser()
    {
        User user = new User();
        user.setUserName("xiaoye");
        user.setPhone(12345678);
        user.setPassword("123456");
        user.setEMail("xiaoye@qq.com");
        return user;
    }

}
