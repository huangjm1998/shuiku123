package com.zz.service.impl;

import com.zz.common.exception.ServiceException;
import com.zz.common.vo.PageObject;
import com.zz.dao.SysBaoWenDao;
import com.zz.pojo.*;
import com.zz.service.SysBaoWenService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@RequiresPermissions("SYS:YAOCE:SHUJU")
public class SysBaoWenServiceImpl implements SysBaoWenService {
    @Resource
    private SysBaoWenDao sysBaoWenDao;
    //心跳报

    @Override
    public PageObject<SYQ_heartbeat> selectHeartbeat(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int i = sysBaoWenDao.selectcount(city, TENstation, RSNM);
        if (i == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_heartbeat> objects = sysBaoWenDao.selectHeartbeat(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_heartbeat> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(i);
        pageObject.setRecords(objects);
        pageObject.setPageCount((i - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //测试
    @Override
    public PageObject<SYQ_test> selectTest(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountceshi(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_test> objects = sysBaoWenDao.selectTest(pageCurrent, pageSize, city, TENstation, RSNM);
        System.out.println(objects);
        PageObject<SYQ_test> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //定时报
    @Override
    public PageObject<SYQ_timing> selectTiming(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountdingshi(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_timing> objects = sysBaoWenDao.selectTiming(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_timing> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //小时报
    @Override
    public PageObject<SYQ_hour> selectHour(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountxiaoshi(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_hour> objects = sysBaoWenDao.selectHour(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_hour> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //加报
    @Override
    public PageObject<SYQ_plus> selectPlus(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountjiabao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_plus> objects = sysBaoWenDao.selectPlus(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_plus> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //远程视频状态报
    @Override
    public PageObject<SYQ_video> selectvideo(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountshipingzhuangtai(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_video> objects = sysBaoWenDao.selectvideo(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_video> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //图像定时报
    @Override
    public PageObject<SYQ_picture_timing> selectPictureTiming(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcounttuxiangdingshi(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_picture_timing> objects = sysBaoWenDao.selectPictureTiming(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_picture_timing> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //图像加报
    @Override
    public PageObject<SYQ_picture_plus> selectPicturePlus(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcounttuxiangjiabao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_picture_plus> objects = sysBaoWenDao.selectPicturePlus(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_picture_plus> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //开机报
    @Override
    public PageObject<SYQ_starting> selectStarting(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountkaijibao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_starting> objects = sysBaoWenDao.selectStarting(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_starting> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //自检每日报
    @Override
    public PageObject<SYQ_self_inspection> selectSelfInspection(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountzijianbao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_self_inspection> objects = sysBaoWenDao.selectSelfInspection(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_self_inspection> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //初始化固态存储数据
    @Override
    public PageObject<SYQ_initialize> selectInitialize(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountgutaicunchu(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_initialize> objects = sysBaoWenDao.selectInitialize(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_initialize> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //恢复遥测站出厂设置
    @Override
    public PageObject<SYQ_recover> selectRecover(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountchuchangshezhi(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_recover> objects = sysBaoWenDao.selectRecover(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_recover> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //设置遥测站时钟
    @Override
    public PageObject<SYQ_clock> selectClock(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountyaoceshizhong(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_clock> objects = sysBaoWenDao.selectClock(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_clock> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //修改密码
    @Override
    public PageObject<SYQ_update_password> selectUpdatePassword(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountxiugaimima(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_update_password> objects = sysBaoWenDao.selectUpdatePassword(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_update_password> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_camera> selectCamera(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountshexiangtou(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_camera> objects = sysBaoWenDao.selectCamera(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_camera> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_warning> selectWarning(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountzhuangtaibaojing(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_warning> objects = sysBaoWenDao.selectWarning(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_warning> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    //中心站遥测实时数据
    @Override
    public PageObject<SYQ_select_hour> selectSelectHour(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountshishishuju(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_select_hour> objects = sysBaoWenDao.selectSelectHour(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_select_hour> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_time_frame> selectTimeFrame(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountshiduanshuju(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_time_frame> objects = sysBaoWenDao.selectTimeFrame(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_time_frame> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_update_allocation> selectUpdateAllocation(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountpeizhibiao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_update_allocation> objects = sysBaoWenDao.selectUpdateAllocation(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_update_allocation> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_Read_basic_configuration> selectReadBasicConfiguration(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountyaochepeizhibiao(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_Read_basic_configuration> objects = sysBaoWenDao.selectReadBasicConfiguration(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_Read_basic_configuration> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_read_parameter> selectReadParameter(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountyunxingcanshu(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_read_parameter> objects = sysBaoWenDao.selectReadParameter(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_read_parameter> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }

    @Override
    public PageObject<SYQ_update_parameter> selsectUpdateParamete(Integer pageCurrent, Integer pageSize, String city, String TENstation, String RSNM) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int count = sysBaoWenDao.selectcountxiugaiyunxingcanshu(city, TENstation, RSNM);
        if (count == 0)
            throw new ServiceException("系统没有条记录");
        List<SYQ_update_parameter> objects = sysBaoWenDao.selsectUpdateParamete(pageCurrent, pageSize, city, TENstation, RSNM);
        PageObject<SYQ_update_parameter> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setPageSize(pageSize);
        pageObject.setRowCount(count);
        pageObject.setRecords(objects);
        pageObject.setPageCount((count - 1) / pageSize + 1);
        //5.返回封装结果。
        return pageObject;
    }


    //心跳报
//    @Override
//    public PageObject<SYQ_heartbeat> SysSelectBaoWenService(Integer pageCurrent,String RSNM) {
////        if(pageCurrent ==null || pageCurrent<1){
////            throw new ServiceException("页码值无效");
////        }
////        //设置起始位置
////        int pageSize = 2;
////        //查询总条数
////        int count = sysBaoWenDao.getRouCount();
////        if(count == 0 )
////            throw new ServiceException("系统没有条记录");
////        //起始位置
////        int startIndex = (pageCurrent-1)*pageSize;
////        int id=0;
////        List<SYQ_heartbeat> records = sysBaoWenDao.sysXinTiaoBao(startIndex, pageSize,id);
////        PageObject<SYQ_heartbeat> pageObject = new PageObject<>();
////        pageObject.setPageCount((count-1)/pageSize+1);
////        pageObject.setPageSize(pageSize);
////        pageObject.setRowCount(count);
////        pageObject.setRecords(records);
////        pageObject.setPageCurrent(pageCurrent);
////        return pageObject;
//        if(pageCurrent==null||pageCurrent<1)
//            throw new IllegalArgumentException("当前页码不正确");
//        //2.基于条件查询总记录数
//        //2.1) 执行查询
//        int rowCount=sysBaoWenDao.getRouCount(RSNM);
//        //2.2) 验证查询结果，假如结果为0不再执行如下操作
//        if(rowCount==0)
//            throw new ServiceException("系统没有查到对应记录");
//        //3.基于条件查询当前页记录(pageSize定义为2)
//        //3.1)定义pageSize
//        int pageSize=2;
//        //3.2)计算startIndex
//        int startIndex=(pageCurrent-1)*pageSize;
//        //3.3)执行当前数据的查询操作
//
//        List<SYQ_heartbeat> records=
//                sysBaoWenDao.sysXinTiaoBao(pageCurrent,RSNM);
//        //4.对分页信息以及当前页记录进行封装
//        //4.1)构建PageObject对象
//        PageObject<SYQ_heartbeat> pageObject=new PageObject<>();
//        //4.2)封装数据
//        pageObject.setPageCurrent(pageCurrent);
//        pageObject.setPageSize(pageSize);
//        pageObject.setRowCount(rowCount);
//        pageObject.setRecords(records);
//        pageObject.setPageCount((rowCount-1)/pageSize+1);
//        //5.返回封装结果。
//        return pageObject;
//    }
}
