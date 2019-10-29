package com.example.mapper;

import com.example.pojo.SysUser;
import com.example.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("sysUserMapperCustom")
public interface SysUserMapperCustom extends MyMapper<SysUser> {

    List<SysUser> queryUserSimplyInfoById(@Param("id") Integer id);
}