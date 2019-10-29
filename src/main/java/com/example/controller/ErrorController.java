package com.example.controller;

import com.example.pojo.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public String error() {
        int a = 1 / 0;
        return "/err";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxError(){
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxError")
    @ResponseBody
    public JsonResult getAjaxError(){
        int a = 1 / 0;
        return JsonResult.ok();
    }
}
