package com.zz.dao;


import com.zz.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DataDao {

    //测试报
    @Insert("insert into SYQ_test(FH,Cstation,TENstation,PassWord,TZmessage,Lmessage,Smessage," +
            "            Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation,TAGDATE,DATEobservation,TAGwater,Lwater," +
            "TAGrainfall,Cumulative_rainfal,Curve_precipitation,Eight_Now_precipitation,TAGvoltage,Voltage_data,TAGelectricity,Ectricity_data," +
            "TAGVE,VE_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature,Temperature_data,TAG_humidity,Humidity_data,fluid_character,TAGE_battery,Battery_current_data,CRC_HEX) " +
            "values(#{FH},#{Cstation},#{TENstation},#{PassWord},#{TZmessage},#{Lmessage},#{Smessage}," +
            "            #{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation},#{TAGDATE},#{DATEobservation},#{TAGwater}," +
            "#{Lwater},#{TAGrainfall},#{Cumulative_rainfal},#{Curve_precipitation},#{Eight_Now_precipitation},#{TAGvoltage},#{Voltage_data},#{TAGelectricity}," +
            "#{Ectricity_data},#{TAGVE},#{VE_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{Temperature_data},#{Temperature_data},#{TAG_humidity}," +
            "#{Humidity_data},#{fluid_character},#{TAGE_battery},#{Battery_current_data},#{CRC_HEX} )")
    int ceShiBao(SYQ_test entity);


    //心跳报
//    @Insert(" insert into SYQ_heartbeat(FH,Cstation,TENstation,PassWord,TZmessage,Lmessage,Smessage\n" +
//            "            ,Nwater,TAG,IOT,DATEmessage,Fcharacter,CRC_HEX) values(#{FH},#{Cstation},#{TENstation},#{PassWord},#{TZmessage},#{Lmessage},#{Smessage}\n" +
//            "            ,#{Nwater},#{TAG},#{IOT},#{DATEmessage},#{Fcharacter},#{CRC_HEX})")
    int xinTiaoBao(SYQ_heartbeat entity);


    //加报
    @Insert("insert into SYQ_plus(FH,Cstation,TENstation,PassWord,TZmessage,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,TAGDATE," +
            "DATEobservation,TAGwater,Lwater,TAGrainfall,Cumulative_rainfal,Curve_precipitation,Eight_Now_precipitation,TAGvoltage,Voltage_data," +
            "TAGelectricity,Ectricity_data,TAGVE,VE_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature,Temperature_data,TAG_humidity," +
            "Humidity_data,TAG_incline,incline_message,TAG_crash,crash_message,fluid_character,CRC_HEX,TAGE_battery,Battery_current_data,Tstation)" +
            "values(#{FH},#{Cstation},#{TENstation},#{PassWord},#{TZmessage},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{TAGDATE}," +
            "#{DATEobservation},#{TAGwater},#{Lwater},#{TAGrainfall},#{Cumulative_rainfal},#{Curve_precipitation},#{Eight_Now_precipitation},#{TAGvoltage},#{Voltage_data}," +
            "#{TAGelectricity},#{Ectricity_data},#{TAGVE},#{VE_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{TAG_temperature},#{Temperature_data},#{TAG_humidity}," +
            "#{Humidity_data},#{TAG_incline},#{incline_message},#{TAG_crash},#{crash_message},#{fluid_character},#{CRC_HEX},#{TAGE_battery},#{Battery_current_data},#{Tstation})")
    int jiaBao(SYQ_plus entity);

    //定时报
    @Insert("insert into SYQ_timing(FH,Cstation,TENstation,PassWord,TZmessage,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation," +
            "Nstation,Tstation,TAGDATE,DATEobservation,TAGwater,Lwater,TAGrainfall,Cumulative_rainfal,Curve_precipitation,Eight_Now_precipitation,TAGvoltage," +
            "Voltage_data,TAGelectricity,Ectricity_data,TAGVE,VE_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature," +
            "Temperature_data,TAG_humidity,Humidity_data,fluid_character,CRC_HEX,TAGE_battery,Battery_current_data) values" +
            "(#{FH},#{Cstation},#{TENstation},#{PassWord},#{TZmessage},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation}," +
            "#{Nstation},#{Tstation},#{TAGDATE},#{DATEobservation},#{TAGwater},#{Lwater},#{TAGrainfall},#{Cumulative_rainfal},#{Curve_precipitation},#{Eight_Now_precipitation},#{TAGvoltage}," +
            "#{Voltage_data},#{TAGelectricity},#{Ectricity_data},#{TAGVE},#{VE_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{TAG_temperature}," +
            "#{Temperature_data},#{TAG_humidity},#{Humidity_data},#{fluid_character},#{CRC_HEX},#{TAGE_battery},#{Battery_current_data})")
    int dingShiBao(SYQ_timing entity);


    //小时报
    @Insert("insert into SYQ_hour(FH,Cstation,TENstation,PassWord,TZmessage,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation," +
            "TAGDATE,DATEobservation,TAG_twelve_rainfall,Twelve_message_rainfall,TAG_twelve_water,Twelve_message_water,TAGrainfall," +
            "Cumulative_rainfal,Curve_precipitation,Eight_Now_precipitation,TAGvoltage,Voltage_data,TAGelectricity,Ectricity_data,TAGVE," +
            "VE_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature,Temperature_data,TAG_humidity,Humidity_data,fluid_character,CRC_HEX,TAGE_battery,Battery_current_data) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{TZmessage},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation}," +
            "#{TAGDATE},#{DATEobservation},#{TAG_twelve_rainfall},#{Twelve_message_rainfall},#{TAG_twelve_water},#{Twelve_message_water},#{TAGrainfall}," +
            "#{Cumulative_rainfal},#{Curve_precipitation},#{Eight_Now_precipitation},#{TAGvoltage},#{Voltage_data},#{TAGelectricity},#{Ectricity_data},#{TAGVE}," +
            "#{VE_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{TAG_temperature},#{Temperature_data},#{TAG_humidity},#{Humidity_data},#{fluid_character},#{CRC_HEX},#{TAGE_battery},#{Battery_current_data})")
    int xiaoShiBao(SYQ_hour entity);


    //远程状态报
    @Insert("insert into SYQ_video(FH,Cstation,TENstation,PassWord,Function_Code,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAG_video," +
            "Video_message,TAGstation,Address_station,Fluid_character,CRC_HEX) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{Function_Code},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAG_video},#{Video_message},#{TAGstation},#{Address_station},#{Fluid_character},#{CRC_HEX})")
    int yuanChengZhuangTaiBao(SYQ_video entity);


    //图像定时报
    @Insert("insert into SYQ_picture_timing(FH,Cstation,TENstation,PassWord,Function_Code,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation,TAG_picture,Picture_message,Fluid_character,CRC_HEX) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{Function_Code},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation},#{TAG_picture},#{Picture_message},#{Fluid_character},#{CRC_HEX})")
    int tuXiangDingShiBao(SYQ_picture_timing entity);


    //图像加报
    @Insert("insert into SYQ_picture_plus(FH,Cstation,TENstation,PassWord,Function_Code,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation,TAG_picture," +
            "Photograph_message,Fluid_character,CRC_HEX) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{Function_Code},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation},#{TAG_picture}," +
            "#{Photograph_message},#{Fluid_character},#{CRC_HEX})")
    int tuXiangJiaBao(SYQ_picture_plus entity);


    //开机报
    @Insert("insert into SYQ_starting(FH,Cstation,TENstation,PassWord,Function_Code,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation,TAG_one,Identification_one,TAG_Card_one,Card_one,TAG_two,Identification_two,TAG_Card_two,Card_two,TAG_hardware,Hardware_message," +
            "TAGvoltage,Voltage_data,TAGelectricity,Ectricity_data,TAGVE,VE_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature,Temperature_data,TAG_humidity,Humidity_data,TAG_video,Video_message,Crash_status,Crash_status_message,TAG_diagnose,Diagnose_message,TAG_longitude," +
            "Longitude,TAG_latitude,Latitude,Fluid_character,CRC_HEX,TAGE_battery,Battery_current_data) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{Function_Code},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation},#{TAG_one},#{Identification_one},#{TAG_Card_one},#{Card_one},#{TAG_two},#{Identification_two},#{TAG_Card_two},#{Card_two},#{TAG_hardware},#{Hardware_message}," +
            "#{TAGvoltage},#{Voltage_data},#{TAGelectricity},#{Ectricity_data},#{TAGVE},#{VE_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{TAG_temperature},#{Temperature_data},#{TAG_humidity},#{Humidity_data},#{TAG_video},#{Video_message},#{Crash_status},#{Crash_status_message},#{TAG_diagnose},#{Diagnose_message},#{TAG_longitude}," +
            "#{Longitude},#{TAG_latitude},#{Latitude},#{Fluid_character},#{CRC_HEX},#{TAGE_battery},#{Battery_current_data})")
    int kaiJiBao(SYQ_starting entity);


    //自检每日报
    @Insert("insert into SYQ_self_inspection(FH,Cstation,TENstation,PassWord,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Nstation,Tstation,TAGvoltage,Voltage_data,TAGelectricity,Ectricity_data,TAGVE,VE_data,TAGE_battery,Battery_current_data,TAG_IOT,IOT_strength,TAG_signal,Signal_strength,TAG_temperature,Temperature_data," +
            "TAG_humidity,Humidity_data,TAG_video,Video_message,TAG_incline,incline_message,TAG_crash,crash_message,TAG_diagnose,Diagnose_message,TAG_self_inspection,Self_inspection_message,Fluid_character,CRC_HEX,Function_Code) values(" +
            "#{FH},#{Cstation},#{TENstation},#{PassWord},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Nstation},#{Tstation},#{TAGvoltage},#{Voltage_data},#{TAGelectricity},#{Ectricity_data},#{TAGVE},#{VE_data},#{TAGE_battery},#{Battery_current_data},#{TAG_IOT},#{IOT_strength},#{TAG_signal},#{Signal_strength},#{TAG_temperature},#{Temperature_data}," +
            "#{TAG_humidity},#{Humidity_data},#{TAG_video},#{Video_message},#{TAG_incline},#{incline_message},#{TAG_crash},#{crash_message},#{TAG_diagnose},#{Diagnose_message},#{TAG_self_inspection},#{Self_inspection_message},#{Fluid_character},#{CRC_HEX},#{Function_Code})")
    int ziJianBao(SYQ_self_inspection entity);


    //中心站查询遥测站实时数据
    @Insert("insert into SYQ_select_hour(FH,TENstation,Caddress,PassWord,Lmessage,Smessage,Nwater,TAG,IOT,DATAmessage,TAGstation,Address_station,TAGDATE,DATEobservation,TAGwater,Lwater,TAGrainfall,Cumulative_rainfal,TAGvoltage,Voltage_data,TAGelectricity,Ectricity_data,TAGVE,VE_data,TAGE_battery,Battery_current_data,TAG_IOT,IOT_strength," +
            "TAG_signal,Signal_strength,TAG_temperature,Temperature_data,TAG_humidity,Humidity_data,TAG_video,Video_message,TAG_incline,incline_message,TAG_crash,crash_message,TAG_diagnose,Diagnose_message,Fluid_character,CRC_HEX,Function_Code,Station_type) values(" +
            "#{FH},#{TENstation},#{Caddress},#{PassWord},#{Lmessage},#{Smessage},#{Nwater},#{TAG},#{IOT},#{DATAmessage},#{TAGstation},#{Address_station},#{TAGDATE},#{DATEobservation},#{TAGwater},#{Lwater},#{TAGrainfall},#{Cumulative_rainfal},#{TAGvoltage},#{Voltage_data},#{TAGelectricity},#{Ectricity_data},#{TAGVE},#{VE_data},#{TAGE_battery},#{Battery_current_data},#{TAG_IOT},#{IOT_strength}," +
            "#{TAG_signal},#{Signal_strength},#{TAG_temperature},#{Temperature_data},#{TAG_humidity},#{Humidity_data},#{TAG_video},#{Video_message},#{TAG_incline},#{incline_message},#{TAG_crash},#{crash_message},#{TAG_diagnose},#{Diagnose_message},#{Fluid_character},#{CRC_HEX},#{Function_Code},#{Station_type})")
    int yaoCeZhanShiShiShuJu(SYQ_select_hour entity);
}
