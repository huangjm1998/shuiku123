package com.zz.service.impl;

import com.fasterxml.jackson.core.JsonToken;
import com.zz.common.exception.ServiceException;
import com.zz.dao.SysRoleDao;
import com.zz.dao.SysRoleMenuDao;
import com.zz.pojo.SYQ_jurisdiction;
import com.zz.pojo.SYQ_role;
import com.zz.pojo.SysRoleMenuVo;
import com.zz.service.SysRoleService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.sql.rowset.serial.SerialException;
import javax.validation.constraints.Null;
import java.util.List;

@Service
@RequiresPermissions("ROLE:QUANXIAN")
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleDao sysRoleDao;
    @Resource
    private SysRoleMenuDao sysRoleMenuDao;


    //查询角色
    @Cacheable(value = "roleCache")
    @Override
    public List<SYQ_role> findRoles() {
        List<SYQ_role> roles = sysRoleDao.findRoles();

        for (SYQ_role S :
                roles) {
            if (S.getMenu() != null) {
                System.out.println(S);
                String[] split = S.getMenu().split(",");
                for (int i = 0; i < split.length; i++) {
                    System.out.println(split[i]);
                    S.setMenus(split);
                }
            }
        }
        return roles;
    }

    @CacheEvict(value = "roleCache", allEntries = true)
    @Override
    public int vaildById(Integer id, Integer status) {
        if (id == null || id <= 0)
            throw new ServiceException("选中用户不合法");
        if (status != 0 && status != 1)
            throw new ServiceException("参数不合法");
        int i = sysRoleDao.updateRole(id, status);
        return i;
    }

    @CacheEvict(value = "roleCache", allEntries = true)
    @Override
    public int saveObject(SYQ_role entity, Integer[] jurisdictionIds) {
        if (entity == null)
            throw new ServiceException("保存对象不能为空");
        if (entity.getName() == "")
            throw new ServiceException("保存角色名不能为空");
        int i2 = sysRoleDao.selectRole(entity.getName());
        if (i2 > 0)
            throw new ServiceException("此角色已经存在");
        if (jurisdictionIds == null || jurisdictionIds.length == 0)
            throw new ServiceException("必须为角色分配权限");
        if (entity.getStatus() == 0) {
            entity.setStatus(1);
        }

        //保存角色自身数据
        int i = sysRoleDao.insertRole(entity);
        System.out.println(entity.getId());
        //保存角色和权限
        int i1 = sysRoleMenuDao.insertObjects(entity.getId(), jurisdictionIds);
        return i;

        //return 0;
    }


    @CacheEvict(value = "roleCache", allEntries = true)
    @Override
    public SysRoleMenuVo findObjectById(Integer id) {
        if (id == null || id <= 0)
            throw new ServiceException("选中用户不合法");
        SYQ_role roleById = sysRoleDao.findRoleById(id);
        if (roleById == null)
            throw new ServiceException("此记录已经不存在");
        String[] menu = sysRoleDao.findMenu(id);

        SysRoleMenuVo vo = new SysRoleMenuVo();
        vo.setId(roleById.getId());
        vo.setName(roleById.getName());
        vo.setMenu(menu);
        for (String e :
                menu) {
            System.out.println(e);

        }
        // vo.setMenu(menu);
        vo.setStatus(roleById.getStatus());
        System.out.println(menu);
        if (vo.getId() == null || vo.getName() == null)
            throw new ServiceException("此记录已经不存在");
        return vo;
        // return null;
    }

    @CacheEvict(value = "roleCache", allEntries = true)
    @Override
    public int updateObject(SYQ_role entity, Integer[] jurisdictionIds) {
        //1.合法性验证
        if (entity == null)
            throw new ServiceException("更新的对象不能为空");
        if (entity.getId() == null)
            throw new ServiceException("id的值不能为空");

        if (StringUtils.isEmpty(entity.getName()))
            throw new ServiceException("角色名不能为空");
        if (jurisdictionIds == null || jurisdictionIds.length == 0)
            throw new ServiceException("必须为角色指定一个权限");

        //2.更新数据
        int rows = sysRoleDao.updateRoles(entity);
        if (rows == 0)
            throw new ServiceException("对象可能已经不存在");
        //  sysRoleMenuDao.deleteObjectsByRoleId(entity.getId());
        sysRoleMenuDao.deleteById(entity.getId());
        sysRoleMenuDao.insertObjects(entity.getId(), jurisdictionIds);
        //3.返回结果
        return rows;
    }
}
