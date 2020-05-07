package com.zz.pojo.sys;

import lombok.Data;

import java.util.Date;

@Data
public class TuPian {
    private Integer id;
    //定时报图片数据
    private String Picture_message;
    //加报图片数据
    private String Photograph_message;
    //定时报时间
    private String DATAmessage;
    //经度
    private String Longitude;
    //纬度
    private String Latitude;
    private String Video_message;
    //TAG_video视频运行状态标识符
    private String TAG_video;
    //视频测站地址
    private String Address_station;
    //水库名字
    private String RRNM;

}

