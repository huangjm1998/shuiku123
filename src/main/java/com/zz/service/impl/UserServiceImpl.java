package com.zz.service.impl;

import com.zz.common.exception.ServiceException;
import com.zz.common.vo.PageObject;
import com.zz.dao.SysUserRoleDao;
import com.zz.dao.UserDao;
import com.zz.pojo.SysArea;
import com.zz.pojo.User;
import com.zz.service.UserService;
import com.zz.vo.SysRoleName;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private SysUserRoleDao sysUserRoleDao;

    @Override
    @CacheEvict(value = "finduser", allEntries = true)
    @RequiresPermissions("SYS:USER")
    public int statusById(Integer id, Integer userstatus) {
        if (id < 0 || id == null)
            throw new ServiceException("请选择合法用户！");
        if (userstatus != 0 && userstatus != 1)
            throw new ServiceException("参数不合法");
        int i = userDao.vaildUserById(id, userstatus);
        if (i == 0)
            throw new ServiceException("用户能不存在");
        return i;
    }

    //查询用户
    @Cacheable(cacheNames = "finduser")
    @Override
    @RequiresPermissions("SYS:USER")
    public PageObject<User> findUser(String Province, String City, String County, String name, String dengluming, Integer pageCurrent, Integer pageSize) {
        if (pageCurrent == null || pageCurrent < 1)
            throw new ServiceException("页码值无效");
        if (pageSize == null || pageSize == 0) {
            pageSize = 15;
        }
        int size = userDao.findUserSize(Province, City, County, name, dengluming);
        List<User> users = userDao.findUsers(Province, City, County, name, dengluming, pageCurrent, pageSize);
        PageObject<User> pageObject = new PageObject<>();
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setRecords(users);
        pageObject.setPageSize(pageSize);
        pageObject.setPageCurrent(pageCurrent);
        pageObject.setRowCount(size);
        pageObject.setPageCount((size - 1) / pageSize + 1);
        return pageObject;
    }

    @Override
    public List<SysArea> eara(String name, Integer LVL) {
        return userDao.area(name, LVL);
    }


    //添加用户时查询所有角色
    @Override
    public List<SysRoleName> findRoleName() {
        List<SysRoleName> names = userDao.findRoles();
        if (names == null)
            throw new ServiceException("系统中暂时没有角色");
        return names;
    }

    //添加用户
    @CacheEvict(value = "finduser", allEntries = true)
    @Override
    @RequiresPermissions("SYS:USER")
    public int saveUser(User entity, Integer roleId) {
        int findtelephone = userDao.findtelephone(entity.getTelephone());
        if (findtelephone > 0)
            throw new ServiceException("此电话已存在");
        if (entity == null)
            throw new ServiceException("用户信息不能为空");
        if (entity.getUsername() == null || entity.getUsername() == "")
            throw new ServiceException("用户名不能为空");
        if (entity.getDengluming() == null || entity.getDengluming() == "")
            throw new ServiceException("登录名不能为空");
        if (entity.getUserstatus() == null || entity.getUserstatus() > 1)
            throw new ServiceException("必须选择用户状态");
        if ((entity.getCity() == null || entity.getCity() == "") || (entity.getCounty() == null || entity.getCounty() == "") ||
                (entity.getProvince() == null || entity.getProvince() == ""))
            throw new ServiceException("请按要求填写地址");
        if (entity.getDengluming() == null || entity.getDengluming() == "")
            throw new ServiceException("请填写登录名");
        if (roleId == null || roleId == 0)
            throw new ServiceException("必须为用户分配角色");
        if (entity.getPassword() == null || entity.getPassword() == "")
            throw new ServiceException("请填写密码");
        if (entity.getUserstatus() == null || entity.getUserstatus() == 0) {
            entity.setStatus(1);
        }
        //保存用户自身信息
        int i = userDao.saveUser(entity);
        System.out.println("用户id" + entity.getId());
        int i1 = userDao.saveUserRole(entity.getId(), roleId);
        return i;
    }

    @CacheEvict(value = "finduser", allEntries = true)
    @Override
    public int updateUser(User entity, Integer roleId) {
        System.out.println(entity.toString());
        int i2 = userDao.findtelephone(entity.getTelephone());
        if (i2 > 1)
            throw new ServiceException("电话号码已存在");
        if (entity.getUsername() == null || entity.getUsername() == "")
            throw new ServiceException("用户名不能为空");
        if (entity.getUserstatus() == null)
            throw new ServiceException("必须选择用户状态");
        if ((entity.getCity() == null || entity.getCity() == "") || (entity.getCounty() == null || entity.getCounty() == "") ||
                (entity.getProvince() == null || entity.getProvince() == ""))
            throw new ServiceException("请按要求填写地址");
        if (entity.getDengluming() == null || entity.getDengluming() == "")
            throw new ServiceException("填写登录名");
        if (roleId == null || roleId == 0)
            throw new ServiceException("请必须为用户分配角色");
        if (entity.getPassword() == "")
            throw new ServiceException("请填写密码");
        int i = sysUserRoleDao.deleteUserAndRoles(entity.getId());
        int i1 = userDao.updateUser(entity);
        int i3 = userDao.saveUserRole(entity.getId(), roleId);
        System.out.println("i3=" + i3);
        return i1;
    }


}
