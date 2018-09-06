package com.mac.bry.kurs1024kb.entity.parser;

import com.mac.bry.kurs1024kb.entity.User;

public class UserParser {
	
	public static final String SEPARATOR= "#";
	
	public static User stringToUser(String userString) {
		String [] tempArr = userString.split(SEPARATOR);
		User tempUser = new User(Integer.parseInt(tempArr[0]),
				tempArr[1],
				tempArr[2]);
		return tempUser;			
	}
}
