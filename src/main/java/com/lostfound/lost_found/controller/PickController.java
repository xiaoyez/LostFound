package com.lostfound.lost_found.controller;

import com.lostfound.lost_found.dao.PickInformationMapper;
import com.lostfound.lost_found.pojo.PickForShow;
import com.lostfound.lost_found.pojo.PickInformation;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.service.PickService;
import com.lostfound.lost_found.service.UserService;
import com.lostfound.lost_found.util.RequestUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
public class PickController {

    @Resource
    private PickInformationMapper pickInformationMapper;

    @Resource
    private PickService pickService;

    @Resource
    private UserService userService;

    @PostMapping("pick")
    public String putPickInformation(HttpServletRequest request) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException, ParseException {
        PickInformation pick = new PickInformation();
        RequestUtil.quicklySetFiled(request,pick);
        pick.setReportDate(new Date());
        User user = (User)request.getSession().getAttribute("user");
        pick.setUserId(user.getUserId());
        pick.setPickId(pickService.createPickId());
        pickService.insertPickInformation(pick);
        return "pick";
    }


    @DeleteMapping("pick/{pick_id}")
    public String deletePick(@PathVariable("pick_id") int pick_id) {
        System.out.println("start");
        pickService.deletePick(pick_id);
        return "pick";
    }

    @GetMapping("pick/{keyword}")
    public String getPickInformation(@PathVariable("keyword") String keyword, Model model) {
        if (!StringUtils.hasText(keyword))
        {
            return "pick";
        }
        try {
            int pick_id = Integer.valueOf(keyword);
            PickInformation pickInformation = pickService.getPickInformation(pick_id);
            PickForShow pickForShow = pickService.castToPickForShow(pickInformation);
            model.addAttribute("search_pick",pickForShow);
            return "pickDetailedInfo";
        } catch (Exception e) {

        }
        List<PickInformation> pickInformationList = pickService.getPickInformationByKeyword(keyword);
        List<PickForShow> pickForShowList = pickService.castAllToPickForShow(pickInformationList);
        model.addAttribute("search_pickList",pickForShowList);
        return "lostDetailedInfo";
    }

    @GetMapping("pick/all")
    @ResponseBody
    public Object getAllPickInformations(Model model) {
        List<PickForShow> pickForShowList = pickService.castAllToPickForShow(pickService.getAllPickInformation());
        return pickForShowList;
    }

    @GetMapping("setCurrentPickId/{pick_id}")
    @ResponseBody
    public Object setCurrentPickId(HttpServletRequest request,@PathVariable("pick_id") Integer pick_id)
    {
        request.getSession().setAttribute("currentPickId",pick_id);
        return null;
    }

    @GetMapping("pick/mine")
    @ResponseBody
    public Object getAllMyPick(HttpServletRequest request)
    {
        User user = (User)request.getSession().getAttribute("user");
        return pickService.getAllMyPick(user.getUserId());
    }

    @GetMapping("pick/newist")
    @ResponseBody
    public Object getNewistPick()
    {
        return pickService.getNewistPick();
    }
}