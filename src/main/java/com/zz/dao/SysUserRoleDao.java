package com.zz.dao;

import com.zz.vo.RoleId;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SysUserRoleDao {
    @Select("select roleId from user_role where userId=#{id}")
    RoleId findRoleIdByUserId(@Param("id") Integer id);

    //删除用户跟角色信息
    @Delete("delete from user_role where userId = #{id}")
    int deleteUserAndRoles(Integer id);
}
