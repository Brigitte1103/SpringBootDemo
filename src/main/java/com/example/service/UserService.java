package com.example.service;

import com.example.pojo.SysUser;

import java.util.List;

public interface UserService {

    public void saveUser(SysUser user);

    public void updateUser(SysUser user);

    public void deleteUser(Integer userId);

    public SysUser queryUserById(Integer userId);

    public List<SysUser> queryUserList(SysUser user);

    public List<SysUser>queryUserListPaged(SysUser user, Integer page, Integer pageSize);

    public SysUser queryUserByIdCustom(Integer userId);

    public void saveUserTransactional(SysUser user);
}
