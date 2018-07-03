package com.lostfound.lost_found.controller;

import com.lostfound.lost_found.common.Msg;
import com.lostfound.lost_found.pojo.Message;
import com.lostfound.lost_found.pojo.MessageForShow;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.service.MsgService;
import com.lostfound.lost_found.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Controller
public class MsgController {

    @Autowired
    MsgService msgService;

    @Resource
    UserService userService;

    @RequestMapping(value = "/message/send", method = RequestMethod.POST)
    @ResponseBody
    public Object sendMsg(Message message, HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute("user");

        Integer userId = user.getUserId();

        message.setSenderId(userId);
        message.setDate(new Date());

        msgService.add(message);

        List<MessageForShow> chatRecords = msgService.getChatRecords(userId, message.getReceiverId());
        return chatRecords;

    }

    @RequestMapping(value = "/msg/{yourId}", method = RequestMethod.GET)
    @ResponseBody
    public Object getMsgs(@PathVariable("yourId") int yourId, HttpServletRequest request, Model model) {
        User me = (User) request.getSession().getAttribute("user");

        int myId = me.getUserId();
        List<MessageForShow> messageForShowList = msgService.getChatRecords(myId, yourId);

        return messageForShowList;
    }

    @GetMapping("/msg/users")
    @ResponseBody
    public Object getAllChattedUsers(HttpServletRequest request)
    {
        User me = (User) request.getSession().getAttribute("user");
        int myId = me.getUserId();
        Set<User> users = msgService.getAllChattedUser(myId);
        return users;
    }

    @GetMapping("/message/{userId}")
    public String toPrivateMessage(@PathVariable("userId") Integer userId, Model model,HttpServletRequest request)
    {
        model.addAttribute("you",userService.getUserById(userId));
        model.addAttribute("me", (User)request.getSession().getAttribute("user"));
        return "privatemessage";
    }


}
