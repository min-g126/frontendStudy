package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/index.html")
    public String admin(Model model){
        return "index";
    }

    /* 차트 */
    @GetMapping("/charts.html")
    public String charts(Model model){
        return "charts";
    }
    @GetMapping("/tables.html")
    public String tables(Model model){
        return "tables";
    }

    /* 사이드바 */
    @GetMapping("/layout-sidenav-light.html")
    public String layoutsidenavlight(Model model){
        return "layout-sidenav-light";
    }
    @GetMapping("/layout-static.html")
    public String layoutstatic(Model model){
        return "layout-static";
    }

    /* 회원 */
    @GetMapping("/login.html")
    public String login(Model model){
        return "login";
    }
    @GetMapping("/password.html")
    public String password(Model model){
        return "password";
    }
    @GetMapping("/register.html")
    public String register(Model model){
        return "register";
    }

    /* 오류 페이지 */
    @GetMapping("/401.html")
    public String error401(Model model){
        return "401";
    }
    @GetMapping("/404.html")
    public String error404(Model model){
        return "404";
    }
    @GetMapping("/500.html")
    public String error500(Model model){
        return "500";
    }
}

