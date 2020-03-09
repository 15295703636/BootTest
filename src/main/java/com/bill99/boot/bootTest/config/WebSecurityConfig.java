package com.bill99.boot.bootTest.config;

import com.bill99.boot.bootTest.service.impl.UserDetailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;

import java.net.Authenticator;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
    @Bean
    UserDetailService userDetailService(){
        return new UserDetailService();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userDetailService());
    }

    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll().and()
                .logout().permitAll();
    }
}
