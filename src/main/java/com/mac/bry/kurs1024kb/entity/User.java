package com.mac.bry.kurs1024kb.entity;

public class User {
	
	private int id;
	private String login;
	private String password;
	
	public User() {
		super();
	}
	
	public User(int id, String login, String password) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return   id + "#" + login + "#" + password;
	}
	
	
	
	
	
}
