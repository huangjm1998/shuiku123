package com.zz.common.config.jiexi;

import com.zz.common.util.potoUtil;
import com.zz.pojo.SYQ_picture_plus;

import java.io.IOException;

public class TuXiangJiaBao {
    private static int i = 0;

    public static SYQ_picture_plus method(String str) throws IOException {
        i++;
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

        //上行报文标识
        String Lmessage = str.substring(22, 26);

        //正文起始符
        String Smessage = str.substring(26, 28);

        //流水号
        String Nwater = str.substring(28, 32);

        //上报通道标识符‘
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
        String DATAmessage = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;


        //测站地址标识符
        String TAGstation = str.substring(50, 54);

        //测站号
        String Nstation = str.substring(54, 64);
        //long Nstation = Long.parseLong(s1);

        //测站类型码
        String Tstation = str.substring(64, 66);

        //图像标识符
        String TAG_picture = str.substring(66, 70);

        //图片数据
        String Photograph_message = str.substring(70, str.length() - 6);
        byte[] bytes = potoUtil.fromHexString(Photograph_message);
        potoUtil.byte2image(bytes, "d:" + i + ".jpg");
        double v = potoUtil.potoSize("d:" + i + ".jpg");

        //流控字符
        String s2 = str.substring(str.length() - 6);
        String Fluid_character = s2.substring(0, 2);
        //CRC校验HEX
        String CRC_HEX = s2.substring(s2.length() - 4);

        SYQ_picture_plus t = new SYQ_picture_plus();
        t.setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setFunction_Code(Function_Code)
                .setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATAmessage(DATAmessage)
                .setTAGstation(TAGstation).setNstation(Nstation).setTstation(Tstation).setTAG_picture(TAG_picture).setPhotograph_message("http://hjm:12334/image/get/d:" + i + ".jpg")
                .setFluid_character(Fluid_character).setCRC_HEX(CRC_HEX).setIMGSZ(v).setIMGNM(i + ".jpg").setIMGPH("d:" + i + ".jpg");
        return t;
    }
}
