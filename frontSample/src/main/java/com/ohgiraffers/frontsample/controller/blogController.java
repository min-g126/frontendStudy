package com.ohgiraffers.frontsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class blogController {
    @GetMapping("/blog")
    public String blogHome(Model model){
        return "blog/blogHome";
    }

    @GetMapping("/blogpost")
    public String blogPost(Model model){
        return "blog/blogPost";
    }
}
