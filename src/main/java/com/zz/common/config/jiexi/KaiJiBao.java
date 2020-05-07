package com.zz.common.config.jiexi;

import com.zz.pojo.SYQ_starting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KaiJiBao {

    public static SYQ_starting methods(String str) throws ParseException {

        //帧头
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);

        //十位测站号
        String TENstation = str.substring(6, 16);

        //密码
        String PassWord = str.substring(16, 20);

        //功能码
        String Function_Coede = str.substring(20, 22);

        //上行报文标识
        String Lmessage = str.substring(22, 26);

        //正文起始符
        String Smessage = str.substring(26, 28);

        //流水号
        String Nwater = str.substring(28, 32);

        //上报通道标识符
        String TAG = str.substring(32, 36);

        //nb-iot
        String IOT = str.substring(36, 38);

        //发报时间
        String s = str.substring(38, 50);
        String year = "20" + s.substring(0, 2);
        String month = s.substring(2, 4);
        String day = s.substring(4, 6);
        String hours = s.substring(6, 8);
        String mm = s.substring(8, 10);
        String mills = s.substring(10, 12);
        String DATAmessage1 = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;
        SimpleDateFormat mat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date DATAmessage = mat.parse(DATAmessage1);

        //测站地址标识符
        String TAGstation = str.substring(50, 54);

        //测站号
        String Nstation = str.substring(54, 64);
        //Long Nstation = Long.parseLong(s1);

        //测站类型码
        String Tstation = str.substring(64, 66);

        //通道1标识符
        String TAG_one = str.substring(66, 70);

        //通道1标识
        String Identification_one = str.substring(70, 102);

        //通道1卡号标识符
        String TAG_Card_one = str.substring(102, 106);

        //通道1卡号
        String Card_one = str.substring(106, 146);

        //通道2标识符
        String TAG_two = str.substring(146, 150);

        //通道2标识
        String Identification_two = str.substring(150, 182);

        //通道2卡号标识符
        String TAG_Card_two = str.substring(182, 186);

        //通道2卡号
        String Card_two = str.substring(186, 226);

        //遥测终端硬件信息标识符
        String TAG_hardware = str.substring(226, 230);

        //遥测终端硬件信息
        String Hardware_message = str.substring(230, 290);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(290, 294);

        //太阳能电压板数据
        String substring = str.substring(294, 298);
        String substring1 = substring.substring(0, 2);
        String substring2 = substring.substring(substring.length() - 2);
        String dianyashuju = substring1 + "." + substring2;
        double Voltage_data = Double.parseDouble(dianyashuju);

        //太阳能电池板电流标识符
        String TAGelectricity = str.substring(298, 302);

        //太阳能板电流数据
        String s2 = str.substring(302, 306);
        String substring3 = s2.substring(0, 2);
        String s3 = s2.substring(s2.length() - 2);
        String dianliu = substring3 + "." + s3;
        double Ectricity_data = Double.parseDouble(dianliu);

        //电池电压标识符
        String TAGVE = str.substring(306, 310);

        //电池电压数据
        String s4 = str.substring(310, 314);
        String substring4 = s4.substring(0, 2);
        String s5 = s4.substring(s4.length() - 2);
        String dianya = substring4 + "." + s5;
        double VE_data = Double.parseDouble(dianya);

        //电池电流标识符
        String TAGE_battery = str.substring(314, 318);

        //电池电流数据
        String s6 = str.substring(318, 322);
        String substring5 = s6.substring(0, 2);
        String substring6 = s6.substring(s6.length() - 2);
        String dianchidianliu = substring5 + "." + substring6;
        double Battery_current_data = Double.parseDouble(dianchidianliu);

        //NB-IOT网咯信号强度标识符
        String TAG_IOT = str.substring(322, 326);

        //NB-IOT网咯信号强度
        String IOT_strength = str.substring(326, 328);

        //4g5g//网络信号强度
        String TAG_signal = str.substring(328, 332);

        //4g5g网络信号强度数据
        String Signal_strength = str.substring(332, 334);

        //环境温度标识符
        String TAG_temperature = str.substring(334, 338);

        //环境温度数据
        String s7 = str.substring(338, 342);
        String substring7 = s7.substring(0, 2);
        String substring8 = s7.substring(s7.length() - 2);
        String wendu = substring7 + "." + substring8;
        double Temperature_data = Double.parseDouble(wendu);

        //环境湿度标识符
        String TAG_humidity = str.substring(342, 346);

        //环境湿度数据
        String s8 = str.substring(346, 350);
        String substring9 = s8.substring(0, 2);
        String substring10 = s8.substring(s8.length() - 2);
        String shidu = substring9 + "." + substring10;
        double Humidity_data = Double.parseDouble(shidu);


        //视频运行状态标识符
        String TAG_video = str.substring(350, 354);

        //视频状态信息
        String Video_message = str.substring(354, 356);

        //设备碰撞状态
        String Crash_status = str.substring(356, 360);

        //设备碰撞状态数据
        String Crash_status_message = str.substring(360, 362);

        //设备诊断标识符
        String TAG_diagnose = str.substring(362, 366);

        //设备诊断状态数据
        String Diagnose_message = str.substring(366, 368);

        //设备经度标识符
        String TAG_longitude = str.substring(368, 372);

        //设备经度
        String s9 = str.substring(372, 382);
        String substring11 = s9.substring(0, 8);
        String substring12 = s9.substring(s9.length() - 2);
        String jingdu = substring11 + "." + substring12;
        double Longitude = Double.parseDouble(jingdu);

        //设备纬度标识符
        String TAG_latitude = str.substring(382, 386);

        //设备纬度数据
        String s12 = str.substring(386, 396);
        String substring13 = s12.substring(0, 8);
        String substring14 = s12.substring(s12.length() - 2);
        String weidu = substring13 + "." + substring14;
        double Latitude = Double.parseDouble(weidu);

        //流控字符
        String Fluid_character = str.substring(396, 398);

        //CRC校验
        String CRC_HEX = str.substring(str.length() - 4);


        //封装数据
        SYQ_starting t = new SYQ_starting();
        t.setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setFunction_Code(Function_Coede)
                .setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage).setTAGstation(TAGstation)
                .setNstation(Nstation).setTstation(Tstation).setTAG_one(TAG_one).setIdentification_one(Identification_one).setTAG_Card_one(TAG_Card_one)
                .setCard_one(Card_one).setTAG_two(TAG_two).setIdentification_two(Identification_two).setTAG_Card_two(TAG_Card_two).setCard_two(Card_two)
                .setTAG_hardware(TAG_hardware).setHardware_message(Hardware_message).setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data).setTAGelectricity(TAGelectricity)
                .setEctricity_data(Ectricity_data).setTAGVE(TAGVE).setVE_data(VE_data).setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength)
                .setTAG_signal(TAG_signal).setSignal_strength(Signal_strength).setTAG_temperature(TAG_temperature)
                .setTemperature_data(Temperature_data).setTAG_humidity(TAG_humidity).setHumidity_data(Humidity_data)
                .setTAG_video(TAG_video).setVideo_message(Video_message).setCrash_status(Crash_status).setCrash_status_message(Crash_status_message)
                .setTAG_diagnose(TAG_diagnose).setDiagnose_message(Diagnose_message).setTAG_longitude(TAG_longitude)
                .setLatitude(Latitude).setFluid_character(Fluid_character).setCRC_HEX(CRC_HEX).setTAGE_battery(TAGE_battery)
                .setBattery_current_data(Battery_current_data).setTAG_latitude(TAG_latitude);

        return t;
    }
}
