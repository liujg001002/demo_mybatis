package com.mybatis.test.shiro;

import com.google.common.collect.Lists;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liujianguo
 * @data 2019/4/15
 * 描述：
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginLogoutTest {

    @Test
    public void testShiro(){
        Factory<SecurityManager> factory= new IniSecurityManagerFactory("classpath:shiro/shiro.ini");
        SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        final UsernamePasswordToken token = new UsernamePasswordToken("admin", "111111");
        try {
            //4、登录，即身份验证
            subject.login(token);
            System.out.println("登陆成功");

        } catch (AuthenticationException e) {
            //5、身份验证失败
            System.out.println("验证失败");
        }
        Assert.assertEquals(true, subject.isAuthenticated()); //断言用户已经登录
        //验证角色
        //Assert.assertTrue(subject.hasRole("role2"));
        //验证权限
        Assert.assertTrue(subject.isPermitted("user:login"));
        //6、退出
        subject.logout();
    }
}
