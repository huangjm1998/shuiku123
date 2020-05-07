package com.zz.common.config.jiexi;


import com.zz.common.util.ResolvingUtils;
import com.zz.pojo.SYQ_heartbeat;

import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


//心跳报
public class XinTiaoBao {
    public static SYQ_heartbeat method(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String FH = str.substring(0, 4);

        //中心站号
        String Cstation = str.substring(4, 6);
        System.out.println("中心站 s2=" + Cstation);
        int s2 = XinTiaoBao.decodeHEX(Cstation);
        System.out.println("中心站号：" + s2);

        //测站编码
        String TENstation = str.substring(6, 16);
        System.out.println("测站编号 s3=" + TENstation);
        int s4 = XinTiaoBao.twoToTen(TENstation);
        System.out.println("测站编码:" + s4);

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
        String Lmessage1 = str.substring(22, 26);
        int Lmessage2 = ResolvingUtils.decodeHEX(Lmessage1);
        String Lmessage = String.valueOf(Lmessage2);
        System.out.println("上行报文标识=" + Lmessage);
        // int i2 = XinTiaoBao.decodeHEX(Lmessage);
        // System.out.println("上行报文及长度："+i2);

        //正文起始fu
        String Smessage1 = str.substring(26, 28);
        int Smessage2 = ResolvingUtils.decodeHEX(Smessage1);
        String Smessage = String.valueOf(Smessage2);
        System.out.println("正文起始符=" + Smessage);
        // int i3 = XinTiaoBao.decodeHEX(Smessage);
        //System.out.println("正文起始符"+ i3);

        //流水号
        String Nwater1 = str.substring(28, 32);
        System.out.println("流水号s1=" + Nwater1);
        int i4 = XinTiaoBao.decodeHEX(Nwater1);
        String Nwater = String.valueOf(i4);
        System.out.println("流水号：" + Nwater);

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
        String year = "20" + substring.substring(0, 2);
        String month = substring.substring(2, 4);
        String day = substring.substring(4, 6);
        String hours = substring.substring(6, 8);
        String mm = substring.substring(8, 10);
        String mills = substring.substring(10, 12);
        String DATEmessage1 = year + "-" + month + "-" + day + " " + hours + ":" + mm + ":" + mills;
        Date DATEmessage = sdf.parse(DATEmessage1);
        System.out.println("20" + year + "年" + month + "月" + day + "日" + hours + "点" + mm + "分" + mills + "秒");


        //流控字符
        String Fcharacter = str.substring(50, 52);
        System.out.println("流控字符 s7=" + Fcharacter);
        int i6 = XinTiaoBao.decodeHEX(Fcharacter);
        System.out.println("流水控制符：" + i6);

        //crc验证HEX
        String CRC_HEX = str.substring(str.length() - 4);

        String s9 = XinTiaoBao.crc16(CRC_HEX);
        System.out.println(s9);

        return new SYQ_heartbeat().setFH(FH).setCstation(Cstation).setTENstation(TENstation).setPassWord(PassWord).setTZmessage(TZmessage)
                .setLmessage(Lmessage).setSmessage(Smessage).setNwater(Nwater).setTAG(TAG).setIOT(IOT).setDATEmessage(DATEmessage)
                .setFcharacter(Fcharacter).setCRC_HEX(CRC_HEX);


    }


    //将16进制转换为十进制
    public static int decodeHEX(String hexs) {
        BigInteger bigint = new BigInteger(hexs, 16);
        int numb = bigint.intValue();
        return numb;
    }

    //二进制转十进制,次方相加
    public static int twoToTen(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            result = result + Integer.parseInt(s.substring(i, i + 1)) * (int) (Math.pow(2, s.length() - 1 - i));
        }
        return result;
    }


    //hex to bcd
    public static String HextoBcd(String hex) {

        int decimal = Integer.parseInt(hex, 16);

        String bcd = DecimaltoBcd(String.valueOf(decimal));

        return bcd;
    }

    public static String DecimaltoBcd(String str) {
        String b_num = "";
        for (int i = 0; i < str.length(); i++) {

            String b = Integer.toBinaryString(Integer.parseInt(String.valueOf(str.charAt(i))));

            int b_len = 4 - b.length();

            for (int j = 0; j < b_len; j++) {
                b = "0" + b;
            }
            b_num += b;
        }

        return b_num;
    }

    public static void main(String[] args) {
        String str = "7E7E04301030112599992F800802000120032003532204B81A";
        String s = str.toLowerCase();
        //  XinTiaoBao.method(s);
    }


    //crc16算法
    public static String crc16(String gprsstr) {
        try {
            int crc;
            int strlength, r;
            byte sbit;
            int tc;
            strlength = gprsstr.length();
            byte[] data = gprsstr.getBytes();
            crc = 0x0000FFFF;
            for (int i = 0; i < strlength; i++) {
                tc = crc >>> 8;
                crc = tc ^ data[i];
                for (r = 0; r < 8; r++) {
                    sbit = (byte) (crc & 0x00000001);
                    crc >>>= 1;
                    if (sbit != 0)
                        crc ^= 0x0000A001;
                }
            }
            return Integer.toHexString(crc);
        } catch (Exception ex) {
            return "";
        }
    }


}
