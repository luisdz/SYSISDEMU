/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isdemu.service.impl;

import com.isdemu.model.TbsRol;
import com.isdemu.model.TbsUsuario;
import com.isdemu.service.TBS_Usuario_Service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Eduardo
 */
@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired private TBS_Usuario_Service userService;
    
    public UserDetails loadUserByUsername(String ssoId)
			throws UsernameNotFoundException {
		TbsUsuario user = (TbsUsuario) userService.findByKey(1);
		System.out.println("User : "+user);
		if(user==null){
			System.out.println("User not found");
			throw new UsernameNotFoundException("Username not found");
		}
			return new org.springframework.security.core.userdetails.User("user1","123456", 
				 true, true, true, true,getGrantedAuthorities(user));
	}
    
    private List<GrantedAuthority> getGrantedAuthorities(TbsUsuario user){
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		
			
			authorities.add(new SimpleGrantedAuthority("ROLE_"));
		
		System.out.print("authorities :"+authorities);
		return authorities;
	}
    
    
}
