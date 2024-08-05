package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String index(Model model){
     return "charts";
    }
    @GetMapping("/sidenav")
    public String sidenav(Model model){
        return "layout-sidenav-light";
    }
    @GetMapping("/static")
    public String layoutStatic(Model model){
        return "layout-static";
    }
    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }


}

