package com.zz.dao;


import com.zz.pojo.SysArea;
import com.zz.pojo.User;
import com.zz.vo.Menus;
import com.zz.vo.SysRoleName;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserDao {
    //用户登录
    @Select("select s.*,r.name,r.status from SYQ_user s,user_role u,SYQ_role r\n" +
            "where s.id=u.userId and u.roleId=r.id and telephone=#{telephone}")
    User findUserByUserName(@Param("telephone") String telephone);

    //基于用户id查询权限信息
    @Select("select distinct j.menu from SYQ_user s,user_role u,SYQ_role r,SYQ_jurisdiction j,role_menus r1\n" +
            "where s.id=u.userId and u.roleId=r.id and r.id=r1.roleId and r1.jurisdictionId=j.jurisdictionID and r.name=#{name}")
    List<Menus> findMenuByUserName(@Param("name") String name);


    //查询用户
    List<User> findUsers(String Province, String City, String County, String name, String dengluming, Integer pageCurrent, Integer pageSize);

    //地区省市县联动查询
    @Select("SELECT name,LVL FROM SYQ__AREA where PARENTNAME like '%${name}%' and LVL=${LVL}")
    List<SysArea> area(@Param("name") String name, @Param("LVL") Integer LVL);


    //添加用户时查询所有角色
    @Select("select * from SYQ_role;")
    List<SysRoleName> findRoles();


    //查询角色权限
    @Select("select distinct j.menu from SYQ_jurisdiction j ,SYQ_role s,role_menus r where s.name=#{name} and j.jurisdictionID=r.jurisdictionId")
    List<User> findRoleMenu(String name);

    //添加用户
    int saveUser(User entity);

    //添加用户和角色信息
    @Insert("insert into user_role(userId,roleId) values(#{userId},#{roleId})")
    int saveUserRole(Integer userId, Integer roleId);

    //禁用和启用用户
    int vaildUserById(Integer id, Integer userstatus);


    //查询用户数量
    int findUserSize(String Province, String City, String County, String name, String dengluming);


    //修改用户自身信息
    @Update("update SYQ_user set username=#{username},password=#{password},telephone=#{telephone},Province=#{Province},City=#{City},County=#{County},userstatus=#{userstatus},dengluming=#{dengluming} where id=#{id}")
    int updateUser(User entity);


    int findtelephone(String telephone);
}
