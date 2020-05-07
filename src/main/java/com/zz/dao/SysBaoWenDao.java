package com.zz.dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zz.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SysBaoWenDao {

    //    //查询心跳报
////    @Select("select * from SYQ_heartbeat where if")
//    List<SYQ_heartbeat> sysXinTiaoBao(@Param("pageCurrent") Integer pageCurrent,@Param("srincd") String srincd);
//
//    //查询心跳总条数
//    @Select("select count(*) from SYQ_heartbeat ")
//    int getRouCount(String RSNM);
//
//    //查询测试报总条数
//    @Select("select count(*) from SYQ_test")
//    int getRouCountceshi();
//
//    //查询测试报
    //------------------------------------------------------------------------------------------
    //查询心跳报总条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_heartbeat A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcount(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                    @Param("RSNM") String RSNM);

    //心跳报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_heartbeat A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_heartbeat> selectHeartbeat(@Param("begin") Integer begin, @Param("row") Integer row,
                                        @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                        @Param("RSNM") String RSNM);

    //查询测试总条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_test A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountceshi(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                         @Param("RSNM") String RSNM);


    //测试报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_test A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = #{CNTY}" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = #{TENstation}" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_test> selectTest(@Param("begin") Integer begin, @Param("row") Integer row,
                              @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                              @Param("RSNM") String RSNM);


    //查询定时报总条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_timing A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountdingshi(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                           @Param("RSNM") String RSNM);

    //定时报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_timing A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_timing> selectTiming(@Param("begin") Integer begin, @Param("row") Integer row,
                                  @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                  @Param("RSNM") String RSNM);

    //查询小时报总条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_hour A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountxiaoshi(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                           @Param("RSNM") String RSNM);

    //小时报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_hour A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_hour> selectHour(@Param("begin") Integer begin, @Param("row") Integer row,
                              @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                              @Param("RSNM") String RSNM);

    //查询加报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_plus A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountjiabao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                          @Param("RSNM") String RSNM);

    //加报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_plus A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_plus> selectPlus(@Param("begin") Integer begin, @Param("row") Integer row,
                              @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                              @Param("RSNM") String RSNM);

    //远程视频状态报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_video A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountshipingzhuangtai(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                    @Param("RSNM") String RSNM);

    //远程视频状态报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_video A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_video> selectvideo(@Param("begin") Integer begin, @Param("row") Integer row,
                                @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                @Param("RSNM") String RSNM);

    //图像定时报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_picture_timing A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcounttuxiangdingshi(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                  @Param("RSNM") String RSNM);

    //图像定时报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_picture_timing A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_picture_timing> selectPictureTiming(@Param("begin") Integer begin, @Param("row") Integer row,
                                                 @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                 @Param("RSNM") String RSNM);

    //图像加报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_picture_plus A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcounttuxiangjiabao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                 @Param("RSNM") String RSNM);

    //图像加报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_picture_plus A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_picture_plus> selectPicturePlus(@Param("begin") Integer begin, @Param("row") Integer row,
                                             @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                             @Param("RSNM") String RSNM);

    //开机报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_starting A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountkaijibao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                            @Param("RSNM") String RSNM);

    //开机报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_starting A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_starting> selectStarting(@Param("begin") Integer begin, @Param("row") Integer row,
                                      @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                      @Param("RSNM") String RSNM);


    //自检每日报条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_self_inspection A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountzijianbao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                             @Param("RSNM") String RSNM);

    //自检每日报
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_self_inspection A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_self_inspection> selectSelfInspection(@Param("begin") Integer begin, @Param("row") Integer row,
                                                   @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                   @Param("RSNM") String RSNM);

    //初始化固态存储数据条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_initialize A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountgutaicunchu(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                               @Param("RSNM") String RSNM);

    //初始化固态存储数据
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_initialize A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_initialize> selectInitialize(@Param("begin") Integer begin, @Param("row") Integer row,
                                          @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                          @Param("RSNM") String RSNM);

    //恢复遥测站出厂设置条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_recover A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountchuchangshezhi(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                  @Param("RSNM") String RSNM);

    //恢复遥测站出厂设置
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_recover A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_recover> selectRecover(@Param("begin") Integer begin, @Param("row") Integer row,
                                    @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                    @Param("RSNM") String RSNM);


    //设置遥测站时钟条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_clock A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountyaoceshizhong(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                 @Param("RSNM") String RSNM);

    //设置遥测站时钟
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_clock A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_clock> selectClock(@Param("begin") Integer begin, @Param("row") Integer row,
                                @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                @Param("RSNM") String RSNM);

    //修改密码条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_password A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountxiugaimima(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                              @Param("RSNM") String RSNM);

    //修改密码
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_password A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_update_password> selectUpdatePassword(@Param("begin") Integer begin, @Param("row") Integer row,
                                                   @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                   @Param("RSNM") String RSNM);

    //启动遥测站摄像头条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_camera A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountshexiangtou(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                               @Param("RSNM") String RSNM);

    //启动遥测站摄像头
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_camera A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_camera> selectCamera(@Param("begin") Integer begin, @Param("row") Integer row,
                                  @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                  @Param("RSNM") String RSNM);

    //中心站查询遥测站状态和报警信息条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_warning A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountzhuangtaibaojing(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                    @Param("RSNM") String RSNM);

    //中心站查询遥测站状态和报警信息
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_warning A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_warning> selectWarning(@Param("begin") Integer begin, @Param("row") Integer row,
                                    @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                    @Param("RSNM") String RSNM);

    //中心站查询遥测站实时数据条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_select_hour A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountshishishuju(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                               @Param("RSNM") String RSNM);

    //中心站查询遥测站实时数据
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_select_hour A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_select_hour> selectSelectHour(@Param("begin") Integer begin, @Param("row") Integer row,
                                           @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                           @Param("RSNM") String RSNM);

    ////中心站查询遥测站时段数据条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_time_frame A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountshiduanshuju(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                @Param("RSNM") String RSNM);

    ////中心站查询遥测站时段数据
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_time_frame A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_time_frame> selectTimeFrame(@Param("begin") Integer begin, @Param("row") Integer row,
                                         @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                         @Param("RSNM") String RSNM);


    ////中心站修改遥测站基本配置表条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_allocation A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountpeizhibiao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                              @Param("RSNM") String RSNM);

    ////中心站修改遥测站基本配置表
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_allocation A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_update_allocation> selectUpdateAllocation(@Param("begin") Integer begin, @Param("row") Integer row,
                                                       @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                       @Param("RSNM") String RSNM);

    //中心站读取遥测站基本配置表条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_Read_basic_configuration A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountyaochepeizhibiao(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                    @Param("RSNM") String RSNM);

    //中心站读取遥测站基本配置表
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_Read_basic_configuration A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_Read_basic_configuration> selectReadBasicConfiguration(@Param("begin") Integer begin, @Param("row") Integer row,
                                                                    @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                                    @Param("RSNM") String RSNM);


    //中心站读取遥测站运行参数配置表条数
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_read_parameter A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountyunxingcanshu(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                 @Param("RSNM") String RSNM);

    //中心站读取遥测站运行参数配置表
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_read_parameter A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_read_parameter> selectReadParameter(@Param("begin") Integer begin, @Param("row") Integer row,
                                                 @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                 @Param("RSNM") String RSNM);

    // 中心站修改遥测站运行参数配置表tiaosu
    @Select("<script>" +
            "select count(*) from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_parameter A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b " +
            "</script>")
    int selectcountxiugaiyunxingcanshu(@Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                       @Param("RSNM") String RSNM);

    // 中心站修改遥测站运行参数配置表
    @Select("<script>" +
            "select * from (select ROW_NUMBER() OVER(Order by id) as RowId,* from " +
            "(select B.RSNM,B.CITY,B.CNTY,A.* from SYQ_update_parameter A LEFT JOIN SYQ_RSV_BSIN B on A.TENstation=B.TENstation) M" +
            " <where> " +
            "<if test='CNTY !=null'>" +
            "M.CNTY = '${CNTY}'" +
            "</if>" +
            "<if test='TENstation !=null'>" +
            "M.TENstation = '${TENstation}'" +
            "</if>" +
            "<if test='RSNM !=null'>" +
            "M.RSNM like '%' + #{RSNM}+ '%'" +
            "</if>" +
            "</where>" +
            ") as b where b.RowId BETWEEN (${begin}-1)* ${row}+1 and  ${begin} * ${row}" +
            "</script>")
    List<SYQ_update_parameter> selsectUpdateParamete(@Param("begin") Integer begin, @Param("row") Integer row,
                                                     @Param("CNTY") String CNTY, @Param("TENstation") String TENstation,
                                                     @Param("RSNM") String RSNM);
}
