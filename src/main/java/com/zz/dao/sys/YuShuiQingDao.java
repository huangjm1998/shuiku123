package com.zz.dao.sys;

import com.zz.pojo.sys.ShiPing;
import com.zz.pojo.sys.ShuiWen;
import com.zz.pojo.sys.TuPian;
import com.zz.pojo.sys.YuShuiQing;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Set;


@Mapper
public interface YuShuiQingDao {

    //查询雨水情信息
    @Select("SELECT * FROM ST_RSVRFCCH_B  A LEFT JOIN (" +
            "      SELECT F.* FROM (SELECT MAX(id) AS id FROM SYQ_hour GROUP BY TENstation) D LEFT JOIN  SYQ_hour F ON D.id=F.id) B ON A.TENstation=B.TENstation " +
            "  LEFT JOIN (SELECT F.* FROM (SELECT MAX(id) AS id FROM ST_PPTN_R  GROUP BY STCD) D LEFT JOIN  ST_PPTN_R  F ON D.id=F.id) C ON A.TENstation=C.STCD" +
            "  WHERE C.STCD IS NOT NULL and B.DATAmessage>DATEADD(HOUR, -1, GETDATE())")
//whereand s.DATAmessage>DATEADD(HOUR, -1, GETDATE())
    List<YuShuiQing> findHours();


    //查询照片视频数据
    @Select("SELECT * FROM SYQ_picture_timing  A LEFT JOIN (" +
            "               SELECT F.* FROM (SELECT MAX(id) AS id FROM SYQ_video GROUP BY TENstation) D LEFT JOIN  SYQ_video F ON D.id=F.id) B ON A.TENstation=B.TENstation " +
            "              LEFT JOIN (SELECT F.* FROM (SELECT MAX(id) AS id FROM SYQ_picture_plus  GROUP BY TENstation) D LEFT JOIN  SYQ_picture_plus  F ON D.id=F.id) C ON A.TENstation=C.TENstation" +
            "             LEFT JOIN (SELECT F.* FROM (SELECT MAX(id) AS id FROM ST_RSVRFCCH_B  GROUP BY TENstation) D LEFT JOIN  ST_RSVRFCCH_B  F ON D.id=F.id) D ON A.TENstation=D.TENstation WHERE  A.DATAmessage>DATEADD(HOUR, -1, GETDATE())")
//
    List<TuPian> findTuPian();


    //水文
    @Select("SELECT s.RWPTN,B.RSINCD,b.STCD,B.RRNM,b.RSVRTP,s.INQ,s.W,s.RZ,s1.FSLTDZ,b.LGTD,s.MODITIME from ST_RSVR_R s,ST_RSVRFCCH_B b,SENDEPTH_PARAM s1 WHERE b.STCD=s.STCD AND s1.STCD= s.STCD AND s.MODITIME>DATEADD(HOUR, -1, GETDATE())")
//
    Set<ShuiWen> findShuiWen();
    //select s.id,s.Picture_message,s2.Photograph_message,s.DATAmessage,s4.RSINCD,s5.Longitude,s5.Latitude " +
    //            "from SYQ_picture_timing s,SYQ_picture_plus s2 ,SYQ_video s3,SYQ_RSV_BSIN s4,SYQ_starting s5 " +
    //            "where s.DATAmessage>DATEADD(HOUR, -1, GETDATE()) and s.TENstation =s2.TENstation and s.TENstation = s3.TENstation AND s.TENstation=s4.TENstation and s.TENstation=s5.TENstation
}
