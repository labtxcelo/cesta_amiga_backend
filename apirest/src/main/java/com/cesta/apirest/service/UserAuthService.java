package com.cesta.apirest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cesta.apirest.models.UserAuth;
import com.cesta.apirest.repository.UserAuthRepository;

@Service
public class UserAuthService {

	 @Autowired
	    private UserAuthRepository repository;

	public UserAuth findByEmailAndPassword(UserAuth user) {
		return repository.findByEmailAndPassword(user.getEmail(), user.getPassword());
	} 
	
}
