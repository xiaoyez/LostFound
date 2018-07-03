package com.lostfound.lost_found.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FormController {

    @RequestMapping("{path}")
    public String load(@PathVariable("path") String path) {
        System.out.println(path);
        return path;
    }
}
