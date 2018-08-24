package com.mac.bry.kurs1024kb.service;

import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.UserService;
import com.mac.bry.kurs1024kb.entity.User;

public class UserServiceImpl implements UserService {

	private List<User> userList;
	
	
	public UserServiceImpl(List<User> userList) {
		super();
		this.userList = userList;
	}

	public UserServiceImpl() {
		userList = new ArrayList<User>();
	}

	public List<User> getAllUsers() {
		return userList;
	}

	public void addUser(User user) {
		userList.add(user);
	}

	public void deleteUserById(int id) {
		for (int i = 0 ; i < userList.size(); i++) {
			User userfromList = userList.get(i);
			if(userfromList.getId() == id) {
				userList.remove(id);
				break;
			}
		}

	}

}
