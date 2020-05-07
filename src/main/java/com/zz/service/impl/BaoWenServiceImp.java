package com.zz.service.impl;

import com.zz.common.config.jiexi.XinTiaoBao;
import com.zz.dao.BaoWenDao;
import com.zz.dao.DataDao;
import com.zz.pojo.*;
import com.zz.service.BaoWenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BaoWenServiceImp implements BaoWenService {
    @Resource
    private DataDao dataDao;
    @Resource
    private BaoWenDao baoWenDao;

    //心跳报
    @Override
    public int xinTiaoBao(SYQ_heartbeat entity) {
        int i = dataDao.xinTiaoBao(entity);
        System.out.println(i);
        return i;
    }

    //测试报
    @Override
    public int ceShiBao(SYQ_test entity) {
        return dataDao.ceShiBao(entity);

    }

    //加报
    @Override
    public int jiaBao(SYQ_plus entity) {
        return dataDao.jiaBao(entity);
    }

    //定时报
    @Override
    public int dingShiBao(SYQ_timing entity) {
        baoWenDao.shuiQing(entity);
        return dataDao.dingShiBao(entity);
    }


    //小时报
    @Override
    public int xiaoShiBao(SYQ_hour entity) {
        baoWenDao.PPTN(entity);
        return dataDao.xiaoShiBao(entity);
    }


    //远程状态报
    @Override
    public int yuanChengZhuangTaiBao(SYQ_video entity) {
        baoWenDao.video(entity);
        return dataDao.yuanChengZhuangTaiBao(entity);
    }


    //图像定时报
    @Override
    public int tuXiangShiBao(SYQ_picture_timing entity) {
        baoWenDao.poto1(entity);
        return dataDao.tuXiangDingShiBao(entity);
    }

    @Override
    public int tuXiangJiaBao(SYQ_picture_plus entity) {
        baoWenDao.poto(entity);
        return dataDao.tuXiangJiaBao(entity);
    }

    @Override
    public int kaiJiBao(SYQ_starting entity) {
        return dataDao.kaiJiBao(entity);
    }

    @Override
    public int ziJianMeiRiBao(SYQ_self_inspection entity) {
        return dataDao.ziJianBao(entity);
    }

    @Override
    public int yaoCeZhanShiShiShuJu(SYQ_select_hour entity) {
        return dataDao.yaoCeZhanShiShiShuJu(entity);
    }


}
