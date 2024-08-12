package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FooterController {
    @GetMapping("/footer")
    public String header(Model model){
        return "fragment/footer/footer";
    }
}
