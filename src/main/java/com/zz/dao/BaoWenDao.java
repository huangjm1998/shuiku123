package com.zz.dao;

import com.zz.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface BaoWenDao {
    //根据十位测站号查出8位测站号
    @Select("select STCD from ST_RSVRFCCH_B where TENstation=#{TENstation}")
    String select(@Param("TENstation") String TENstation);


    //视频状态信息入库
    @Insert("insert into ST_NVR_LOG(STCD,NVRID,BTIME,RUNTP,VSTAT,VDSS,UTIME,ETIME) " +
            "values(#{TENstation},null,#{DATAmessage},NULL,#{Video_message},NULL,NULL,NULL)")
    int video(SYQ_video entity);

    //存储站点图片信息
    @Insert("insert into ST_PICTURE_R(STCD,MODITIME,IMGNM,IMGTP,IMGSZ,IMGPH,IMGURL)" +
            "values(#{TENstation},#{DATAmessage},#{IMGNM},#{IMGTP},#{IMGSZ},#{IMGPH},#{Photograph_message})")
    int poto(SYQ_picture_plus entity);

    //存储站点图片信息
    @Insert("insert into ST_PICTURE_R(STCD,MODITIME,IMGNM,IMGTP,IMGSZ,IMGPH,IMGURL)" +
            "values(#{TENstation},#{DATAmessage},#{IMGNM},#{IMGTP},#{IMGSZ},#{IMGPH},#{Picture_message})")
    int poto1(SYQ_picture_timing entity);

    //存储水库站测报的水库水情信息
    @Insert("insert into ST_RSVR_R(STCD,MODITIME,RZ,INQ,W,BLRZ,OTQ,RWCHRCD,RWPTN)" +
            "values(#{TENstation},#{DATAmessage},#{Lwater},NULL,NULL,NULL,NULL,NULL,NULL)")
    int shuiQing(SYQ_timing entity);

    //3.6降水量实时表
    @Insert("insert into ST_PPTN_R(STCD,DRP,INTV,PDR,DYP,MODITIME)" +
            "values(#{TENstation},#{DRP},#{INTV},#{PDR},#{DYP},#{MODITIME})")
    int PPTN(SYQ_hour entity);
}
