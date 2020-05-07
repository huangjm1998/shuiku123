package com.zz.service;

import com.zz.pojo.SYQ_role;
import com.zz.pojo.SysRoleMenuVo;

import java.util.List;

public interface SysRoleService {
    //查询角色
    List<SYQ_role> findRoles();

    //禁用启用操作
    int vaildById(Integer id, Integer status);

    //修改添加角色
    int saveObject(SYQ_role entity, Integer[] jurisdictionIds);

    //修改页面数据回显
    SysRoleMenuVo findObjectById(Integer id);


    //修改角色
    int updateObject(SYQ_role entity, Integer[] jurisdictionIds);
}
