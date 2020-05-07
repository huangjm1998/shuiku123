package com.zz.common.web;

import com.zz.common.exception.ServiceException;
import com.zz.common.vo.JsonResult;
import org.apache.shiro.ShiroException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.io.SerializationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ServerErrorException;

import java.rmi.ServerException;

//全局异常处理类
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public JsonResult doHandlerRuntimeException(RuntimeException e) {
        e.printStackTrace();
        return new JsonResult(e);
    }

    @ExceptionHandler(ShiroException.class)
    @ResponseBody
    public JsonResult doHandleShiroException(
            ShiroException e) {
        JsonResult r = new JsonResult();
        r.setResult(500);
        if (e instanceof UnknownAccountException) {
            r.setMsg("账户不存在");
        } else if (e instanceof IncorrectCredentialsException) {
            r.setMsg("密码不正确");
        } else if (e instanceof AuthorizationException) {
            r.setMsg("没有此操作权限");
        } else if (e instanceof LockedAccountException) {
            r.setMsg("用户已被禁用");
        } else if (e instanceof IncorrectCredentialsException) {
            r.setMsg("该角色被禁用");
        } else {
            r.setMsg("系统维护中");
        }
        e.printStackTrace();
        return r;
    }
}
