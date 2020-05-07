package com.zz.controller;


import com.zz.common.config.jiexi.*;
import com.zz.common.exception.ServiceException;
import com.zz.common.vo.JsonResult;
import com.zz.pojo.*;
import com.zz.service.BaoWenService;

import net.minidev.json.JSONObject;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Map;

@RestController
@RequestMapping("/BaoWen")
public class BaoWenController {

    @Resource
    private BaoWenService baoWenService;

    @RequestMapping(value = "/jiexi")
    public JsonResult baoWen(@RequestBody Map o) throws ParseException, IOException {
        String str = (String) o.get("str");
        System.out.println(str);
        //  System.out.println(str);
        if (str == "" || str == null)
            throw new ServiceException("接收报文为空");
        String s = str.toLowerCase();
        //功能码
        String sq = s.substring(20, 22);
        System.out.println(sq);
        if (sq.equals("2f")) {
            SYQ_heartbeat method = XinTiaoBao.method(s);
            int i = baoWenService.xinTiaoBao(method);
        } else if (sq.equals("30")) {
            SYQ_test method = TestMessage.method(s);
            int i = baoWenService.ceShiBao(method);
            System.out.println(i);
        } else if (sq.equals("33")) {
            SYQ_plus method = JiaoBao.method(s);
            int i = baoWenService.jiaBao(method);
            System.out.println(i);
        } else if (sq.equals("32")) {
            SYQ_timing method = DingShiBao.method(s);
            int i = baoWenService.dingShiBao(method);
            System.out.println(i);
        } else if (sq.equals("34")) {
            System.out.println("这是小时报");
            SYQ_hour method = XiaoShi.method(s);
            int i = baoWenService.xiaoShiBao(method);
            System.out.println(i);
        } else if (sq.equals("f1")) {
            System.out.println("这是远程视频状态报");
            SYQ_video methods = YuanChengZhuangTaiBao.methods(s);
            int i = baoWenService.yuanChengZhuangTaiBao(methods);
            System.out.println(i);
        } else if (sq.equals("e6")) {
            System.out.println("这是图像定时报");
            SYQ_picture_timing method = TuXiangDinShiBao.method(s);
            int i = baoWenService.tuXiangShiBao(method);
            System.out.println(i);
        } else if (sq.equals("e3")) {
            System.out.println("这是图像加报");
            SYQ_picture_plus method = TuXiangJiaBao.method(s);
            int i = baoWenService.tuXiangJiaBao(method);
            System.out.println(i);
        } else if (sq.equals("e0")) {
            System.out.println("这是开机报");
            SYQ_starting methods = KaiJiBao.methods(s);
            int i = baoWenService.kaiJiBao(methods);
            System.out.println(i);
        } else if (sq.equals("f2")) {
            System.out.println("这是自检每日报");
            SYQ_self_inspection method = ZiJianBao.method(s);
            int i = baoWenService.ziJianMeiRiBao(method);
            System.out.println(i);
        } else if (sq.equals("37")) {
            System.out.println("这是中心站遥测实时数据");
            SYQ_select_hour method = ZhongXinZhanShishiShuJu.method(s);
            int i = baoWenService.yaoCeZhanShiShiShuJu(method);
            System.out.println(i);
        }
        return new JsonResult("接收成功");

    }
//   public JSONObject getJSONParam(HttpServletRequest request){
//      JSONObject jsonParam = null;
//      try {
//         // 获取输入流
//         BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
//
//         // 数据写入Stringbuilder
//         StringBuilder sb = new StringBuilder();
//         String line = null;
//         while ((line = streamReader.readLine()) != null) {
//            sb.append(line);
//         }
//         jsonParam = JSONObject.parseObject(sb.toString());
//         System.out.println(jsonParam.toJSONString());
//      } catch (Exception e) {
//         e.printStackTrace();
//      }
//      return jsonParam;
//   }
}
