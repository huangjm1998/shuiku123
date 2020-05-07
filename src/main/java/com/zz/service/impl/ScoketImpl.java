package com.zz.service.impl;

import com.zz.common.config.jiexi.XinTiaoBao;
import com.zz.common.util.ResolvingUtils;
import com.zz.common.util.SpringUtil;
import com.zz.dao.DataDao;
import com.zz.pojo.SYQ_heartbeat;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

@Component
@Configuration
@Service
public class ScoketImpl extends ChannelInboundHandlerAdapter {


    @Resource
    private DataDao dataDao;


    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println(ctx.channel().localAddress().toString() + " 通道已注册！");
    }


    public void channelInactive(ChannelHandlerContext ctx) {
        System.out.println(ctx.channel().localAddress().toString() + " 通道已断开！！！");


    }


    public static String getMessage(ByteBuf buf) {

        byte[] con = new byte[buf.readableBytes()];

        ByteBuf readBytes = buf.readBytes(con);

        //  System.out.println(readBytes);
        String s1 = ByteBufUtil.hexDump(con);
        byte[] bytes = s1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i] + "...");
        }
        System.out.println();
        return s1;

    }


    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws UnsupportedEncodingException, ParseException {
        // 接收字符串时的处理
        ByteBuf buf = (ByteBuf) msg;
        String rev = getMessage(buf);
        String s = URLEncoder.encode(rev, "gbk");
        String s1 = s.toLowerCase();


        //  System.out.println(s1);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.CHINA);
        DateFormat df7 = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.CHINA);
        String date3 = df3.format(new Date());
        String time3 = df7.format(new Date());

        Date date = new Date();


        System.out.println("客户端收到服务器数据:" + s1 + "---时间：" + date3 + " " + time3);

        String substring = s1.substring(20, 22);
        System.out.println(substring);
        if (substring.equals("2f")) {
            //解析报文
            System.out.println("这是心跳报");
            SYQ_heartbeat method = XinTiaoBao.method(s1);
            int i = dataDao.xinTiaoBao(method);
            System.out.println(i);
        } else if (substring.equals("30")) {
            System.out.println("这是测试报");
            //  TestMessage.method(s1);
        } else if (substring.equals("34")) {
            System.out.println("这是小时时报！");
            //   timingMessage.method(s1);
        } else if (substring.equals("33")) {
            System.out.println(s1.length() + "加报");
            System.out.println("这是加报！");
            //     JiaoBao.method(s1);
        }
    }


    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        System.out.println("服务端接收数据完毕..");
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        ctx.close();
        System.out.println("异常信息：\r\n" + cause.getMessage());
    }


}