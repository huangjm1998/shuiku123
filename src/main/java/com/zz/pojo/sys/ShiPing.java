package com.zz.pojo.sys;

import lombok.Data;

@Data
public class ShiPing {
    private Integer id;
    //视频状态信息
    private String Video_message;
    //TAG_video视频运行状态标识符
    private String TAG_video;
    //视频测站地址
    private String Address_station;
    //发报时间
    private String DATAmessage;

}
