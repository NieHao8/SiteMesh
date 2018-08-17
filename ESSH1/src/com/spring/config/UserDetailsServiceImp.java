package com.spring.config;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.service.MVCService;


@Service
public class UserDetailsServiceImp implements UserDetailsService {
	
	@Autowired
	private MVCService service;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user=service.getUserByName(userName);
		System.out.println(user);
		
		/*System.out.println("username"+userName);
		User user=new User();
		List<String> s=new ArrayList<String>();
		s.add("ROLE_ADMIN");
		s.add("ROLE_USER");
		user.setRole(new HashSet(s));
		user.setId((long) 12);
		user.setUserName("gary");
		user.setUserPassword("321");*/
	/*List<Role> role=service.findRoleByUser(userName);
		for(Role r:role) {
			System.out.println(r.getName());
		}
			User user = service.findUserByName(userName);
		*/
		return user;
	}

}
