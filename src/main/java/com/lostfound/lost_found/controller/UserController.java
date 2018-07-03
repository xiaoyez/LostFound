package com.lostfound.lost_found.controller;

import com.lostfound.lost_found.common.Msg;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.service.UserService;
import com.lostfound.lost_found.util.RequestUtil;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;


@Controller
public class UserController {


    @Autowired
    UserService userService;

/*
用户登陆


*/
  @GetMapping("login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(@Param("userId") Integer userId, @Param("password") String password, Model model,HttpServletRequest request) {

        Msg login = userService.login(userId, password);

        if (login.getCode() == 100) {

            model.addAttribute("user", login.getExtend().get("user"));
            HttpSession session = request.getSession();
            User user = userService.getUserById(userId);
            session.setAttribute("user",user);
            System.out.println("login success");

            return "home";
        }

        return "login";


    }

/*
登出

*/

    @RequestMapping(value = "out", method = RequestMethod.GET)
    @ResponseBody
    public String logout(HttpServletRequest request) {
        System.out.println(request);
        request.getSession().removeAttribute("user");

        return "index";
    }

    @GetMapping("register")
    public String toRegister()
    {
        return "register";
    }

    /*

    注册接口

    */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(HttpServletRequest request) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, ParseException, NoSuchFieldException {
        User user = new User();
        RequestUtil.quicklySetFiled(request,user);
        System.out.println(user.toString());
        userService.register(user);
        System.out.println(user.toString());
        request.getSession().setAttribute("register_userId",user.getUserId());
        return "login";
    }


//获取登陆用户的个人信息

    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public String getUserInfo(HttpSession httpSession) {

        User user = (User) httpSession.getAttribute("user");


        if (user != null) {


            return "information";
        }
        return "用户未登陆，获取你麻痹";
    }


//登陆状态下更新个人信息的接口

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update_information(HttpSession httpSession, User user) {

        User currentUser = (User) httpSession.getAttribute("user");


        if (currentUser == null) {
            return "用户未登录";
        }

        user.setUserId(currentUser.getUserId());


        //下面是更新方法

        user.setUserId(currentUser.getUserId());


        Msg msg = userService.update_information(user);


        httpSession.setAttribute("user", msg.getExtend().get("user"));

        return "index";
    }

    @GetMapping("user/center")
    public String toPersonalCenter(HttpServletRequest request,Model model)
    {
        User user = (User)request.getSession().getAttribute("user");
        model.addAttribute("user",user);
        return "personalcenter";
    }


}
