package com.mac.bry.kurs1024kb.validators;

import java.io.IOException;

import com.mac.bry.kurs1024kb.dao.UserDaoImpl;
import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.exception.UserLoginAlreadyExistException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthLoginException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthPasswordException;

public class UserValidatorImpl {

	private final int MIN_LOGIN_LENGTH = 4;
	private final int MIN_PASSWORD_LENGTH = 6;
	
	private static UserValidatorImpl instance = null;
	private UserDaoImpl userDaoImpl = UserDaoImpl.getInstance();
	
	private UserValidatorImpl()  {
		
	}
	
	public static UserValidatorImpl getInstance()  {
		if(instance == null) {
			return new UserValidatorImpl();
		}
		return instance;
	}
	
	public boolean isValidate(User user) throws UserLoginAlreadyExistException, UserShortLengthLoginException, UserShortLengthPasswordException {
		if(isUserLoginExist(user.getLogin()))
			throw new UserLoginAlreadyExistException("User login already exist");
		if(isUserLoginLengthIsGreaterThenThree(user.getLogin()))
			throw new UserShortLengthLoginException("Login is to short");
		if(isUserPasswordLengthIsGreaterThenSix(user.getPassword()))
			throw new UserShortLengthPasswordException("Password is to short");
		return true;
	}
	
	private boolean isUserLoginLengthIsGreaterThenThree(String login) {
		return login.length() >= MIN_LOGIN_LENGTH;
	}
	
	private boolean isUserPasswordLengthIsGreaterThenSix(String password) {
		return password.length() >= MIN_PASSWORD_LENGTH;
	}
	
	private boolean isUserLoginExist(String login) {
		try {
			return userDaoImpl.isUserByLoginExist(login);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	
	
	
}
