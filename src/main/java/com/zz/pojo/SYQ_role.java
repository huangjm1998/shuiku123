package com.zz.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;
import java.util.Set;

/**
 * @文件名称：SYQ_role.java
 * @创建时间：2020-04-13 09:12:13
 * @创 建  人：曾凡宇
 * @文件描述：SYQ_role 实体类
 * @文件版本：V0.01
 */

@Data
public class SYQ_role {
    private Integer id;
    private String name;
    private Integer status = 1;
    //@JsonIgnore
    private String menu;
    private String[] menus;
    private List<SYQ_jurisdiction> SYQ_jurisdictions;

}

