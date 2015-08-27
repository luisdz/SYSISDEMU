/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author Jose Eduardo
 */
@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{
    
    @Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	  auth.inMemoryAuthentication().withUser("tom").password("123456").roles("USER");
	  auth.inMemoryAuthentication().withUser("bill").password("123456").roles("ADMIN");
	  auth.inMemoryAuthentication().withUser("james").password("123456").roles("SUPERADMIN");
	}
 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
 
	  http.authorizeRequests()
                
		.antMatchers("/protected/**").access("hasRole('ROLE_ADMIN')")
               // .antMatchers("/Inventario/**").access("hasRole('ROLE_SUPERADMIN')")
		.antMatchers("/confidential/**").access("hasRole('ROLE_SUPERADMIN')")
		.and().formLogin()
                .loginProcessingUrl("/j_spring_security_check")
                
                .loginPage("/login").failureUrl("/login?error")
                .defaultSuccessUrl("/index")
               .usernameParameter("username").passwordParameter("password")
               .and()
                 .logout().logoutSuccessUrl("/login?logout") 
              .and().csrf().disable()
                  ;
                        
          
 
	}
    
}
