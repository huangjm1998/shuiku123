package com.zz.common.util;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageOutputStream;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class potoUtil {
    public static byte[] fromHexString(String s) {
        int length = s.length() / 2;
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            bytes[i] = (byte) ((Character.digit(s.charAt(i * 2), 16) << 4) | Character
                    .digit(s.charAt((i * 2) + 1), 16));
        }
        return bytes;
    }

    public static void byte2image(byte[] data, String path) {
        if (data.length < 3 || path.equals("")) return;
        try {
            FileImageOutputStream imageOutput = new FileImageOutputStream(new File(path));
            imageOutput.write(data, 0, data.length);
            imageOutput.close();
            System.out.println("Make Picture success,Please find image in " + path);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
            ex.printStackTrace();
        }
    }

    //图片大小
    public static double potoSize(String path) throws IOException {
        File picture = new File(path);
        BufferedImage sourceImg = ImageIO.read(new FileInputStream(picture));
        String s = String.format("%.1f", picture.length() / 1024.0);
        double v = Double.parseDouble(s);
        return v;
    }

}
