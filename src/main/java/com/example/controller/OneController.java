package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("one")
public class OneController {

    @RequestMapping("/index")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("name", "test");
        return "thymeleaf/index";
    }
}
