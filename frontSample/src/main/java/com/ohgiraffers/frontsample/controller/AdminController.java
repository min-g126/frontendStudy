package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/index.html")
    public String admin(Model model){
        return "index";
    }
    @GetMapping("/layout-sidenav-light.html")
    public String layoutsidenavlight(Model model){
        return "layout-sidenav-light";
    }
}

