package com.zz.common.util;

import com.zz.pojo.User;
import org.apache.shiro.SecurityUtils;

public class ShiroUtil {

    public static String getUsername() {
        return String.valueOf(getLoginUser().getUsername());
    }

    /**
     * 获取登录用户
     *
     * @return
     */
    public static User getLoginUser() {
        return (User) SecurityUtils.getSubject().getPrincipal();
    }
}
