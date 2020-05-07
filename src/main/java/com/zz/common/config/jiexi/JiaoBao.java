package com.zz.common.config.jiexi;

import com.zz.common.util.ResolvingUtils;
import com.zz.pojo.SYQ_plus;

//加报
public class JiaoBao {
    public static SYQ_plus method(String str) {
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);
        System.out.println("中心站 s2=" + Cstation);
        int s2 = ResolvingUtils.decodeHEX(Cstation);
        System.out.println("中心站号：" + s2);

        //测站编码
        String TENstation = str.substring(6, 16);
        System.out.println("测站编号 s3=" + TENstation);
        int s4 = ResolvingUtils.decodeHEX(TENstation);
        System.out.println("测站编码:" + s4);

        //密码
        String PassWord = str.substring(16, 20);
        System.out.println("密码s5=" + PassWord);
        int i = ResolvingUtils.decodeHEX(PassWord);
        System.out.println("密码：" + i);

        //报文特征
        String TZmessage = str.substring(20, 22);
        System.out.println("报文特正 =" + TZmessage);
        int i1 = ResolvingUtils.decodeHEX(TZmessage);
        System.out.println("报文特征：" + i1);

        //上行报文标识及长度
        String Lmessage = str.substring(22, 26);
        System.out.println("上行报文标识=" + Lmessage);
        int i2 = ResolvingUtils.decodeHEX(Lmessage);
        System.out.println("上行报文及长度：" + i2);

        //正文起始fu
        String Smessage = str.substring(26, 28);
        System.out.println("正文起始符=" + Smessage);
        int i3 = ResolvingUtils.decodeHEX(Smessage);
        System.out.println("正文起始符" + i3);

        //流水号
        String Nwater = str.substring(28, 32);
        System.out.println("流水号s1=" + Nwater);
        int i4 = ResolvingUtils.decodeHEX(Nwater);
        System.out.println("流水号：" + i4);

        //上报通道标识符
        String TAG = str.substring(32, 36);
        System.out.println("上报通道标识符 s10=" + TAG);
        System.out.println();

        //NB-IOT
        String IOT = str.substring(36, 38);
        System.out.println("NB-IOT S6=" + IOT);
        int i5 = ResolvingUtils.twoToTen(IOT);
        System.out.println("NB-IOT:" + i5);

        //发报时间
        String substring = str.substring(38, 50);
        System.out.println("时间=" + substring);
        String year = "20" + substring.substring(0, 2);
        String month = substring.substring(2, 4);
        String day = substring.substring(4, 6);
        String hours = substring.substring(6, 8);
        String mm = substring.substring(8, 10);
        String mills = substring.substring(10, 12);
        String DATAmessage = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;
        System.out.println("20" + year + "年" + month + "月" + day + "日" + hours + "点" + mm + "分" + mills + "秒");

        //测站地址标识符
        String TAGstation = str.substring(50, 54);
        System.out.println("测站地址标识符：" + TAGstation);

        //测站号
        String Nstation = str.substring(54, 64);
//       String Nstation = ResolvingUtils.decodeHEX(Nstation1);
//            int Nstation = (long)Nstation12;
        // long Nstation = Long.parseLong(Nstation1);
        System.out.println("测站号：" + Nstation);

        //测站类型码
        String Tstation = str.substring(64, 66);
        System.out.println("测站类型码：" + Tstation);

        //观测时间标识符
        String TAGDATE = str.substring(66, 70);
        System.out.println("观测时间标识符：" + TAGDATE);

        //观测时间
        String s12 = str.substring(70, 80);
        System.out.println("时间=" + s12);
        String year1 = "20" + s12.substring(0, 2);
        String month1 = s12.substring(2, 4);
        String day1 = s12.substring(4, 6);
        String hours1 = s12.substring(6, 8);
        String mm1 = s12.substring(8, 10);
        String DATEobservation = year1 + "-" + month1 + "-" + day1 + " " + hours1 + ":" + mm1;
        System.out.println("20" + year1 + "年" + month1 + "月" + day1 + "日" + hours1 + "点" + mm1 + "分");

        //水位标识符
        String TAGwater = str.substring(80, 84);
        System.out.println("水位标识符：" + TAGwater);

        //水位值
        String s14 = str.substring(84, 92);
        System.out.println("水位值：=" + s14);
        String substring1 = s14.substring(0, 5);
        String substring2 = s14.substring(s14.length() - 3);
        String shuiweizhi = substring1 + "." + substring2;
        double Lwater = Double.parseDouble(shuiweizhi);
        System.out.println("水位值:" + Lwater);

        //降水量累计值标识符
        String TAGrainfall = str.substring(92, 96);
        System.out.println("降水量累计标识符：" + TAGrainfall);

        //累计雨量数据
        String s16 = str.substring(96, 102);
        System.out.println("累计雨量数据：=" + s16);
        String substring3 = s16.substring(0, 5);
        String substring4 = s16.substring(s16.length() - 1);
        String zongyuliang = substring3 + "." + substring4;
        double Cumulative_rainfal = Double.parseDouble(zongyuliang);
        System.out.println("累计雨量数据：" + Cumulative_rainfal);

        //当前降水量标识符
        String Curve_precipitation = str.substring(102, 106);
        System.out.println("当前降水量标识符：" + Curve_precipitation);

        //指早8点到目前的降雨量
        String s18 = str.substring(106, 112);
        String substring5 = s18.substring(0, 5);
        String substring6 = s18.substring(s18.length() - 1);
        String jiangyuliang1 = substring5 + "." + substring6;
        double Eight_Now_precipitation = Double.parseDouble(jiangyuliang1);
        System.out.println("指早8点到目前的降雨量：" + Eight_Now_precipitation);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(112, 116);
        System.out.println("太阳能电池板电压标识符:" + TAGvoltage);

        //太阳能板电压数据
        String s20 = str.substring(116, 120);
        String substring7 = s20.substring(0, 2);
        String substring8 = s20.substring(s20.length() - 2);
        String dianya = substring7 + "." + substring8;
        double Voltage_data = Double.parseDouble(dianya);
        System.out.println("太阳能板电压数据：" + Voltage_data);

        //太阳能电池板电流标识符
        String TAGelectricity = str.substring(120, 124);
        System.out.println("太阳能电池板电流标识符:" + TAGelectricity);

        //太阳能板电流数据
        String s21 = str.substring(124, 128);
        String substring10 = s21.substring(0, 2);
        String substring11 = s21.substring(s21.length() - 2);
        String dianliu2 = substring10 + "." + substring11;
        double Ectricity_data = Double.parseDouble(dianliu2);
        System.out.println("太阳能板电流数据；" + dianliu2);

        //电池电压标识符
        String TAGVE = str.substring(128, 132);
        System.out.println("电池电压标识符：" + TAGVE);

        //电池电压数据
        String s23 = str.substring(132, 136);
        String substring12 = s23.substring(0, 2);
        String substring13 = s23.substring(s23.length() - 2);
        String dianya2 = substring12 + "." + substring13;
        double VE_data = Double.parseDouble(dianya2);
        System.out.println("电池电压数据：" + dianya2);

        //电池电流标识符
        String TAGE_battery = str.substring(136, 140);
        System.out.println("电池电流标识符：" + TAGE_battery);

        //电池电流数据
        String s25 = str.substring(140, 144);
        String substring14 = s25.substring(0, 2);
        String substring15 = s25.substring(s25.length() - 2);
        String dcdl = substring14 + "." + substring15;
        double Battery_current_data = Double.parseDouble(dcdl);
        System.out.println("电池电流数据：" + Battery_current_data);

        //NB-IOT网络信号强度标识符
        String TAG_IOT = str.substring(144, 148);
        System.out.println("NB-IOT网络信号强度标识符:" + TAG_IOT);

        //NB-IOT网络信号强度
        String IOT_strength = str.substring(148, 150);
        int i6 = ResolvingUtils.twoToTen(IOT_strength);
        System.out.println("NB-IOT网络信号强度:" + i6);

        //4G/5G网络信号强度标识符
        String TAG_signal = str.substring(150, 154);
        System.out.println("4G/5G网络信号强度标识符:" + TAG_signal);

        //4G/5G网络信号强度
        String Signal_strength = str.substring(154, 156);
        int i7 = ResolvingUtils.twoToTen(Signal_strength);
        System.out.println("4G/5G网络信号强度:" + i7);

        //环境温度标识符
        String TAG_temperature = str.substring(156, 160);
        System.out.println("环境温度标识符：" + TAG_temperature);

        //环境温度数据
        String s29 = str.substring(160, 164);
        String substring18 = s29.substring(0, 2);
        String substring19 = s29.substring(s29.length() - 2);
        String wendu = substring18 + "." + substring19;
        double Temperature_data = Double.parseDouble(wendu);
        System.out.println("环境温度数据：" + wendu);

        //环境湿度标识符
        String TAG_humidity = str.substring(164, 168);
        System.out.println("环境湿度标识符：" + TAG_humidity);

        //环境湿度数据
        String s30 = str.substring(168, 172);
        String substring21 = s30.substring(0, 2);
        String substring22 = s30.substring(s30.length() - 2);
        String shidu = substring21 + "." + substring22;
        double Humidity_data = Double.parseDouble(shidu);
        System.out.println("环境湿度数据:" + Humidity_data);

        //倾斜状态标识符
        String TAG_incline = str.substring(172, 176);
        System.out.println("倾斜状态标识符：" + TAG_incline);

        //倾斜状态信息
        String incline_message = str.substring(176, 178);
        System.out.println("倾斜状态信息：" + incline_message);

        //设备碰撞状态信息标识符
        String TAG_crash = str.substring(178, 182);
        System.out.println("设备碰撞状态信息标识符:" + TAG_crash);

        //设备碰撞撞状态信息
        String crash_message = str.substring(182, 184);
        System.out.println("设备碰撞撞状态信息:" + crash_message);

        //流控字符
        String fluid_character = str.substring(184, 186);
        System.out.println("流控字符：" + fluid_character);

        //CRC校验hex
        String CRC_HEX = str.substring(186, 190);
        String s36 = ResolvingUtils.crc16(CRC_HEX);
        System.out.println("CRC校验hex:" + s36);


        //封装对象信息
        return new SYQ_plus().setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setTZmessage(TZmessage)
                .setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage)
                .setTAGstation(TAGstation).setNstation(Nstation).setTstation(Tstation).setTAGDATE(TAGDATE)
                .setDATEobservation(DATEobservation).setTAGwater(TAGwater).setLwater(Lwater).setTAGrainfall(TAGrainfall)
                .setCumulative_rainfal(Cumulative_rainfal).setCurve_precipitation(Curve_precipitation).setEight_Now_precipitation(Eight_Now_precipitation)
                .setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data).setTAGelectricity(TAGelectricity).setEctricity_data(Ectricity_data)
                .setTAGVE(TAGVE).setVE_data(VE_data).setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal)
                .setSignal_strength(Signal_strength).setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data).setTAG_humidity(TAG_humidity)
                .setHumidity_data(Humidity_data).setTAG_incline(TAG_incline).setIncline_message(incline_message)
                .setTAG_crash(TAG_crash).setCrash_message(crash_message).setTAG_crash(TAG_crash).setCrash_message(crash_message)
                .setFluid_character(fluid_character).setCRC_HEX(CRC_HEX).setTAGE_battery(TAGE_battery).setBattery_current_data(Battery_current_data).setTstation(Tstation);
    }
}
