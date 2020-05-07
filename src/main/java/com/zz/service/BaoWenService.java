package com.zz.service;

import com.zz.pojo.*;

import java.text.ParseException;

public interface BaoWenService {

    //心跳报
    int xinTiaoBao(SYQ_heartbeat entity) throws ParseException;

    //测试包
    int ceShiBao(SYQ_test entity);

    //加报
    int jiaBao(SYQ_plus entity);

    //定时报
    int dingShiBao(SYQ_timing entity);

    //小时报
    int xiaoShiBao(SYQ_hour entity);

    //远程状态报
    int yuanChengZhuangTaiBao(SYQ_video entity);

    //图像定时报
    int tuXiangShiBao(SYQ_picture_timing entity);

    //图像加报
    int tuXiangJiaBao(SYQ_picture_plus entity);

    //开机报
    int kaiJiBao(SYQ_starting entity);

    //自检每日报
    int ziJianMeiRiBao(SYQ_self_inspection entity);

    //遥测站实时数据
    int yaoCeZhanShiShiShuJu(SYQ_select_hour entity);


}
