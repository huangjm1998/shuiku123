package com.zz.common.config.jiexi;

import com.zz.pojo.SYQ_self_inspection;

public class ZiJianBao {

    public static SYQ_self_inspection method(String str) {
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);
        System.out.println("中心站 s2=" + Cstation);
        int s2 = XinTiaoBao.decodeHEX(Cstation);
        System.out.println("中心站号：" + s2);

        //测站编码
        String TENstation = str.substring(6, 16);
        System.out.println("测站编号 s3=" + TENstation);
        //int s4 = XinTiaoBao.twoToTen(TENstation);
        //System.out.println("测站编码:" + s4);

        //密码
        String PassWord = str.substring(16, 20);
        System.out.println("密码s5=" + PassWord);
        int i = XinTiaoBao.decodeHEX(PassWord);
        System.out.println("密码：" + i);

        //报文特征
        String Function_Code = str.substring(20, 22);
        System.out.println("报文特正 =" + Function_Code);
        int i1 = XinTiaoBao.decodeHEX(Function_Code);
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
//        Long Nstation = Long.parseLong(Nstation1);
//        System.out.println("测站号"+Nstation);

        //测站类型码
        String Tstation = str.substring(64, 66);

        //太阳能电池板电压标识符
        String TAGvoltage = str.substring(66, 70);

        //太阳能电压数据
        String s = str.substring(70, 74);
        String substring1 = s.substring(0, 2);
        String substring2 = s.substring(s.length() - 2);
        String dianya = substring1 + "." + substring2;
        double Voltage_data = Double.parseDouble(dianya);

        //太阳能电流版电池标识符
        String TAGelectricity = str.substring(74, 78);

        //太阳能板电流数据
        String s1 = str.substring(78, 82);
        String substring3 = s1.substring(0, 2);
        String substring4 = s1.substring(s1.length() - 2);
        String dianliu = substring3 + "." + substring4;
        double Ectricity_data = Double.parseDouble(dianliu);

        //电池电压标识符
        String TAGVE = str.substring(82, 84);

        //电池电压数据
        String s3 = str.substring(84, 88);
        String substring5 = s3.substring(0, 2);
        String substring6 = s3.substring(s3.length() - 2);
        String dianyashuku = substring5 + "." + substring6;
        double VE_data = Double.parseDouble(dianyashuku);

        //电池电流标识符
        String TAGE_battery = str.substring(88, 92);

        //电流数据
        String s5 = str.substring(92, 96);
        String substring7 = s5.substring(0, 2);
        String substring8 = s5.substring(s5.length() - 2);
        String dianliu2 = substring2 + '.' + substring8;
        double Battery_current_data = Double.parseDouble(dianliu2);

        //NB-iot网络信号强度
        String TAG_IOT = str.substring(96, 100);

        //网络信号强度
        String IOT_strength = str.substring(100, 102);

        //4g/5g网络信号标识符
        String TAG_signal = str.substring(102, 106);

        //4g5g网络信号强度
        String Signal_strength = str.substring(106, 108);

        //环境温度标识符
        String TAG_temperature = str.substring(108, 112);

        //环境温度数据
        String s6 = str.substring(112, 116);
        String substring9 = s6.substring(0, 2);
        String substring10 = s6.substring(s6.length() - 2);
        String wendu = substring9 + "." + substring10;
        double Temperature_data = Double.parseDouble(wendu);

        //环境湿度标识符
        String TAG_humidity = str.substring(116, 120);

        //环境湿度数据
        String s7 = str.substring(120, 124);
        String substring11 = s7.substring(0, 2);
        String substring12 = s7.substring(s7.length() - 2);
        String shidu = substring11 + "." + substring12;
        double Humidity_data = Double.parseDouble(shidu);

        //视频运行状态标识符
        String TAG_video = str.substring(124, 128);

        //视频运行状态信息
        String Video_message = str.substring(128, 130);

        //倾斜状态标识符
        String TAG_incline = str.substring(130, 134);

        //倾斜状态信息
        String incline_message = str.substring(134, 136);

        //设备碰撞状态信息标识符
        String TAG_crash = str.substring(136, 140);

        //设备碰撞状态信息
        String crash_message = str.substring(140, 144);

        //设备诊断标识符
        String TAG_diagnose = str.substring(144, 148);

        //设备诊断数据
        String Diagnose_message = str.substring(148, 150);

        //自检状态始符
        String TAG_self_inspection = str.substring(150, 154);

        //自检状态数据
        String Self_inspection_message = str.substring(154, 162);

        //流控字符
        String Fluid_character = str.substring(162, 164);

        //crc校验hex
        String CRC_HEX = str.substring(164, 168);


        //封装数据
        SYQ_self_inspection t = new SYQ_self_inspection();
        t.setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setLmessage(Lmessage)
                .setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage)
                .setTAGstation(TAGstation).setNstation(Nstation).setTstation(Tstation).setTAGvoltage(TAGvoltage)
                .setVoltage_data(Voltage_data).setTAGelectricity(TAGelectricity).setEctricity_data(Ectricity_data)
                .setTAGVE(TAGVE).setVE_data(VE_data).setTAGE_battery(TAGE_battery).setBattery_current_data(Battery_current_data)
                .setTAG_IOT(TAG_IOT).setIOT_strength(IOT_strength).setTAG_signal(TAG_signal).setSignal_strength(Signal_strength)
                .setTAG_temperature(TAG_temperature).setTemperature_data(Temperature_data).setTAG_humidity(TAG_humidity)
                .setHumidity_data(Humidity_data).setTAG_video(TAG_video).setVideo_message(Video_message).setTAG_incline(TAG_incline)
                .setIncline_message(incline_message).setTAG_diagnose(TAG_diagnose).setTAG_crash(TAG_crash).setCrash_message(crash_message)
                .setDiagnose_message(Diagnose_message).setTAG_self_inspection(TAG_self_inspection).setSelf_inspection_message(Self_inspection_message)
                .setFluid_character(Fluid_character).setCRC_HEX(CRC_HEX).setFunction_Code(Function_Code);
        return t;
    }
}
