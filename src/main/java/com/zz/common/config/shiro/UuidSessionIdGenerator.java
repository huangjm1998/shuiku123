package com.zz.common.config.shiro;

import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.session.mgt.eis.SessionIdGenerator;

import java.io.Serializable;

public class UuidSessionIdGenerator implements SessionIdGenerator {

    @Override
    public Serializable generateId(Session session) {
//        Serializable uuid = new JavaUuidSessionIdGenerator().generateId(session);
//        System.out.println("生成的sessionid是："+uuid);
//        return uuid;
        return null;
    }

}