package com.owner.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.owner.dao.UserDao;
import com.owner.model.User;

@Service
public class UserService {
	
	@Autowired 
	private UserDao userdao;
	
	public void addUser(){
		
	}
	
	public void deleteUser(String id){
		
	}
	
	public void modifyUser(User user){
		
	}
	
	public List<User> queryUser(User user){
		return userdao.querryUser(user.getUsername(),user.getPassword());
	}
}
