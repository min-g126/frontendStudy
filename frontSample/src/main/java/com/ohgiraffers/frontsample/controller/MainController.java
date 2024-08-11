package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    /* 부트스트랩 메인 컨트롤*/
    @GetMapping("/main")
    public String main(Model model){
        return "main/index";
    }
}
