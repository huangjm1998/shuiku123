package com.zz.common.config.shiro;


import java.util.LinkedHashMap;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.SessionManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringShiroConfig {
    /**
     * 配置过滤器工厂(通过此工厂创建大量过滤器,通过过滤器对请求进行过滤)
     */
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactory(
            @Qualifier("securityManager") SecurityManager securityManager) {
        ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
        bean.setSecurityManager(securityManager);
        //bean.setLoginUrl("/doLoginUI");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("/doLoginUI", "anon");
        map.put("/doLogout", "logout");
        map.put("/**", "anon");//authc
        bean.setFilterChainDefinitionMap(map);        //自定义拦截器
//        Map<String, Filter> customFilterMap = new LinkedHashMap<>();
//        customFilterMap.put("corsAuthenticationFilter", new CORSAuthenticationFilter());
//        bean.setFilters(customFilterMap);
        return bean;
    }


    @Bean
    public SecurityManager securityManager(Realm realm,
                                           SessionManager sessionManager
                                           //CacheManager cacheManager
    ) {
        DefaultWebSecurityManager sManager =
                new DefaultWebSecurityManager();
        sManager.setRealm(realm);
        sManager.setSessionManager(sessionManager);
        // sManager.setCacheManager(cacheManager);
        return sManager;
    }

    //授权管理
    @Bean
    public AuthorizationAttributeSourceAdvisor
    newAuthorizationAttributeSourceAdvisor(
            SecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor advisor =
                new AuthorizationAttributeSourceAdvisor();
        advisor.setSecurityManager(securityManager);
        return advisor;
    }


    // session
    @Bean
    public SessionManager sessionManager() {
        DefaultWebSessionManager sManager =
                new DefaultWebSessionManager();
        sManager.setGlobalSessionTimeout(24 * 60 * 60 * 1000);
        return sManager;
    }

//    //shiro缓存
//    @Bean
//    public CacheManager cacheManager(){
//        return new MemoryConstrainedCacheManager();
//    }

}
