package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	Repository res;
	
	@RequestMapping("/store")
	public UserModel store() {
	UserModel usr=new UserModel();
	usr.setId(101);
	usr.setName("ankit");
	usr.setPassword("anubhav");
	res.saveAndFlush(usr);
	return usr;
	}
}
