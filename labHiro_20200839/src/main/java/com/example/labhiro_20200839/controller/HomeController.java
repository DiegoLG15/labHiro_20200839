package com.example.labhiro_20200839.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class HomeController {
    @GetMapping("/")
    public String index() {
        return "videollamada";
    }
}
