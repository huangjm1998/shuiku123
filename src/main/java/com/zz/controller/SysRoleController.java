package com.zz.controller;


import com.zz.common.vo.JsonResult;
import com.zz.pojo.SYQ_role;
import com.zz.service.SysRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/API/")
@RestController
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    //查询角色
    @RequestMapping(value = "selectRole/{token}", method = RequestMethod.POST)
    public JsonResult selectRole(@PathVariable String token) {
        if ((UserController.S).equals(token)) {
            List<SYQ_role> roles = sysRoleService.findRoles();
            return JsonResult.success(roles);
        } else {
            return JsonResult.error(500, "token无效");
        }
    }

    //角色禁用操作
    @RequestMapping(value = "updateStatus/{token}", method = RequestMethod.POST)
    public JsonResult updateStatus(Integer id, Integer status, @PathVariable String token) {
        if ((UserController.S).equals(token)) {
            sysRoleService.vaildById(id, status);
            return new JsonResult("修改成功");
        } else {
            return JsonResult.error(500, "token无效");
        }


    }

    //添加角色
    @RequestMapping(value = "saveRole/{token}", method = RequestMethod.POST)
    public JsonResult saveRole(SYQ_role entity, Integer[] jurisdictionIds, @PathVariable String token) {
        if ((UserController.S).equals(token)) {
            if (entity.getId() == null) {
                sysRoleService.saveObject(entity, jurisdictionIds);
                return new JsonResult("保存成功");
            } else if (entity.getId() != null) {
                sysRoleService.updateObject(entity, jurisdictionIds);
                return new JsonResult("修改成功");
            }
        } else {
            return JsonResult.error(500, "token无效");
        }
        return JsonResult.success();
    }


    //修改角色页面回显
    @RequestMapping(value = "xiugaihuixian/{token}", method = RequestMethod.POST)
    public JsonResult doFindObjectById(Integer id, @PathVariable String token) {
        if ((UserController.S).equals(token)) {
            return new JsonResult(sysRoleService.findObjectById(id));
        } else {
            return JsonResult.error(500, "token");
        }

    }
//
//    //修改角色
//    @RequestMapping(value = "updateRole/{token}",method = RequestMethod.POST)
//    public JsonResult doUpdateObject(SYQ_role entity,
//                                     Integer[] jurisdictionIds,
//                                     @PathVariable String token) {
//    if ((UserController.S).equals(token)){
//        System.out.println(jurisdictionIds.length+"id"+jurisdictionIds);
//        sysRoleService.updateObject(entity, jurisdictionIds);
//        return new JsonResult("修改成功");
//    }else{
//        return JsonResult.error(500,"token");
//    }
//    }
}