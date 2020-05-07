package com.zz.service;

import com.zz.common.vo.PageObject;
import com.zz.pojo.SysArea;
import com.zz.pojo.User;
import com.zz.vo.SysRoleName;

import java.util.List;

public interface UserService {

    //禁用启用
    int statusById(Integer userID, Integer userStatus);

    //查询用户
    PageObject<User> findUser(String Province, String City, String County, String name, String dengluming, Integer pageCurrent, Integer pageSize);

    //地区二连
    List<SysArea> eara(String name, Integer LVL);

    //添加用户时查询所有角色
    List<SysRoleName> findRoleName();

    //添加用户
    int saveUser(User entity, Integer roleId);

    //修改用户
    int updateUser(User entity, Integer roleId);
}
