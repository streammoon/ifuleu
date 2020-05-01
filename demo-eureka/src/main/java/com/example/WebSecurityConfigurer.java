package com.example;

import org.springframework.boot.autoconfigure.security.servlet.WebSecurityEnablerConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 在默认的情况下，spring security是启用csrf 拦截功能的，这会造成，在跨域的情况下，
 * post方式提交的请求都会被拦截无法被处理（包括合理的post请求），前端发起的post请求后端无法正常 处理，
 * 虽然保证了跨域的安全性，但影响了正常的使用，如果关闭csrf防护功能，虽然可以正常处理post请求，
 * 但是无法防范通过劫持session id的非法的post请求，所以spring security为了正确的区别合法的post请求，
 * 采用了token的机制 。
 * spring Security 3默认关闭csrf，Spring Security 4默认启动了csrf
 *
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //关闭csrf
        http.csrf().disable();
        //开启认证：URL格式登录必须是httpBasic
        http.authorizeRequests().anyRequest().authenticated().and().httpBasic();
    }
}
