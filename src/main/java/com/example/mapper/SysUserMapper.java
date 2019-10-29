package com.example.mapper;

import com.example.pojo.SysUser;
import com.example.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component("sysUserMapper")
public interface SysUserMapper extends MyMapper<SysUser> {
}