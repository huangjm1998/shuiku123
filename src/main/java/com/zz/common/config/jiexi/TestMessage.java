package com.zz.common.config.jiexi;


import com.zz.common.util.ResolvingUtils;
import com.zz.pojo.SYQ_test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//测试报文
public class TestMessage {


    public static SYQ_test method(String str) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //帧头
        String FH = str.substring(0, 4);
        System.out.println("帧头：" + FH);

        //中心站号
        String Cstation = str.substring(4, 6);
        int Cstation1
                = ResolvingUtils.decodeHEX(Cstation);
        System.out.println("中心站号 s1=" + Cstation);
        System.out.println("中心站号： " + Cstation1);

        //测站号
        String TENstation = str.substring(6, 16);
        System.out.println("测站报：=" + TENstation);
        int i1 = ResolvingUtils.twoToTen(TENstation);
        System.out.println("测站编号：" + i1);

        //密码
        String PassWord = str.substring(16, 20);
        System.out.println("密码：=" + PassWord);
        int i2 = ResolvingUtils.decodeHEX(PassWord);
        System.out.println("密码：" + i2);

        //报文特征
        String TZmessage = str.substring(20, 22);
        System.out.println("报文特征：=" + TZmessage);
        int i3 = ResolvingUtils.decodeHEX(TZmessage);
        System.out.println("密码：" + i3);

        //上行报文标识及正文长度
        String Lmessage = str.substring(22, 26);
        System.out.println("上行报文标识：=" + Lmessage);
        int i4 = ResolvingUtils.decodeHEX(Lmessage);
        System.out.println("上行报文标识：" + i4);

        //正文起始符
        String Smessage = str.substring(26, 28);
        System.out.println("正文起始符：=" + Smessage);
        int i5 = ResolvingUtils.decodeHEX(Smessage);
        System.out.println("正文起始符：" + i5);

        //流水号
        String Nwater = str.substring(28, 32);
        System.out.println("流水号：=" + Nwater);
        int i6 = ResolvingUtils.decodeHEX(Nwater);
        System.out.println("-----");
        System.out.println("流水号：" + i6);

        //上报通道标识符
        String TAG = str.substring(32, 36);
        System.out.println("上报通道标识符：" + TAG);

        //NB-IOT
        String IOT = str.substring(36, 38);
        System.out.println("NB-IOT:=" + IOT);
        int i7 = ResolvingUtils.twoToTen(IOT);
        System.out.println("NB-IOT:" + i7);

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
        String DATAmessage1 = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;
        Date DATAmessage2 = sdf.parse(DATAmessage1);

        System.out.println(DATAmessage2 + "发报时间：" + "20" + year + "年" + month + "月" + day + "日" + hours + "点" + mm + "分" + mills + "秒");

        //测站地址标识符
        String TAGstation = str.substring(50, 54);
        System.out.println("测站地址标识符：" + TAGstation);

        //测站号
        String Nstation1 = str.substring(54, 64);
        Long Nstation = Long.parseLong(Nstation1);
        System.out.println("测站号:=" + Nstation);
        int i8 = ResolvingUtils.twoToTen(Nstation1);
        System.out.println("测站编号：" + i8);

        //测站类型码
        String Tstation = str.substring(64, 66);
        System.out.println("测站类型码：" + Tstation);

        //观测时间标识符
        String TAGDATE = str.substring(66, 70);
        System.out.println("观测时间标识符：" + TAGDATE);

        //观测时间
        String s14 = str.substring(70, 82);
        System.out.println("观测时间：=" + s14);
        String year1 = s14.substring(0, 2);
        String year2 = "20" + year1;
        String month1 = s14.substring(2, 4);
        String day1 = s14.substring(4, 6);
        String hours1 = s14.substring(6, 8);
        String mm1 = s14.substring(8, 10);
        String mills1 = s14.substring(10, 12);
        String DATEobservation1 = year2 + "-" + month1 + "-" + day1 + " " + hours1 + ":" + mm1 + ":" + mills1;
        Date DATEobservation = sdf.parse(DATEobservation1);
        System.out.println("观测时间：" + "20" + year2 + "年" + month1 + "月" + day1 + "日" + hours1 + "点" + mm1 + "分" + mills1 + "秒");

        //水位标识符
        String TAGwater = str.substring(82, 86);
        System.out.println("水位标识符：=" + TAGwater);

        //水位值
        String s16 = str.substring(86, 94);
        System.out.println("水位值：=" + s16);
        String substring1 = s16.substring(0, 6);
        String s17 = s16.substring(s16.length() - 3);
        System.out.println("水位值s17：" + s17);
        String shuiweizhi = substring1 + "." + s17;
        Double Lwater = Double.parseDouble(shuiweizhi);
        System.out.println("水位值：" + substring1 + "." + s17);
        System.out.println(Lwater);

        //降水量累计标识符
        String TAGrainfall = str.substring(94, 98);
        System.out.println("降水量累计标识符：" + TAGrainfall);

        //累积雨量数据
        String s19 = str.substring(98, 104);
        System.out.println("累积雨量数据：" + s19);
        String substring2 = s19.substring(0, 5);
        String substring3 = s19.substring(s19.length() - 1);
        String yuliang = substring2 + "." + substring3;
        double Cumulative_rainfal = Double.parseDouble(yuliang);
        System.out.println("累计雨量数据：" + Cumulative_rainfal);


        //当前降水量标识符
        String Curve_precipitation = str.substring(104, 108);
        System.out.println("当前降水量标识符：" + Curve_precipitation);

        //指早8点到目前的降雨量
        String s21 = str.substring(108, 112);
        System.out.println(s21);
        String substring4 = s21.substring(0, 3);
        String substring5 = s21.substring(s21.length() - 1);
        String jiangyuliang = substring4 + "." + substring5;
        Double Eight_Now_precipitation = Double.parseDouble(jiangyuliang);
        System.out.println("早8点到目前的降雨量：" + Eight_Now_precipitation);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(112, 116);
        System.out.println("太阳能电池板电压标识符:" + TAGvoltage);

        //太阳能板电压数据
        String s24 = str.substring(116, 120);
        String substring6 = s24.substring(0, 2);
        String substring7 = s24.substring(s24.length() - 1);
        String dianya = substring6 + "." + substring7;
        Double Voltage_data = Double.parseDouble(dianya);
        System.out.println("太阳能板电压数据:" + substring6 + "." + substring7);

        //太阳能板电流标识符
        String TAGelectricity = str.substring(120, 124);
        System.out.println("太阳能板电流标识符:" + TAGelectricity);

        //太阳能板电流数据
        String s25 = str.substring(124, 128);
        String s26 = s25.substring(0, 2);
        String s27 = s25.substring(s25.length() - 2);
        String dianliu = s26 + "." + s27;
        Double Ectricity_data = Double.parseDouble(dianliu);
        System.out.println("太阳能板电流数据:" + Ectricity_data);

        //电池电压标识符
        String TAGVE = str.substring(128, 132);
        System.out.println("电池电压标识符:" + TAGVE);

        //电池电压数据
        String s29 = str.substring(132, 136);
        String substring8 = s29.substring(0, 2);
        String substring9 = s29.substring(s29.length() - 2);
        String dianchidianya = substring8 + "." + substring9;
        Double VE_data = Double.parseDouble(dianchidianya);
        System.out.println("电池电压数据:" + VE_data);

        //电池电流标识符
        String TAGE_battery = str.substring(136, 140);
        System.out.println("电池电流标识符：" + TAGE_battery);

        //电池电流数据
        String s31 = str.substring(140, 144);
        String substring10 = s31.substring(0, 2);
        String substring11 = s31.substring(s31.length() - 2);
        String s32 = substring10 + "." + substring11;
        Double Battery_current_data = Double.parseDouble(s32);
        System.out.println("电池电流数据:" + Battery_current_data);

        //NB-IOT网络信号强度标识符
        String TAG_IOT = str.substring(144, 148);
        System.out.println("NB-IOT网络信号强度标识符:" + TAG_IOT);

        //NB-IOT网络信号强度
        String IOT_strength = str.substring(148, 150);
        int i9 = ResolvingUtils.twoToTen(IOT_strength);
        System.out.println("NB-IOT网络信号强度:" + IOT_strength);

        //4G/5G网络信号强度标识符
        String TAG_signal = str.substring(150, 154);
        System.out.println("4G/5G网络信号强度标识符:" + TAG_signal);

        //4G/5G网络信号强度
        String Signal_strength = str.substring(154, 156);
        int i10 = ResolvingUtils.twoToTen(Signal_strength);
        System.out.println("4G/5G网络信号强度:" + Signal_strength);

        //环境温度标识符
        String TAG_temperature = str.substring(156, 160);
        System.out.println("环境温度标识符：" + TAG_temperature);

        //环境温度数据
        String s38 = str.substring(160, 164);
        String substring12 = s38.substring(0, 2);
        String substring13 = s38.substring(s38.length() - 2);
        String Temperature_data1 = substring12 + "." + substring13;
        double Temperature_data = Double.parseDouble(Temperature_data1);
        System.out.println("环境温度数据：" + Temperature_data);

        //环境湿度标识符
        String TAG_humidity = str.substring(164, 168);
        System.out.println("环境湿度标识符：" + TAG_humidity);

        //环境湿度数据
        String s40 = str.substring(168, 172);
        String substring14 = s40.substring(0, 2);
        String substring15 = s40.substring(s40.length() - 2);
        String Humidity_data1 = substring14 + "." + substring15;
        Double Humidity_data = Double.parseDouble(Humidity_data1);
        System.out.println("环境湿度数据：" + Humidity_data);

        //流控字符
        String fluid_character = str.substring(172, 174);
        int i11 = ResolvingUtils.decodeHEX(fluid_character);
        System.out.println("流控字符：" + fluid_character);

        //CRC校验HEX
        String CRC_HEX = str.substring(str.length() - 4);
        System.out.println(CRC_HEX);
        String s43 = ResolvingUtils.crc16(CRC_HEX);
        System.out.println("CRC校验HEX:" + s43);

        //封装数据
        SYQ_test test = new SYQ_test();
        test.setCstation(Cstation).setFH(FH).setTENstation(TENstation).setPassWord(PassWord)
                .setTZmessage(TZmessage).setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater)
                .setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage2).setTAGstation(TAGstation).setNstation(Nstation)
                .setTstation(Tstation).setTAGDATE(TAGDATE).setDATEobservation(DATEobservation).setTAGwater(TAGwater)
                .setLwater(Lwater).setTAGrainfall(TAGrainfall).setCumulative_rainfal(Cumulative_rainfal).setCurve_precipitation(Curve_precipitation)
                .setEight_Now_precipitation(Eight_Now_precipitation).setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data)
                .setTAGelectricity(TAGelectricity).setEctricity_data(Ectricity_data).setTAGVE(TAGVE).setVE_data(VE_data)
                .setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal).setSignal_strength(Signal_strength)
                .setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data).setTAG_humidity(TAG_humidity)
                .setHumidity_data(Humidity_data).setFluid_character(fluid_character).setCRC_HEX(CRC_HEX).setTAGE_battery(TAGE_battery).setBattery_current_data(Battery_current_data);

        return test;
    }


}
