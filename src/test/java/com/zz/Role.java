package com.zz;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zz.dao.SysRoleDao;
import com.zz.pojo.SYQ_jurisdiction;
import com.zz.pojo.SYQ_role;
import com.zz.service.SysRoleService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.Resource;
import javax.swing.plaf.PanelUI;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootTest
public class Role {

    @Resource
    private SysRoleService sysRoleService;
    @Resource
    private SysRoleDao sysRoleDao;

    @Test
    public void testRole() {
        List<SYQ_role> roles = sysRoleService.findRoles();
        System.out.println(roles);
    }


    @Test
    public void testSaveRoles() {
        //        sysRoleService.saveObject("管理员",1,{1,2,3});
    }

    @Test
    public void testSecle() {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = format.format(date);
        System.out.println(format1);
    }

    public static void main(String[] args) {
        Role.doJsonPost("http://www.aa.com", "{\"key\":\"value\"}");

    }

    //发送JSON字符串 如果成功则返回成功标识。
    public static String doJsonPost(String urlPath, String Json) {
        System.out.println("Json ----- >>>>" + Json);
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
            conn.setDoInput(true);//读取数据
            conn.setUseCaches(false);
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setRequestProperty("Charset", "UTF-8");
            // 设置文件类型:
            conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // 设置接收类型否则返回415错误
            //conn.setRequestProperty("accept","*/*")此处为暴力方法设置接受所有类型，以此来防范返回415;
            conn.setRequestProperty("accept", "application/json");

            // 往服务器里面发送数据
            if (Json != null && Json.length() > 0) {
                byte[] writebytes = Json.getBytes(StandardCharsets.UTF_8);
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
                r = new InputStreamReader(is, StandardCharsets.UTF_8);
                reader = new BufferedReader(r);
                reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
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

    @Test
    public void testLl() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        SYQ_role role = new SYQ_role();
        role.setName("张三");
        String string = objectMapper.writeValueAsString(role);
        System.out.println(string);
    }

    //SELECT s.id,s.DATAmessage,s2.RSINCD,s2.STCD,s2.ADDR,s2.ATCUNIT,s2.ADDVCD,s2.LGTD,s2.STCD
    //from SYQ_hour s,ST_RSVRFCCH_B s2 where s.TENstation=s2.STCD
    @Scheduled(fixedDelay = 5000)
    @Test
    public void test11() {
        System.out.println("=======>:" + "杨丹玲是个哈皮");
    }
}



