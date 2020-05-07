package com.zz.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleMenuVo implements Serializable {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String[] getMenu() {
        return menu;
    }

    public void setMenu(String[] menu) {
        this.menu = menu;
    }

    private Integer id;

    //角色名称
    private String name;

    //角色状态
    private Integer status;

    //角色对应的菜单
    private String[] menu;
}
