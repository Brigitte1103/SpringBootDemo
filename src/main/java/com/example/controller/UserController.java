package com.example.controller;

import com.example.pojo.JsonResult;
import com.example.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/getUser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        user.setAge(10);
        user.setBirthday(new Date());
        user.setPassword("password");
        user.setDesc("test desc");
        return user;
    }

    @RequestMapping(value = "/getUserJson")
    @ResponseBody
    public JsonResult getUserJson() {
        User user = new User();
        user.setName("test json");
        user.setAge(10);
        user.setBirthday(new Date());
        user.setPassword("password");

        return JsonResult.ok(user);
    }
}
