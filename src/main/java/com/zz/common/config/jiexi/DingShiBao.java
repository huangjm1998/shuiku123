package com.zz.common.config.jiexi;

import com.zz.common.util.ResolvingUtils;
import com.zz.pojo.SYQ_timing;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DingShiBao {
    public static SYQ_timing method(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


        //帧头
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);

        //十位测站号
        String TENstation = str.substring(6, 16);

        //密码
        String PassWord = str.substring(16, 20);

        //报文特征
        String TZmessage = str.substring(20, 22);

        //上行报文标识
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
        String substring = str.substring(38, 50);
        System.out.println("时间=" + substring);
        String year11 = substring.substring(0, 2);
        String year = "20" + year11;
        String month = substring.substring(2, 4);
        String day = substring.substring(4, 6);
        String hours = substring.substring(6, 8);
        String mm = substring.substring(8, 10);
        String mills = substring.substring(10, 12);
        String DATAmessage = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;


        //测站地址标识符
        String TAGsation = str.substring(50, 54);

        //测站号
        String Nstation1 = str.substring(54, 64);
        long Nstation = ResolvingUtils.decodeHEX(Nstation1);
        // long Nstation = Long.parseLong(Nstation1);

        //测站类型码
        String Tstation = str.substring(64, 66);

        //观测时间标识符
        String TAGDATA = str.substring(66, 70);

        //观测时间
        String DATEobservation = str.substring(70, 80);
        System.out.println("时间=" + substring);
        String year1 = substring.substring(0, 2);
        String year2 = "20" + year11;
        String month1 = substring.substring(2, 4);
        String day1 = substring.substring(4, 6);
        String hours1 = substring.substring(6, 8);
        String mm1 = substring.substring(8, 10);

        String DATAmessage1 = year2 + "-" + month1 + "-" + day1 + " " + hours1 + ":" + mm1;

        //水位标识符
        String TAGwater = str.substring(80, 84);

        //水位值
        String substring1 = str.substring(84, 92);
        String s = substring1.substring(0, 5);
        String substring2 = substring1.substring(substring1.length() - 3);
        String shuiweizhi = s + "." + substring2;
        double Lwater = Double.parseDouble(shuiweizhi);

        //降水量累计值标识符
        String TAGrainfall = str.substring(92, 96);

        //累计雨量数据
        String s1 = str.substring(96, 102);
        String s2 = s1.substring(0, 5);
        String substring3 = s1.substring(s1.length() - 1);
        String yuliang = s2 + "." + substring3;
        double Cumulative_rainfal = Double.parseDouble(yuliang);

        //当前降水量标识符
        String Curve_precipitation = str.substring(102, 106);

        //指早8点到目前降水量
        String s3 = str.substring(106, 112);
        String substring4 = s3.substring(0, 5);
        String substring5 = s3.substring(s3.length() - 1);
        String jiangshuiliang = substring4 + "." + substring5;
        double Eight_Now_precipitation = Double.parseDouble(jiangshuiliang);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(112, 116);

        //太阳能电压数据
        String substring6 = str.substring(116, 120);
        String s4 = substring6.substring(0, 2);
        String substring7 = substring6.substring(substring6.length() - 2);
        String dianya = s4 + "." + substring7;
        double Voltage_data = Double.parseDouble(dianya);

        //太阳能电流版电流标识符
        String TAGelectricity = str.substring(120, 124);

        //太阳能电流数据
        String s5 = str.substring(124, 128);
        String substring8 = s5.substring(0, 2);
        String substring9 = s5.substring(s5.length() - 2);
        String dianliu = substring8 + "." + substring9;
        double Ectricity_data = Double.parseDouble(dianliu);

        //电池电压标识符
        String TAGVE = str.substring(128, 132);

        //电池电压数据
        String s6 = str.substring(132, 136);
        String substring10 = s6.substring(0, 2);
        String substring11 = s6.substring(s6.length() - 2);
        String dianya2 = substring10 + "." + substring11;
        double VE_data = Double.parseDouble(dianya2);

        //电池电流标识符
        String TAGE_battery = str.substring(136, 140);


        //电池电流数据
        String s9 = str.substring(140, 144);
        String s10 = s9.substring(0, 2);
        String s11 = s9.substring(s9.length() - 2);
        String iddd = s10 + "." + s11;
        double Battery_current_data = Double.parseDouble(iddd);

        //NB-IOT网罗信号强度标识符
        String TAG_IOT = str.substring(144, 148);

        //nb-iot网络信号强度
        String IOT_strength = str.substring(148, 150);

        //4g/5g网络信号强度标识符
        String TAG_signal = str.substring(150, 154);

        //4g5g信号强度
        String Signal_strength = str.substring(154, 156);


        //环境温度标识符
        String TAG_temperature = str.substring(156, 160);

        //环境温度数据
        String s7 = str.substring(160, 164);
        String substring12 = s7.substring(0, 2);
        String substring13 = s7.substring(s7.length() - 2);
        String wendu = substring12 + "." + substring13;
        double Temperature_data = Double.parseDouble(wendu);

        //环境湿度标识符
        String TAG_humidity = str.substring(164, 168);

        //环境湿度数据
        String s8 = str.substring(168, 172);
        String substring14 = s8.substring(0, 2);
        String substring15 = s8.substring(s8.length() - 2);
        String shidu = substring14 + "." + substring15;
        double Humidity_data = Double.parseDouble(shidu);

        //流控字符
        String fluid_character = str.substring(172, 174);

        //CRC检验
        String CRC_HEX = str.substring(174, 178);

        SYQ_timing t = new SYQ_timing();
        t.setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setTZmessage(TZmessage).setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater)
                .setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage).setTAGstation(TAGsation).setNstation(Nstation).setTstation(Tstation).setTAGDATE(TAGDATA).setDATEobservation(DATAmessage1).setTAGwater(TAGwater).setLwater(Lwater)
                .setTAGrainfall(TAGrainfall).setCumulative_rainfal(Cumulative_rainfal).setCurve_precipitation(Curve_precipitation).setEight_Now_precipitation(Eight_Now_precipitation).setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data)
                .setTAGVE(TAGVE).setVE_data(VE_data).setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal).setSignal_strength(Signal_strength).setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data)
                .setTAG_humidity(TAG_humidity).setHumidity_data(Humidity_data).setFluid_character(fluid_character).setCRC_HEX(CRC_HEX).setTAGE_battery(TAGE_battery).setBattery_current_data(Battery_current_data).setTAGelectricity(TAGelectricity)
                .setEctricity_data(Ectricity_data);

        return t;
    }
}
