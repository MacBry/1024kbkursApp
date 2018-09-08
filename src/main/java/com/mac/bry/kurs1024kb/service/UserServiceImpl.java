package com.mac.bry.kurs1024kb.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.UserService;
import com.mac.bry.kurs1024kb.dao.UserDaoImpl;
import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.exception.UserLoginAlreadyExistException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthLoginException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthPasswordException;
import com.mac.bry.kurs1024kb.validators.UserValidatorImpl;

public class UserServiceImpl implements UserService {

	private static UserServiceImpl instance = null;
	private UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
	private UserValidatorImpl userValidatorImpl = UserValidatorImpl.getInstance();
	
	public static UserServiceImpl getInstance ( ) {
		if (instance == null) {
			instance = new UserServiceImpl();
		}
		return instance;
	}
	
	private UserServiceImpl() {
	}


	public List<User> getAllUsers() throws IOException {
		return userDaoImpl.getAllUsers();
	}

	public void addUser(User user) throws IOException, UserLoginAlreadyExistException, UserShortLengthLoginException, UserShortLengthPasswordException {
		if(userValidatorImpl.isValidate(user)) {
			userDaoImpl.saveUser(user);
		}
	}

	public void deleteUserById(int id) throws IOException {
		userDaoImpl.removeUserById(id);

	}

}
