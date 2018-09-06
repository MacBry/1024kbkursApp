package com.mac.bry.kurs1024kb.exception;

public class UserLoginAlreadyExistException extends Exception {

	public UserLoginAlreadyExistException (String msg) {
		super(msg);
	}
	
	public UserLoginAlreadyExistException() {
		super();
	}
}
