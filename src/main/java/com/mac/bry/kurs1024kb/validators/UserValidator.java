package com.mac.bry.kurs1024kb.validators;

import javax.management.InstanceAlreadyExistsException;

import com.mac.bry.kurs1024kb.entity.User;

public class UserValidator {

	private static UserValidator instance = null;
	
	private UserValidator() {
		
	}
	
	public static UserValidator getInstance() {
		if(instance == null) {
			return new UserValidator();
		}
		return instance;
	}
	
	public boolean isValidate(User user) {
		return false;
	}
	
	
}
