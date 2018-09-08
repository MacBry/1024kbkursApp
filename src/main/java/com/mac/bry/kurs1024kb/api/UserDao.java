package com.mac.bry.kurs1024kb.api;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import com.mac.bry.kurs1024kb.entity.User;

public interface UserDao {
	
	public void saveUser(User user) throws IOException;
	
	public void saveUsers(List<User> users) throws FileNotFoundException;
	
	public List<User> getAllUsers() throws FileNotFoundException, IOException;
	
	public User getUserByLogin(String login) throws IOException;
	
	public User getUserById(int userId) throws IOException;
	
	public void removeUserByLogin(String login) throws IOException;
	
	public void removeUserById(int id) throws IOException;
	
	public boolean isUserByLoginExist (String login) throws IOException;
	
}
