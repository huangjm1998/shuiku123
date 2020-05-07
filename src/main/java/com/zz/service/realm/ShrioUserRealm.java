package com.zz.service.realm;


import com.zz.common.exception.ServiceException;
import com.zz.dao.SysMenuDao;
import com.zz.dao.SysRoleMenuDao;
import com.zz.dao.SysUserRoleDao;
import com.zz.dao.UserDao;
import com.zz.pojo.User;
import com.zz.vo.MenuId;
import com.zz.vo.Menus;
import com.zz.vo.RoleId;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ShrioUserRealm extends AuthorizingRealm {

    @Resource
    private UserDao userDao;

    @Resource
    private SysUserRoleDao sysUserRoleDao;
    @Resource
    private SysRoleMenuDao sysRoleMenuDao;
    @Resource
    private SysMenuDao sysMenuDao;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection p) {
        //获取用户登录得id
        User user = (User) p.getPrimaryPrincipal();
        Integer userId = user.getId();
        //基于用户id查角色id
        RoleId id = sysUserRoleDao.findRoleIdByUserId(userId);
        if (id == null)
            throw new AuthorizationException();
        //基于角色id查询菜单id
        List<MenuId> menuIds = sysRoleMenuDao.findMenuIdByRoleId(id);
        if (menuIds == null || menuIds.size() == 0)
            throw new AuthorizationException();
        //基于菜单ids查菜单标识
        Integer[] array = {};
        List<String> premissions = sysMenuDao.findPremissions(menuIds.toArray(array));
        System.out.println("premissions" + premissions);
        Set<String> set = new HashSet<>();
        for (String per : premissions) {
            if (!StringUtils.isEmpty(per)) {
                set.add(per);
            }
        }
        SimpleAuthorizationInfo info =
                new SimpleAuthorizationInfo();
        info.setStringPermissions(set);
        return info;//返回给授权管理器

    }


    //由shiro认证管理器进行认证登录
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //获取用户名（用户页面输入）
        UsernamePasswordToken token1 = (UsernamePasswordToken) token;
        String telephone = token1.getUsername();
        int findtelephone = userDao.findtelephone(telephone);
        if (findtelephone > 2)
            throw new ServiceException("服务器错误,系统存在相同的用户");
        //用户名查询用户信息
        User user = userDao.findUserByUserName(telephone);
        if (user == null)
            throw new UnknownAccountException();
        //基于角色名查询权限信息
        String name = user.getName();
        List<Menus> menu = userDao.findMenuByUserName(name);
        for (Menus s :
                menu) {
            System.out.println(s);
        }
        user.setMenu(menu);
        if (user.getUserstatus() == 0)
            throw new LockedAccountException("用户已被禁用");
        if (user.getStatus() == 0)
            throw new IncorrectCredentialsException("该角色被禁用");
        //封装用户信息
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, user.getPassword(), getName());
        return info;


    }
}
