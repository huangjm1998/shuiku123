package com.zz.common.util;

import java.math.BigInteger;

public class ResolvingUtils {
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

//    public static void main(String[] args) {
//        String str = "7E7E04301030112599992F800802000120032003532204B81A";
//        String s = str.toLowerCase();
//        transition.method(s);
//    }


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

    //将16进制转换为十进制
    public static int decodeHEX(String hexs) {
        BigInteger bigint = new BigInteger(hexs, 16);
        int numb = bigint.intValue();
        return numb;
    }
}
