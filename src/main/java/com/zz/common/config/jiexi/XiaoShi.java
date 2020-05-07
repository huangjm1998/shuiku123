package com.zz.common.config.jiexi;
//小时报

import com.zz.common.util.ResolvingUtils;
import com.zz.pojo.SYQ_hour;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class XiaoShi {
    public static SYQ_hour method(String str) throws ParseException {
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);
        System.out.println("中心站 s2=" + Cstation);
        //int s2 = XinTiaoBao.decodeHEX(Cstation);
        //  System.out.println("中心站号：" + s2);

        //测站编码
        String TENstation = str.substring(6, 16);
        System.out.println("测站编号 s3=" + TENstation);
        // int s4 = XinTiaoBao.twoToTen(TENstation);
        // System.out.println("测站编码:" + s4);

        //密码
        String PassWord = str.substring(16, 20);
        System.out.println("密码s5=" + PassWord);
        int i = XinTiaoBao.decodeHEX(PassWord);
        System.out.println("密码：" + i);

        //报文特征
        String TZmessage = str.substring(20, 22);
        System.out.println("报文特正 =" + TZmessage);
        int i1 = XinTiaoBao.decodeHEX(TZmessage);
        System.out.println("报文特征：" + i1);

        //上行报文标识及长度
        String Lmessage = str.substring(22, 26);
        System.out.println("上行报文标识=" + Lmessage);
        int i2 = XinTiaoBao.decodeHEX(Lmessage);
        System.out.println("上行报文及长度：" + i2);

        //正文起始fu
        String Smessage = str.substring(26, 28);
        System.out.println("正文起始符=" + Smessage);
        int i3 = XinTiaoBao.decodeHEX(Smessage);
        System.out.println("正文起始符" + i3);

        //流水号
        String Nwater = str.substring(28, 32);
        System.out.println("流水号s1=" + Nwater);
        int i4 = XinTiaoBao.decodeHEX(Nwater);
        System.out.println("流水号：" + i4);

        //上报通道标识符
        String TAG = str.substring(32, 36);
        System.out.println("上报通道标识符 s10=" + TAG);
        System.out.println();

        //NB-IOT
        String IOT = str.substring(36, 38);
        System.out.println("NB-IOT S6=" + IOT);
        int i5 = XinTiaoBao.twoToTen(IOT);
        System.out.println("NB-IOT:" + i5);

        //发报时间
        String substring = str.substring(38, 50);
        System.out.println("时间=" + substring);
        String year = substring.substring(0, 2);
        String year1 = "20" + year;
        String month = substring.substring(2, 4);
        String day = substring.substring(4, 6);
        String hours = substring.substring(6, 8);
        String mm = substring.substring(8, 10);
        String mills = substring.substring(10, 12);
        String DATAmessage = year1 + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;
        System.out.println("20" + year + "年" + month + "月" + day + "日" + hours + "点" + mm + "分" + mills + "秒");

        //测站地址标识符
        String TAGstation = str.substring(50, 54);
        System.out.println("测站地址标识符:" + TAGstation);

        //测站号
        String Nstation = str.substring(54, 64);
        // Long Nstation = Long.parseLong(Nstation1);
        System.out.println("测站号" + Nstation);

        //测站类型码
        String Tstation = str.substring(64, 66);

        //观测时间标识符
        String TAGDATE = str.substring(66, 70);

        //观测时间
        String s = str.substring(70, 80);
        String year2 = s.substring(0, 2);
        String year3 = "20" + year2;
        String month1 = substring.substring(2, 4);
        String day1 = substring.substring(4, 6);
        String hours1 = substring.substring(6, 8);
        String mm1 = substring.substring(8, 10);
        String DATEobservation = year3 + "-" + month1 + "-" + day1 + " " + hours1 + ":" + mm1;

        //一小时内12个 五分钟的雨量标识符
        String TAG_twelve_rainfall = str.substring(80, 84);

        //一个小时内12个5分钟的数据
        String Twelve_message_rainfall = "";
        String s1 = str.substring(84, 108);
        System.out.println("一个小时内12个5分钟的数据" + s1);
        int a = 0;
        for (int b = 0; b < 12; b++) {
            String s3 = s1.substring(a, a = a + 2);
            int i6 = ResolvingUtils.decodeHEX(s3);
            System.out.println("s3:" + i6);
            Twelve_message_rainfall = Twelve_message_rainfall + i6 + " ";
        }
        System.out.println("一个小时内12个5分钟的数据：" + Twelve_message_rainfall);

        //12个5分钟水位标识符
        String TAG_twelve_water = str.substring(108, 112);

        //12个 5 分钟水位
        String s3 = str.substring(112, 160);
        String Twelve_message_water = "";
        int c = 0;
        for (int e = 0; e < 24; e++) {
            String s5 = s3.substring(c, c = c + 2);
            int i6 = ResolvingUtils.decodeHEX(s5);

            Twelve_message_water = Twelve_message_water + i6 + " ";
        }

        //降水量累计值标识符
        String TAGrainfall = str.substring(160, 164);

        //累计降水量标识
        String s5 = str.substring(164, 170);
        String substring1 = s5.substring(0, 5);
        String substring2 = s5.substring(s5.length() - 1);
        String jiangshuiliang = substring1 + "." + substring2;
        double Cumulative_rainfal = Double.parseDouble(jiangshuiliang);

        //当前降水量标识符
        String Curve_precipitation = str.substring(170, 174);

        //指早8点到目前的降雨量
        String s6 = str.substring(174, 180);
        String substring3 = s6.substring(0, 5);
        String substring4 = s6.substring(s6.length() - 1);
        String yuliang = substring3 + "." + substring4;
        double Eight_Now_precipitation = Double.parseDouble(yuliang);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(180, 184);

        //太阳能板电压数据
        String s7 = str.substring(184, 188);
        String substring5 = s7.substring(0, 2);
        String substring6 = s7.substring(s7.length() - 2);
        String dianya = substring5 + "." + substring6;
        double Voltage_data = Double.parseDouble(dianya);

        //太阳能电池板电流标识符
        String TAGelectricity = str.substring(188, 192);

        //太阳能板电流数据
        String s8 = str.substring(192, 196);
        String substring7 = s8.substring(0, 2);
        String substring8 = s8.substring(s8.length() - 2);
        String dianliu = substring7 + "." + substring8;
        double Ectricity_data = Double.parseDouble(dianliu);


        //电池电压标识符
        String TAGVE = str.substring(196, 200);

        //电池电压数据
        String s9 = str.substring(200, 204);
        String substring9 = s9.substring(0, 2);
        String ss10 = s9.substring(s9.length() - 2);
        String dianya1 = substring9 + "." + ss10;
        double VE_data = Double.parseDouble(dianya1);

        //电池电流标识符
        String TAGE_battery = str.substring(204, 208);

        //电池电流数据
        String s10 = str.substring(208, 212);
        String substring10 = s10.substring(0, 2);
        String substring11 = s10.substring(s10.length() - 2);
        String dianliu1 = substring9 + "." + substring11;
        double Battery_current_data = Double.parseDouble(dianliu1);
        System.out.println("Battery_current_data:" + Battery_current_data);

        //nb-iot网络信号标识符
        String TAG_IOT = str.substring(212, 216);

        //NB-IOT网络信号强度
        String IOT_strength = str.substring(216, 218);

        //4g/5g网咯信号强度标识符
        String TAG_signal = str.substring(218, 222);


        //4g/5g网络信号强度
        String Signal_strength = str.substring(222, 224);

        //环境温度标识符
        String TAG_temperature = str.substring(224, 228);

        //环境温度数据
        String s11 = str.substring(228, 232);
        String substring12 = s11.substring(0, 2);
        String substring13 = s11.substring(s11.length() - 2);
        String wendu = substring12 + "." + substring13;
        double Temperature_data = Double.parseDouble(wendu);

        //环境湿度标识符
        String TAG_humidity = str.substring(232, 236);

        //环境湿度数据
        String s12 = str.substring(236, 240);
        String substring14 = s12.substring(0, 2);
        String substring15 = s12.substring(s12.length() - 2);
        String shidu = substring14 + "." + substring15;
        double Humidity_data = Double.parseDouble(shidu);

        //流控字符
        String fluid_character = str.substring(240, 242);

        //CRC检验
        String CRC_HEX = str.substring(str.length() - 4);

        //观测时间
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        double hours11 = 0;
        try {
            Date date = df.parse(DATAmessage);
            Date date1 = df.parse(DATEobservation);
            double diff = date1.getTime() - date.getTime();//这样得到的差值是毫秒级别
            double days = diff / (1000 * 60 * 60 * 24);
            hours11 = (diff - days * (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        int i6 = Integer.parseInt(year3);
//        int i7 = Integer.parseInt(year1);
//        int m1 = Integer.parseInt(month1);
//        int m3 = Integer.parseInt(month);
//        int d1 = Integer.parseInt(day1);
//        int d2 = Integer.parseInt(day);
//        Integer.parseInt()
//        int y = i7-i6;
//        int m=m1-m3;
//        int d=d1-d2;


        //封装数据

        return new SYQ_hour().setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord)
                .setTZmessage(TZmessage).setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG)
                .setIOT(IOT).setDATAmessage(DATAmessage).setTAGstation(TAGstation).setNstation(Nstation)
                .setTstation(Tstation).setTAGDATE(TAGDATE).setDATEobservation(DATEobservation).setTAG_twelve_rainfall(TAG_twelve_rainfall)
                .setTwelve_message_rainfall(Twelve_message_rainfall).setTAG_twelve_water(TAG_twelve_water)
                .setTwelve_message_water(Twelve_message_water).setTAGrainfall(TAGrainfall).setCumulative_rainfal(Cumulative_rainfal)
                .setCurve_precipitation(Curve_precipitation).setEight_Now_precipitation(Eight_Now_precipitation)
                .setTAGvoltage(TAGvoltage).setVoltage_data(Voltage_data).setTAGelectricity(TAGelectricity).setEctricity_data(Ectricity_data)
                .setTAGVE(TAGVE).setVE_data(VE_data).setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal)
                .setSignal_strength(Signal_strength).setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data)
                .setTAG_humidity(TAG_humidity).setFluid_character(fluid_character).setCRC_HEX(CRC_HEX).setHumidity_data(Humidity_data).setTAGE_battery(TAGE_battery)
                .setDRP(Cumulative_rainfal).setINTV(hours11).setDYP(Eight_Now_precipitation).setMODITIME(df.parse(DATAmessage)).setPDR(hours11);
    }
}
