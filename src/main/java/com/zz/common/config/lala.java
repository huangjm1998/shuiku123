package com.zz.common.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class lala {
    //发送JSON字符串 如果成功则返回成功标识。
    public static String doJsonPost(String urlPath, Object Json) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(Json);
        System.out.println("Json ----- >>>>" + s);
        String result = "";
        HttpURLConnection conn = null;
        InputStream is = null;
        InputStreamReader r = null;
        BufferedReader reader = null;
        OutputStream outwritestream = null;
        try {
            URL url = new URL(urlPath);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setConnectTimeout(30000);
            conn.setReadTimeout(300000);
            conn.setDoOutput(true);//向服务器写数据
            // conn.setDoInput(true);//读取数据
            conn.setUseCaches(false);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            // 设置文件类型:
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // 设置接收类型否则返回415错误
            conn.setRequestProperty("accept", "*/*");//此处为暴力方法设置接受所有类型，以此来防范返回415;
            conn.setRequestProperty("accept", "application/json");

            // 往服务器里面发送数据
            if (s != null && s.length() > 0) {
                byte[] writebytes = s.getBytes(StandardCharsets.UTF_8);
                // 设置文件长度
                conn.setRequestProperty("Content-Length", String.valueOf(writebytes.length));
                outwritestream = conn.getOutputStream();
                outwritestream.write(writebytes);
                outwritestream.flush();
                outwritestream.close();
            }
            conn.connect();
            if (conn.getResponseCode() == 200) {
                is = conn.getInputStream();
                r = new InputStreamReader(is);
                reader = new BufferedReader(r);
//                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                result = reader.readLine();
                System.out.println(result);
            }
            System.out.println("conn.getResponseCode() ---->>>>" + conn.getResponseCode());
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    outwritestream.close();
                    is.close();
                    r.close();
                    reader.close();
                    conn.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }

}
