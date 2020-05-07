package com.zz.service;

import com.zz.common.vo.PageObject;
import com.zz.pojo.*;

import java.util.List;

public interface SysBaoWenService {
    //    //心跳报
//    PageObject<SYQ_heartbeat> SysSelectBaoWenService(Integer pageCurrent,String RSNM);
//------------------------------------------------------------------------------------
//心跳报
    PageObject<SYQ_heartbeat> selectHeartbeat(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //测试报
    PageObject<SYQ_test> selectTest(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //定时报
    PageObject<SYQ_timing> selectTiming(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //小时报
    PageObject<SYQ_hour> selectHour(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //加报
    PageObject<SYQ_plus> selectPlus(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //远程视频状态报
    PageObject<SYQ_video> selectvideo(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //图像定时报
    PageObject<SYQ_picture_timing> selectPictureTiming(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //图像加报
    PageObject<SYQ_picture_plus> selectPicturePlus(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //开机报
    PageObject<SYQ_starting> selectStarting(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //自检每日报
    PageObject<SYQ_self_inspection> selectSelfInspection(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //初始化固态存储数据
    PageObject<SYQ_initialize> selectInitialize(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //恢复遥测站出厂设置
    PageObject<SYQ_recover> selectRecover(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //设置遥测站时钟
    PageObject<SYQ_clock> selectClock(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //修改密码
    PageObject<SYQ_update_password> selectUpdatePassword(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //启动遥测站摄像头
    PageObject<SYQ_camera> selectCamera(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站查询遥测站状态和报警信息
    PageObject<SYQ_warning> selectWarning(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站查询遥测站实时数据
    PageObject<SYQ_select_hour> selectSelectHour(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站查询遥测站时段数据
    PageObject<SYQ_time_frame> selectTimeFrame(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站修改遥测站基本配置表
    PageObject<SYQ_update_allocation> selectUpdateAllocation(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站读取遥测站基本配置表
    PageObject<SYQ_Read_basic_configuration> selectReadBasicConfiguration(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    //中心站读取遥测站运行参数配置表
    PageObject<SYQ_read_parameter> selectReadParameter(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);

    // 中心站修改遥测站运行参数配置表
    PageObject<SYQ_update_parameter> selsectUpdateParamete(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM);


}
