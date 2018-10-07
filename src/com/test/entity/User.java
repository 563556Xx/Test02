package com.test.entity;

public class User {
	private int id;
	private String userName;
	private String userPass;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String userName, String userPass) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPass = userPass;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	

}
