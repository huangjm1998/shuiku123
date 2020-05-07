package com.zz.pojo.sys;

import lombok.Data;

import java.util.Date;

@Data
public class ShuiWen {
    private Integer id;
    //获取时间
    private Date MODITIME;
    //水库内码
    private String RSINCD;
    //水文站玛
    private String STCD;
    //水文位置
    private String RRNM;
    //水库类型
    private String RSVRTP;
    //汛期类别
    private String FSTP;
    //入库流量
    private double INQ;
    //蓄水位
    private double W;
    //库水位
    private double RZ;
    //汛限水位
    private double FSLTDZ;
    //水势
    private String RWPTN;
    //标识符
    private String IDE;
    //经度
    private double LGTD;
    //纬度
    private double LTTD;
}
