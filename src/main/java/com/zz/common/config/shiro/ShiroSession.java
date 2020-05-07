package com.zz.common.config.shiro;

import org.apache.shiro.web.servlet.ShiroHttpServletRequest;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.util.StringUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.Serializable;


public class ShiroSession extends DefaultWebSessionManager {
//    /**
//     * 定义的请求头中使用的标记key，用来传递 token
//     */
//    private static final String AUTH_TOKEN = "authToken";
//
//    private static final String REFERENCED_SESSION_ID_SOURCE = "Stateless request";
//    public ShiroSession() {
//        super();
//        //设置 shiro session 失效时间，默认为30分钟，这里现在设置为15分钟
//        //setGlobalSessionTimeout(MILLIS_PER_MINUTE * 15);
//    }
//    @Override
//    protected Serializable getSessionId(ServletRequest request, ServletResponse response) {
//        //获取请求头中的 AUTH_TOKEN 的值，如果请求头中有 AUTH_TOKEN 则其值为sessionId。shiro就是通过sessionId 来控制的
//        String sessionId = WebUtils.toHttp(request).getHeader(AUTH_TOKEN);
//        if (StringUtils.isEmpty(sessionId)){
//            //如果没有携带id参数则按照父类的方式在cookie进行获取sessionId
//            return super.getSessionId(request, response);
//
//        } else {
//            //请求头中如果有 authToken, 则其值为sessionId
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_SOURCE, REFERENCED_SESSION_ID_SOURCE);
//            //sessionId
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID, sessionId);
//            request.setAttribute(ShiroHttpServletRequest.REFERENCED_SESSION_ID_IS_VALID, Boolean.TRUE);
//            return sessionId;
//        }
//    }


}
