package com.mac.bry.kurs1024kb.exception;

public class UserShortLengthPasswordException extends Exception {
	
	public UserShortLengthPasswordException(String msg) {
		super(msg);
	}
	
	public UserShortLengthPasswordException() {
		super();
	}
}
