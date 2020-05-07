package com.zz.controller;

import com.zz.common.util.TekonUtil;
import com.zz.common.vo.JsonResult;
import com.zz.common.vo.PageObject;
import com.zz.pojo.*;
import com.zz.service.SysBaoWenService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/API/")
public class SysBaoWenController {

    @Resource
    private SysBaoWenService sysBaoWenService;

    //心跳
    @RequestMapping("xintiao/{token}")
    public JsonResult xinTiao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_heartbeat> pageObject = sysBaoWenService.selectHeartbeat(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }


    }

    //测试
    @RequestMapping("ceshi/{token}")
    public JsonResult ceshi(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_test> pageObject = sysBaoWenService.selectTest(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //定时报
    @RequestMapping("dingshi/{token}")
    public JsonResult dingshi(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_timing> pageObject = sysBaoWenService.selectTiming(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //小时报
    @RequestMapping("xiaoshi/{token}")
    public JsonResult xiaoshi(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_hour> pageObject = sysBaoWenService.selectHour(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //加报
    @RequestMapping("jiabao/{token}")
    public JsonResult jiabao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_plus> pageObject = sysBaoWenService.selectPlus(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //远程视频状态报
    @RequestMapping("shipingzhuangtai/{token}")
    public JsonResult shipingzhuangtai(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_video> pageObject = sysBaoWenService.selectvideo(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //图像定时报
    @RequestMapping("tuxiangdingshi/{token}")
    public JsonResult tuxiangdingshi(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_picture_timing> pageObject = sysBaoWenService.selectPictureTiming(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }

    //图像加报
    @RequestMapping("tuxiangjiabao/{token}")
    public JsonResult tuxiangjiabao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_picture_plus> pageObject = sysBaoWenService.selectPicturePlus(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //开机报
    @RequestMapping("kaijibao/{token}")
    public JsonResult kaijibao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_starting> pageObject = sysBaoWenService.selectStarting(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }

    //自检每日报
    @RequestMapping("zijianbao/{token}")
    public JsonResult zijianbao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_self_inspection> pageObject = sysBaoWenService.selectSelfInspection(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }


    //初始化固态存储数据
    @RequestMapping("gutaicunchu/{token}")
    public JsonResult gutaicunchu(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_initialize> pageObject = sysBaoWenService.selectInitialize(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }

    //恢复遥测站出厂设置
    @RequestMapping("chuchang/{token}")
    public JsonResult chuchang(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_recover> pageObject = sysBaoWenService.selectRecover(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }


    //设置遥测站时钟
    @RequestMapping("yaoceshizhong/{token}")
    public JsonResult yaoceshizhong(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_clock> pageObject = sysBaoWenService.selectClock(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }

    //修改密码
    @RequestMapping("xiugaimima/{token}")
    public JsonResult xiugaimima(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_update_password> pageObject = sysBaoWenService.selectUpdatePassword(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }

    //启动遥测站摄像头
    @RequestMapping("shexiangtou/{token}")
    public JsonResult shexiangtou(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_camera> pageObject = sysBaoWenService.selectCamera(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }
    }


    //中心站查询遥测站状态和报警信息
    @RequestMapping("zhuangtaibaojing/{token}")
    public JsonResult zhuangtaibaojing(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_warning> pageObject = sysBaoWenService.selectWarning(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //中心站查询遥测站实时数据
    @RequestMapping("shishishuju/{token}")
    public JsonResult shishishuju(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_select_hour> pageObject = sysBaoWenService.selectSelectHour(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //中心站查询遥测站时段数据
    @RequestMapping("shiduanshuju/{token}")
    public JsonResult shiduanshuju(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_time_frame> pageObject = sysBaoWenService.selectTimeFrame(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //中心站修改遥测站基本配置表
    @RequestMapping("peizhibiao/{token}")
    public JsonResult peizhibiao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_update_allocation> pageObject = sysBaoWenService.selectUpdateAllocation(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //中心站读取遥测站基本配置表
    @RequestMapping("duqupeizhibiao/{token}")
    public JsonResult duqupeizhibiao(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_Read_basic_configuration> pageObject = sysBaoWenService.selectReadBasicConfiguration(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    //中心站读取遥测站运行参数配置表
    @RequestMapping("yunxingcanshu/{token}")
    public JsonResult yunxingcanshu(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_read_parameter> pageObject = sysBaoWenService.selectReadParameter(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }

    // 中心站修改遥测站运行参数配置表
    @RequestMapping("xiugaiyunxingcanshu/{token}")
    public JsonResult xiugaiyunxingcanshu(Integer pageCurrent, Integer pageSize, String city, String TENstation, String SKname, @PathVariable String token) {
        if (UserController.S.equals(token)) {
            PageObject<SYQ_update_parameter> pageObject = sysBaoWenService.selsectUpdateParamete(pageCurrent, pageSize, city, TENstation, SKname);
            return JsonResult.success(pageObject);
        } else {
            return JsonResult.error(500, "TOKEN无效");
        }

    }


}
