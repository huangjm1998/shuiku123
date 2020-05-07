package com.zz.dao;

import com.zz.pojo.SYQ_jurisdiction;
import com.zz.pojo.SYQ_role;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;

import java.util.List;

@Mapper
public interface SysRoleDao {

    //查询角色
    @Select("select * from SYQ_role")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "status", property = "status"),
            @Result(column = "id", property = "SYQ_jurisdictions", many = @Many(select = "com.zz.dao.SysRoleDao.getSYQ_jurisdictions"))
    })
    List<SYQ_role> findRoles();

    @Select("select j.* from SYQ_jurisdiction j join role_menus rm on j.jurisdictionID = rm.jurisdictionId where roleid = #{id}")
    List<SYQ_jurisdiction> getSYQ_jurisdictions(int id);

    //禁用启用操作
    @Update("update SYQ_role set status=#{status} where id=#{id}")
    int updateRole(@Param("id") Integer id, @Param("status") Integer status);

    //添加角色
    // @Insert("insert into SYQ_role (name,status) values(#{name},#{status})")
    int insertRole(SYQ_role entity);

    //修改角色页面回显
    @Select("select * from SYQ_role where id=#{id}")
    SYQ_role findRoleById(Integer id);

    //根据角色id查询权限名称
    @Select("select distinct  j.menu from role_menus r,SYQ_jurisdiction j,SYQ_role s where ${id}=r.roleId and r.jurisdictionId=j.jurisdictionID")
    String[] findMenu(@Param("id") Integer id);


    //角色更新
    @Update(" update SYQ_role\n" +
            "         set\n" +
            "           name=#{name},\n" +
            "           status=#{status}\n" +
            "        where id=#{id}")
    int updateRoles(SYQ_role entity);

    //查询角色名称
    @Select("select count(*) from SYQ_role where name=#{name}")
    int selectRole(@Param("name") String name);
}
