package com.mybatis.test.shiro.config;

import com.google.common.collect.Maps;
import com.mybatis.test.shiro.realm.UserRealm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.*;

@Configuration
public class ShiroConfig {

    /**
     * 创建ShiroFilterFactoryBean
     */
    @Bean("shiroFilterFactoryBean")
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        /**
         *   shiro内置过滤器，可以实现劝降相关的连接
         *   常用过滤器：
         *   anon:无需认证（登陆） 就可以访问
         *   authc:必须认证才可以访问
         *   user:如果使用rememberMe的功能可以访问
         *   perms:该资源必须得到资源权限才可以访问
         *   role:该资源必须得到角色权限才能访问
         */
        //设置安全管理器
        shiroFilterFactoryBean.setSecurityManager(securityManager);

        Map<String,String> filterMap = Maps.newLinkedHashMap();
        filterMap.put("/login/login","anon");
        filterMap.put("/login/*","authc");
        filterMap.put("/user/*","authc");


        //修改跳转页面
        shiroFilterFactoryBean.setLoginUrl("/login/jumpLogin");

        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
        return  shiroFilterFactoryBean;
    }
    /**
     * 创建 DefaultWebSecurityManage
     * @param userRealm
     * @return
     */
    @Bean("securityManager")
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm") UserRealm userRealm){
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        //关联realm
        securityManager.setRealm(userRealm);
        return securityManager;
    }

    /**
     * c创建Realm
     * @return
     */
    @Bean("userRealm")
    public UserRealm getRealm(){
        return new UserRealm();
    }


}
