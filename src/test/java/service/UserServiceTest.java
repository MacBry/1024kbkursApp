package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.service.UserServiceImpl;

public class UserServiceTest {
	
	@Test
	public void testGetAllUsers() {
		//is
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "admin", "admin"));
		users.add(new User(2, "adm", "adm"));
		
		//then
		UserServiceImpl userServiceImpl = new UserServiceImpl(users);
		List<User> usersFromTestClass = userServiceImpl.getAllUsers();
		
		//expected
		Assert.assertEquals(users, usersFromTestClass);
	}
	
	@Test
	public void testAddUser() {
		List<User> users = new ArrayList<User>();
		User user = new User(12, "ADMIN", "ADMIN");
		users.add(user);
		UserServiceImpl userServiceImpl = new UserServiceImpl();
		userServiceImpl.addUser(user);
		List <User> usersFromTestClass = 
		Assert.
	}
}
