package com.zz.dao;

import com.zz.vo.MenuId;
import com.zz.vo.RoleId;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface SysRoleMenuDao {


    //添加角色和权限数据
    @Insert(" <script>insert into role_menus(roleId,jurisdictionId) values\n" +
            "        <foreach collection=\"jurisdictionIds\" separator=\",\"\n" +
            "        item=\"item\">\n" +
            "        (#{roleId},#{item})\n" +
            "    </foreach> </script>")
    int insertObjects(@Param("roleId") Integer roleId, @Param("jurisdictionIds") Integer[] jurisdictionIds);

//    //修改角色和权限数据
//    @Insert(" <script>insert into role_menus(roleId,jurisdictionId) values\n" +
//            "        <foreach collection=\"jurisdictionIds\" separator=\",\"\n" +
//            "        item=\"item\">\n" +
//            "        (#{roleId},#{item})\n" +
//            "    </foreach> </script>")
//    int updateObjects(@Param("roleId") Integer roleId,@Param("jurisdictionIds")Integer[] jurisdictionIds);

    @Delete("delete from role_menus where roleId=#{id}")
    int deleteById(@Param("id") Integer id);


    //基于角色id查菜单id
    @Select("select jurisdictionID from role_menus where roleId=#{id}")
    List<MenuId> findMenuIdByRoleId(@Param("id") RoleId id);
}
