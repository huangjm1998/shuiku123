package com.zz.service.sys;

import com.zz.pojo.sys.ShiPing;
import com.zz.pojo.sys.ShuiWen;
import com.zz.pojo.sys.TuPian;
import com.zz.pojo.sys.YuShuiQing;

import java.util.List;
import java.util.Set;

public interface YuShuiQingq {

    //雨水情信息
    List<YuShuiQing> findHours1();

    //图片信息
    List<TuPian> findTuPian();

    //水文
    Set<ShuiWen> findShuiWen();

}
