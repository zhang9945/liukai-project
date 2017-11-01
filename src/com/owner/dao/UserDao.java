package com.owner.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import com.owner.model.User;

@Component
public interface UserDao {           
	List<User> querryUser(String username, String password);
}
