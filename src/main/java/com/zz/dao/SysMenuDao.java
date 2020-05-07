package com.zz.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SysMenuDao {
    //基于菜单id查权限标识
    List<String> findPremissions(@Param("jurisdictionIDs") Integer[] jurisdictionIDs);
}
