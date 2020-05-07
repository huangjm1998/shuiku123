package com.zz.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class SysRoleName implements Serializable {
    private Integer id;
    private String name;
    private String status;
}
