package com.zz.pojo.sys;

import lombok.Data;


@Data
public class YuShuiQing {
    //序号
    private Integer id;
    //时间
    private String DATAmessage;
    //水库内码
    private String RSINCD;
    //测站号
    private String STCD;
    //水情位置
    private String ADDR;
    //水情类型
    private String ATCUNIT;
    //行政区划
    private String ADDVCD;
    //经度
    private double LGTD;
    //纬度
    private double STLC;
    //水库名字
    private String RRNM;
    //日降雨量
    private double DYP;

}
