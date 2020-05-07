package com.zz;

import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {

        //  String sr = "7E 7E 25 00 43 01 03 0B 99 99 30 00 48 02 00 01 FF 10 01 20 03 12 16 30 34 F1 F1 00 43 01 03 0B 4B F0 F0 20 03 12 16 30 39 3B 00 00 00 00 26 19 02 23 22 20 19 01 23 22 FF 16 36 89 FF 17 01 63 FF 18 00 00 FF 19 00 00 FF 20 20 FF 21 31 FF 22 00 00 FF 23 00 00 03 EA 9C";
        String sr = "7E7E25004301030B999933004E020002FF1001200320155955F1F1004301030B4BF0F02003201559393B0000000026190223312019012331FF163689FF170136FF180000FF190000FF2020FF2117FF220000FF230000FF2626FF27270313ED";
        String s = sr.trim();
        String s1 = sr.toLowerCase();
        System.out.println(s);
        System.out.println(s1);
        //  JiaoBao.method(s1);
    }

    @Test
    public void Test11() {
        String sr = "7E 7E\n" +
                "\n" +
                "10\n" +
                "51 06 00 00 01\n" +
                "99 99\n" +
                "2F\n" +
                "\n" +
                "00 08\n" +
                "02\n" +
                "00 01\n" +
                "FF 10\n" +
                "01\n" +
                "19 05 20 09 12\n" +
                "00\n" +
                "04";
        String s = sr.toLowerCase();
        //  XinTiao tiao = XinTiao11.method(s);
        //   int i = sysXinTiaoDao.XinTiaoDao(tiao);
        // System.out.println(i);
    }

    @Test
    public void dada() {
        String str = "123456789";
        String s = str.substring(0, 5);
        System.out.println(s + "----" + str);
    }
}

