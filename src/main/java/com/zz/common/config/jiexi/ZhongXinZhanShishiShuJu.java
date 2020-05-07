package com.zz.common.config.jiexi;

import com.zz.pojo.SYQ_select_hour;

public class ZhongXinZhanShishiShuJu {
    public static SYQ_select_hour method(String str) {

        //帧头
        String FH = str.substring(0, 4);

        //十位测站号
        String TENstation = str.substring(4, 14);

        //中心地址
        String Caddress = str.substring(14, 16);

        //密码
        String PassWord = str.substring(16, 20);

        //功能吗
        String Function_Code = str.substring(20, 22);

        //下行标识及正文长度
        String Lmessage = str.substring(22, 26);

        //正文起始符
        String Smessage = str.substring(26, 28);

        //流水号
        String Nwater = str.substring(28, 32);

        //上报通道标识符
        String TAG = str.substring(32, 36);

        //NB-IOT
        String IOT = str.substring(36, 38);

        //发报时间
        String s = str.substring(38, 50);
        String year = "20" + s.substring(0, 2);
        String month = s.substring(2, 4);
        String day = s.substring(4, 6);
        String hours = s.substring(6, 8);
        String mm = s.substring(8, 10);
        String mills = s.substring(10, 12);
        String DATAmessage = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;

        //测站地址标识符
        String TAGstation = str.substring(50, 54);

        //测站地址
        String Address_station = str.substring(54, 64);
        // long Address_station = Long.parseLong(Address_station1);

        //测站类型
        String Station_type = str.substring(64, 66);

        //观测时间标识符
        String TAGDATE = str.substring(66, 70);

        //观测时间
        String s1 = str.substring(70, 80);
        String year1 = "20" + s1.substring(0, 2);
        String month1 = s1.substring(2, 4);
        String day1 = s1.substring(4, 6);
        String hours1 = s1.substring(6, 8);
        String mm1 = s1.substring(8, 10);
        String DATEobservation = year1 + "-" + month1 + "-" + day1 + " " + hours1 + ":" + mm1;
        //long ll = Long.parseLong(DATEobservation);

        //累计雨量标识符
        String TAGrainfall = str.substring(80, 84);

        //累计雨量数据
        String s2 = str.substring(84, 90);
        String substring = s2.substring(0, 5);
        String substring1 = s2.substring(s2.length() - 1);
        String yuliang = substring + "." + substring1;
        double Cumulative_rainfal = Double.parseDouble(yuliang);

        //水位标识符
        String TAGwater = str.substring(90, 94);

        //水位值
        String s3 = str.substring(94, 102);
        String substring2 = s3.substring(0, 5);
        String substring3 = s3.substring(s3.length() - 3);
        String shuiweizhi = substring2 + "." + substring3;
        double Lwater = Double.parseDouble(shuiweizhi);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(102, 106);

        //太阳能板电压数据
        String substring4 = str.substring(106, 110);
        String substring5 = substring4.substring(0, 2);
        String substring6 = substring4.substring(substring4.length() - 2);
        String dianya = substring5 + "." + substring6;
        double Voltage_data = Double.parseDouble(dianya);

        //太阳能板电流税局标识符
        String TAGelectricity = str.substring(110, 114);

        //太阳能板电流数据
        String s4 = str.substring(114, 118);
        String substring7 = s4.substring(0, 2);
        String substring8 = s4.substring(s4.length() - 2);
        String dianliu = substring7 + "." + substring8;
        double Ectricity_data = Double.parseDouble(dianliu);

        //电池电压标识符
        String TAGVE = str.substring(118, 122);

        //电池电压数据
        String s5 = str.substring(122, 126);
        String substring9 = s5.substring(0, 2);
        String substring10 = s5.substring(s5.length() - 2);
        String dianya2 = substring9 + "." + substring10;
        double VE_data = Double.parseDouble(dianya2);

        //电池电流标识符
        String TAGE_battery = str.substring(126, 130);

        //电池电流数据
        String s6 = str.substring(130, 134);
        String substring11 = s6.substring(0, 2);
        String substring12 = s6.substring(s6.length() - 2);
        String dianliu2 = substring11 + "." + substring12;
        double Battery_current_data = Double.parseDouble(dianliu2);

        //nb-iot网络信号强度标识符
        String TAG_IOT = str.substring(134, 138);

        //NB-IOT网络信号强度
        String IOT_strength = str.substring(138, 140);

        //环境温度标识符
        String TAG_temperature = str.substring(140, 144);

        //4g5g网络信号强度标识符
        String TAG_signal = str.substring(144, 148);

        //4g5g网络信号想读
        String Signal_strength = str.substring(148, 150);


        //环境温度数据
        String s7 = str.substring(150, 154);
        String substring13 = s7.substring(0, 2);
        String substring14 = s7.substring(s7.length() - 2);
        String wendu = substring13 + "." + substring14;
        double Temperature_data = Double.parseDouble(wendu);


        //环境湿度标识符
        String TAG_humidity = str.substring(154, 158);


        //环境湿度数据
        String substring15 = str.substring(158, 162);
        String substring16 = substring15.substring(0, 2);
        String substring17 = substring15.substring(substring15.length() - 2);
        String shidu = substring16 + "." + substring17;
        double Humidity_data = Double.parseDouble(shidu);

        //视频运行状态标识符
        String TAG_video = str.substring(162, 166);

        //视频运行状态信息
        String Video_message = str.substring(166, 168);

        //倾斜状态标识符
        String TAG_incline = str.substring(168, 172);

        //倾斜状态信息
        String incline_message = str.substring(172, 174);

        //设备碰撞状态信息标识符
        String TAG_crash = str.substring(174, 178);

        //设备碰撞撞状态信息
        String crash_message = str.substring(178, 182);

        //设备诊断标识符
        String TAG_diagnose = str.substring(182, 186);

        //设备诊断数据
        String Diagnose_message = str.substring(186, 188);

        //流控字符
        String Fluid_character = str.substring(188, 190);

        //crc校验hex
        String CRC_HEX = str.substring(190, 190);

        //封装数据
        SYQ_select_hour t = new SYQ_select_hour();
        t.setFH(FH).setTENstation(TENstation).setCaddress(Caddress).setPassWord(PassWord)
                .setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage).setTAGstation(TAGstation)
                .setAddress_station(Address_station).setTAGDATE(TAGDATE).setDATEobservation(DATEobservation).setTAGwater(TAGwater).setLwater(Lwater)
                .setTAGrainfall(TAGrainfall).setCumulative_rainfal(Cumulative_rainfal).setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data)
                .setTAGelectricity(TAGelectricity).setEctricity_data(Ectricity_data).setTAGVE(TAGVE).setVE_data(VE_data).setTAGE_battery(TAGE_battery)
                .setBattery_current_data(Battery_current_data).setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal)
                .setSignal_strength(Signal_strength).setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data).setTAG_humidity(TAG_humidity)
                .setHumidity_data(Humidity_data).setTAG_video(TAG_video).setVideo_message(Video_message).setTAG_incline(TAG_incline).setIncline_message(incline_message)
                .setTAG_crash(TAG_crash).setCrash_message(crash_message).setTAG_diagnose(TAG_diagnose).setDiagnose_message(Diagnose_message)
                .setFluid_character(Fluid_character).setCRC_HEX(CRC_HEX).setFunction_Code(Function_Code).setStation_type(Station_type);
        return t;
    }


}
