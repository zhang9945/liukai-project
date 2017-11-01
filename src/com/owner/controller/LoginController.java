package com.owner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.owner.model.User;
import com.owner.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userservice;
	
	@RequestMapping("login")
	public void login(User user){
		
		List<User> exitUser = userservice.queryUser(user);
				
		
	}

}
