package com.springsecurity.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    /***
     The @EnableWebSecurity annotation and WebSecurityConfigurerAdapter work together
     to provide web based security. By extending WebSecurityConfigurerAdapter and only
     a few lines of code we are able to do the following: Require the user to be
     authenticated prior to accessing any URL within our application
     * ***/

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    }
}
