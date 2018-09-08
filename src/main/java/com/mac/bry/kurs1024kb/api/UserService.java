package com.mac.bry.kurs1024kb.api;

import java.io.IOException;
import java.util.List;

import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.exception.UserLoginAlreadyExistException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthLoginException;
import com.mac.bry.kurs1024kb.exception.UserShortLengthPasswordException;

public interface UserService {
	
	List<User> getAllUsers() throws IOException;
	
	void addUser(User user) throws IOException, UserLoginAlreadyExistException, UserShortLengthLoginException, UserShortLengthPasswordException;
	
	void deleteUserById(int id) throws IOException;
}
