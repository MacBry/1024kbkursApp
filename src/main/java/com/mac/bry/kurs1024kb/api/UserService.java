package com.mac.bry.kurs1024kb.api;

import java.util.List;

import com.mac.bry.kurs1024kb.entity.User;

public interface UserService {
	
	List<User> getAllUsers();
	
	void addUser(User user);
	
	void deleteUserById(int id);
}
