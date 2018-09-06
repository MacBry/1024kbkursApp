package com.mac.bry.kurs1024kb.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.mac.bry.kurs1024kb.api.UserDao;
import com.mac.bry.kurs1024kb.entity.User;
import com.mac.bry.kurs1024kb.entity.parser.UserParser;
import com.mac.bry.kurs1024kb.utils.FileUtils;

public class UserDaoImpl implements UserDao {

	private String fileName;
	
	
	public UserDaoImpl(String fileName) throws IOException {
		super();
		this.fileName = fileName;
		FileUtils.createNewFile(fileName);
	}

	@Override
	public void saveUser(User user) throws IOException {
		List<User> userList = new ArrayList<User>();
		userList = getAllUsers();
		userList.add(user);
		saveUsers(userList);
	}

	@Override
	public void saveUsers(List<User> users) throws FileNotFoundException {
		FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
		PrintWriter printWriter = new PrintWriter(fileOutputStream);
		for(User us : users) {
			printWriter.println(us.toString());
		}
		printWriter.close();
	}

	@Override
	public List<User> getAllUsers() throws IOException {
		List <User> listOfUsers = new ArrayList<User>();
		BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
		String readLine = bufferedReader.readLine();

		while(readLine != null) {
			User user = UserParser.stringToUser(readLine);
			if(user != null) {
				listOfUsers.add(user);
			}
			readLine = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		return listOfUsers;
	}

	@Override
	public User getUserByLogin(String login) throws IOException {
		List<User> userList = getAllUsers();
		for(User us : userList) {
			boolean isFoundUser = us.getLogin().equals(login);
			if(isFoundUser) {
				return us;
			}
		}
		return null;
	}

	@Override
	public User getUserById(int userId) throws IOException {
		List<User> userList = getAllUsers();
		for(User us : userList) {
			boolean isFoundUser = us.getId() == userId;
			if(isFoundUser) {
				return us;
			}
		}
		return null;
	}

	@Override
	public void removeUserByLogin(String login) throws IOException {
		List<User> userList = getAllUsers();
		
		for(int i = 0 ; i < userList.size(); i++) {
			boolean isFoundUser = userList.get(i).getLogin().equals(login);
			if(isFoundUser) {
				userList.remove(i);
			}
		}
		saveUsers(userList);

	}

	@Override
	public void removeUserById(int id) throws IOException {
		List <User> userList = getAllUsers();
		
		for(int i = 0 ; i < userList.size(); i++) {
			boolean isFoundUser = userList.get(i).getId() == id;
			if(isFoundUser) {
				userList.remove(i);
			}
		}
		saveUsers(userList);

	}

}
