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
	
	public String getFrameworkName() {
		return frameworkName;
	}

	public void setFrameworkName(String frameworkName) {
		this.frameworkName = frameworkName;
	}

	public String getFrameworkLanguage() {
		return frameworkLanguage;
	}

	public void setFrameworkLanguage(String frameworkLanguage) {
		this.frameworkLanguage = frameworkLanguage;
	}

	public User(int newUserId, String newUserName) {
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
