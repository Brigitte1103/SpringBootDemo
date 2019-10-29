package com.example.controller;

import com.example.pojo.JsonResult;
import com.example.pojo.SysUser;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {

    @Autowired
    private UserService userService;

    @RequestMapping("/saveUser")
    public JsonResult saveUser() throws Exception{
        SysUser user = new SysUser();
        user.setUsername("test" + new Date());
        user.setNickname("test" + new Date());
        user.setPassword("123456");
        user.setIsDelete(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userService.saveUser(user);

        return JsonResult.ok("保存成功");
    }

    @RequestMapping("/updateUser")
    public JsonResult updateUser() {

        SysUser user = new SysUser();
        user.setId(1);
        user.setUsername("update" + new Date());
        user.setNickname("update" + new Date());
        user.setPassword("123456");
        user.setIsDelete(0);
        user.setUpdateTime(new Date());

        userService.updateUser(user);

        return JsonResult.ok("更新成功");
    }

    @RequestMapping("/deleteUser")
    public JsonResult deleteUser() {

        userService.deleteUser(1);

        return JsonResult.ok("删除成功");
    }

    @RequestMapping("/queryUserById")
    public JsonResult queryUserById() {

        return JsonResult.ok(userService.queryUserById(1));
    }

    @RequestMapping("/queryUserList")
    public JsonResult queryUserList() {

        SysUser user = new SysUser();
        user.setUsername("test");
        user.setNickname("test");

        return JsonResult.ok(userService.queryUserList(user));
    }

    @RequestMapping("/queryUserListPaged")
    public JsonResult queryUserListPaged(Integer page) {
        if (page == null){
            page = 1;
        }
        int pageSize = 10;
        SysUser sysUser = new SysUser();
        sysUser.setNickname("test");
        List<SysUser> userList = userService.queryUserListPaged(sysUser, page, pageSize);

        return JsonResult.ok(userList);

    }

    @RequestMapping("/queryUserSimplyInfoById")
    public JsonResult queryUserSimplyInfoById(){

        return JsonResult.ok(userService.queryUserByIdCustom(1));
    }

    @RequestMapping("/saveUserTransactional")
    public JsonResult saveUserTransactional(){

        SysUser user = new SysUser();
        user.setUsername("trans" + new Date());
        user.setNickname("trans" + new Date());
        user.setPassword("123456");
        user.setIsDelete(0);
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());

        userService.saveUserTransactional(user);
        return JsonResult.ok("保存成功");
    }
}
