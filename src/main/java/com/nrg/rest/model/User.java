package com.nrg.rest.model;

public class User {
	
	public String userName;
	
	public String password;
	
	public String getUserName() {
		return userName;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
