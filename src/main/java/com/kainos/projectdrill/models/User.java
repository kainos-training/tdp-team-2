package com.kainos.projectdrill.models;

public class User {
	
	private int userId;
	private String userName;
	
	
	//Constructors
	public User(){}
	
	public User(int newUserId, String newUserName){
		userId = newUserId;
		userName = newUserName;
	}	
	
	
	//Getters and Setters
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}

}
