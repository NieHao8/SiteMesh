package com.spring.service;

import java.util.List;

import com.spring.entity.User;

public interface MVCService {
	
	List<User> getAllUser();
	
	User getUserByName(String nsme);

}
