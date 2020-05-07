package com.zz.service.impl;

import com.zz.dao.sys.YuShuiQingDao;
import com.zz.pojo.sys.ShuiWen;
import com.zz.pojo.sys.TuPian;
import com.zz.pojo.sys.YuShuiQing;
import com.zz.service.sys.YuShuiQingq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class YuShuiQingImpl implements YuShuiQingq {
    @Resource
    private YuShuiQingDao yuShuiQingDao;

    @Override
    public List<YuShuiQing> findHours1() {
        List<YuShuiQing> hours = yuShuiQingDao.findHours();
        return hours;

    }

    @Override
    public List<TuPian> findTuPian() {
        List<TuPian> pian = yuShuiQingDao.findTuPian();

        for (TuPian s :
                pian) {
            String s11 = s.getDATAmessage();
            String s2 = s11.substring(0, s11.length() - 2);
            s.setDATAmessage(s2);
        }
        return pian;
    }


    @Override
    public Set<ShuiWen> findShuiWen() {
        Set<ShuiWen> wen = yuShuiQingDao.findShuiWen();
        return wen;
    }
}
