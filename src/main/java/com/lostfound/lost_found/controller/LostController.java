package com.lostfound.lost_found.controller;

import com.lostfound.lost_found.dao.LostInformationMapper;
import com.lostfound.lost_found.pojo.LostForShow;
import com.lostfound.lost_found.pojo.LostInformation;
import com.lostfound.lost_found.pojo.User;
import com.lostfound.lost_found.service.LostService;
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
public class LostController {

    @Resource
    private LostInformationMapper lostInformationMapper;

    @Resource
    private LostService lostService;

    @Resource
    private UserService userService;

    @PostMapping("lost")
    public String putLostInformation(HttpServletRequest request) throws InvocationTargetException, NoSuchMethodException, IllegalAccessException, NoSuchFieldException, ParseException {
        LostInformation lost = new LostInformation();
        RequestUtil.quicklySetFiled(request,lost);
        lost.setReportDate(new Date());
        User user = (User)request.getSession().getAttribute("user");
        lost.setUserId(user.getUserId());
        lost.setLostId(lostService.createLostId());
        lostService.insertLostInformation(lost);
        return "lost";
    }


    @DeleteMapping("lost/{lost_id}")
    public String deleteLost(@PathVariable("lost_id") int lost_id) {
        System.out.println("start");
        lostService.deleteLost(lost_id);
        return "lost";
    }

    @GetMapping("lost/{keyword}")
    public String getLostInformation(@PathVariable("keyword") String keyword, Model model) {
        if (!StringUtils.hasText(keyword))
        {
            return "lost";
        }
        try {
            int lost_id = Integer.valueOf(keyword);
            LostInformation lostInformation = lostService.getLostInformation(lost_id);
            LostForShow lostForShow = lostService.castToLostForShow(lostInformation);
            model.addAttribute("search_lost",lostForShow);
            return "lostDetailedInfo";
        } catch (Exception e) {

        }
        List<LostInformation> lostInformationList = lostService.getLostInformationByKeyword(keyword);
        List<LostForShow> lostForShowList = lostService.castAllToLostForShow(lostInformationList);
        model.addAttribute("search_lostList",lostForShowList);
        return "lostDetailedInfo";
    }

    @GetMapping("lost/all")
    @ResponseBody
    public Object getAllLostInformations(Model model) {
        List<LostForShow> lostForShowList = lostService.castAllToLostForShow(lostService.getAllLostInformation());
        return lostForShowList;
    }

    @GetMapping("setCurrentLostId/{lost_id}")
    @ResponseBody
    public Object setCurrentLostId(HttpServletRequest request,@PathVariable("lost_id") Integer lost_id)
    {
        request.getSession().setAttribute("currentLostId",lost_id);
        return null;
    }

    @GetMapping("lost/mine")
    @ResponseBody
    public Object getAllMyLost(HttpServletRequest request)
    {
        User user = (User)request.getSession().getAttribute("user");
        return lostService.getAllMyLost(user.getUserId());
    }

    @GetMapping("lost/newist")
    @ResponseBody
    public Object getNewistLost()
    {
        return lostService.getNewistLost();
    }
}