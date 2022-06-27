/*
package com.learn.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class MyWebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder(){
        //NoOpPasswordEncoder不对密码进行加密
        */
/**其他加密形式
         *
         *//*

        System.out.println(new BCryptPasswordEncoder(10).encode("123"));
        return new BCryptPasswordEncoder(10);
    }
    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder)throws Exception{
        authenticationManagerBuilder.inMemoryAuthentication()
                .withUser("admin").password("$2a$10$..ref2.KB3PWYJ9C4Q.v8.R3ftW95o53tUZDdDGnrl.JRlIgWpfvS").roles("ADMIN","USER")
                .and()
                .withUser("sang").password("$2a$10$w.cdZJDxn2mh4fseSJn0duPn0MbmyZKZtidmqiS2lcRj9vp2BNSAi").roles("USER")
                .and()
                .withUser("root").password("$2a$10$iiT3qD5I.TAjZvS/jaS5re1dhtDMjelmVeJIktM.4267o0pyE1zPW").roles("ADMIN","DBA")
        ;
    }
    @Override
    protected void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.authorizeRequests()
                */
/** 表示用户访问admin/**模式的URL，必须用ADMIN的角色
                * *//*

                .antMatchers("/admin/**")
                .hasRole("ADMIN")
                */
/** 表示用户访问/user/**模式的URL，必须用ADMIN的角色或USER角色
                 * *//*

                .antMatchers("/user/**")
                .access("hasAnyRole('ADMIN','USER')")
                */
/** 表示用户访问/db/**模式的URL，必须用ADMIN的角色和DBA角色
                 * *//*

                .antMatchers("/db/**")
                .access("hasRole('ADMIN') && hasRole('DBA')")
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .permitAll()
                .and()
                //跨站请求伪造
                */
/**攻击者通过伪造用户的浏览器的请求，向访问一个用户自己曾经认
                 * 证访问过的网站发送出去，使目标网站接收并误以为是用户的真实操作而去执行命令。
                 * 常用于盗取账号、转账、发送虚假消息等。
                 * 攻击者利用网站对请求的验证漏洞而实现这样的攻击行为，
                 * 本质上问题在于网站能够确认请求来源于用户的浏览器，却不能验证请
                 * 求是否源于用户的真实意愿下的操作行为。
                 * *//*

                //cookie跨域保护
                .csrf()
                .disable();
                */
/** 授权请求，任意请求，全部授权允许，登出全部允许，跨站访问全部允许
                 *  http.authorizeRequests().anyRequest()
                 *  .permitAll().and().logout()
                 *  .permitAll().and().csrf().disable();
                 *
                 *
                 *  .csrf().ignoringAntMatchers("XXXX")
                 *  .csrfTokenRepository(CookieCsrfTokenRepository
                 *  .withHttpOnlyFalse()).and()
                 *//*

    }
}
*/
