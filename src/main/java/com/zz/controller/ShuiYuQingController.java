package com.zz.controller;


import com.google.api.client.json.Json;
import com.zz.common.vo.JsonResult;
import com.zz.pojo.sys.ShiPing;
import com.zz.pojo.sys.ShuiWen;
import com.zz.pojo.sys.TuPian;
import com.zz.pojo.sys.YuShuiQing;
import com.zz.service.sys.YuShuiQingq;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@CrossOrigin("*")
@RestController
@RequestMapping("/API/")
public class ShuiYuQingController {
    @Resource
    private YuShuiQingq yuShuiQingq;


    @RequestMapping(value = "rain", method = RequestMethod.GET)
    public JsonResult doFindRain() {
        List<YuShuiQing> hours =
                yuShuiQingq.findHours1();
        return new JsonResult(hours);
    }

    @RequestMapping(value = "poto", method = RequestMethod.GET)
    public JsonResult doFindPoto() {
        List<TuPian> tuPian = yuShuiQingq.findTuPian();
        return new JsonResult(tuPian);
    }

    @RequestMapping(value = "ShuiWen", method = RequestMethod.GET)
    public JsonResult doFindShuiWen() {
        Set<ShuiWen> wen = yuShuiQingq.findShuiWen();
        return new JsonResult(wen);
    }
}
