package com.zz.pojo;

import com.zz.vo.Menus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

/**
 * @文件名称：SYQ_user.java
 * @创建时间：2020-04-13 09:11:58
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_user 实体类
 * @文件版本：V0.01
 */
@Data
@Accessors(chain = true)
public class User {
    private String dengluming;
    private Integer id;
    private String username;
    private String password;
    private String telephone;
    private String Province;
    private String City;
    private String County;
    private String name;
    private Integer userstatus;
    //权限信息
    private List<Menus> menu;
    //角色状态信息
    private Integer status;
    //private String address;
//	public void setUserID(Integer userID){
//	this.userID=userID;
//	}
//	public Integer getUserID(){
//		return userID;
//	}
//	public void setUserName(String userName){
//	this.userName=userName;
//	}
//	public String getUserName(){
//		return userName;
//	}
//	public void setPassword(String password){
//	this.password=password;
//	}
//	public String getPassword(){
//		return password;
//	}
//	public void setTelephone(Integer telephone){
//	this.telephone=telephone;
//	}
//	public Integer getTelephone(){
//		return telephone;
//	}
//	public void setProvince(String Province){
//	this.Province=Province;
//	}
//	public String getProvince(){
//		return Province;
//	}
//	public void setCity(String City){
//	this.City=City;
//	}
//	public String getCity(){
//		return City;
//	}
//	public void setCounty(String County){
//	this.County=County;
//	}
//	public String getCounty(){
//		return County;
//	}
//	public void setRoleID(Integer roleID){
//	this.roleID=roleID;
//	}
//	public Integer getRoleID(){
//		return roleID;
//	}
//	public void setUser_status(Integer user_status){
//	this.user_status=user_status;
//	}
//	public Integer getUser_status(){
//		return user_status;
//	}
}

