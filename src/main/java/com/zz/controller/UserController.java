package com.zz.controller;

import com.zz.common.util.ShiroUtil;
import com.zz.common.util.TekonUtil;
import com.zz.common.vo.JsonResult;
import com.zz.common.vo.PageObject;
import com.zz.pojo.SysArea;
import com.zz.pojo.User;
import com.zz.service.UserService;
import com.zz.vo.SysRoleName;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;


@Controller
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {
    public static String S = TekonUtil.getRandomString((int) ((Math.random() + 1) * 62));

    //用户登录
    @ResponseBody
    @RequestMapping(value = "/doLoginUI", method = RequestMethod.GET)
    public JsonResult login(String telephone, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(telephone, password);
        System.out.println("token:" + token);
        subject.login(token);
//        System.out.println("telephone:"+telephone);
//        System.out.println("password:"+password);
//        System.out.println(ShiroUtil.getLoginUser());

        return new JsonResult(ShiroUtil.getLoginUser(), S);
    }


    @Resource
    private UserService userService;

    //查询用户
    @RequestMapping(value = "findUsers/{token}", method = RequestMethod.GET)///
    @ResponseBody
    public JsonResult findUser(String Province, String City, String County, String name, String dengluming, Integer pageCurrent, Integer pageSize, @PathVariable String token) {
        if (token.equals(S)) {
            PageObject<User> user = userService.findUser(Province, City, County, name, dengluming, pageCurrent, pageSize);
            return new JsonResult(user);
        } else {
            return JsonResult.error(500, "token无效");
        }

    }

    //地区二级联动
    @ResponseBody
    @RequestMapping(value = "diqu/{token}", method = RequestMethod.GET)//
    public JsonResult diqu(String name, Integer LVL, @PathVariable String token) {
        if (token.equals(UserController.S)) {
            List<SysArea> list = userService.eara(name, LVL);
            return JsonResult.success(list);
        }
        return JsonResult.error(500, "token无效");
    }

    //添加用户时查询所有角色
    @ResponseBody
    @RequestMapping(value = "findRoles/{token}", method = RequestMethod.GET)
    public JsonResult findRoles(@PathVariable String token) {
        if (token.equals(UserController.S)) {
            List<SysRoleName> name = userService.findRoleName();
            return JsonResult.success(name);
        } else {
            return JsonResult.error(500, "token无效");
        }

    }


    //禁用启用用户
    @ResponseBody
    @RequestMapping(value = "vaildUserById/{token}", method = RequestMethod.POST)
    public JsonResult vaildUserById(Integer id, Integer userstatus, @PathVariable String token) {
        if (token.equals(UserController.S)) {
            int i = userService.statusById(id, userstatus);
            return JsonResult.success("修改成功");
        } else {
            return JsonResult.error(500, "token无效");
        }

    }

    //保存用户
    @ResponseBody
    @RequestMapping(value = "saveUser/{token}", method = RequestMethod.POST)
    public JsonResult saveUser(User entity, Integer roleId, @PathVariable String token) {
        if (token.equals(UserController.S)) {
            if (entity.getId() == null) {
                int i = userService.saveUser(entity, roleId);
                return new JsonResult("添加用户成功");
            } else if (entity.getId() != null) {
                userService.updateUser(entity, roleId);
                return new JsonResult("修改成功");
            }

        } else {
            return JsonResult.error(500, "token无效");
        }
        return JsonResult.success();
    }

}
