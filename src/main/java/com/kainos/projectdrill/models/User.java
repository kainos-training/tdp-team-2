package com.kainos.projectdrill.models;

public class User {
	
	private int userId;
	private String userName;
	private String frameworkName;
	private String frameworkLanguage;
	
	//Constructors
	public User(){}
	
	public User(int newUserId, String newUserName, String frameworkName, String frameworkLanguage){
		userId = newUserId;
		userName = newUserName;
		this.frameworkLanguage = frameworkLanguage;
		this.frameworkName = frameworkName;
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
