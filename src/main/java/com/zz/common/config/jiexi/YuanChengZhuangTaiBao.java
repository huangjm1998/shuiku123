package com.zz.common.config.jiexi;

import com.zz.pojo.SYQ_video;

public class YuanChengZhuangTaiBao {
    public static SYQ_video methods(String str) {
        //帧头
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);

        //十位测站号
        String TENstation = str.substring(6, 16);

        //密码
        String PassWord = str.substring(16, 20);

        //功能码
        String Function_Code = str.substring(20, 22);

        //上行报文标识及正文长度
        String Lmessage = str.substring(22, 26);

        //正文起始符
        String Smessage = str.substring(26, 28);

        //流水号
        String Nwater = str.substring(28, 32);

        //上报通道标识
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

        //视频运行状态标识符
        String TAG_video = str.substring(50, 54);

        //视频状态信息
        String Video_message = str.substring(54, 56);

        //测站地址标识符
        String TAGstation = str.substring(56, 60);

        //测站地址
        String Address_station = str.substring(60, 70);
        //long Address_station = Long.parseLong(s1);

        //流控字符
        String Fluid_character = str.substring(70, 72);

        //crc校验
        String CRC_HEX = str.substring(72, 76);


        //封装数据
        SYQ_video video = new SYQ_video();
        video.setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord)
                .setFunction_Code(Function_Code).setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater)
                .setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage).setTAG_video(TAG_video).setVideo_message(Video_message)
                .setTAGstation(TAGstation).setAddress_station(Address_station).setFluid_character(Fluid_character).setCRC_HEX(CRC_HEX);
        return video;
    }
}
