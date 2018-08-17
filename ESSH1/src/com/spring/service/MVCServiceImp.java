package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.UserMapper;
import com.spring.entity.User;

@Service
public class MVCServiceImp implements MVCService {
	
	@Autowired
	private UserMapper userdao;
	
	public List<User> getAllUser(){
		return userdao.selectAll();
	}

	@Override
	public User getUserByName(String name) {
		
		return userdao.getUserById(name);
	}

}
