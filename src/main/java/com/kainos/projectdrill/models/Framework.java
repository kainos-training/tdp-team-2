package com.kainos.projectdrill.models;

public class Framework {
	
	private int frameworkId;
	private String frameworkName;
	private String frameworkLanguage;
	
	
	//Constructors
	public Framework(){}
	
	public Framework(int newFrameworkId, String newFrameworkName, String newFrameworkLanguage){
		frameworkId = newFrameworkId;
		frameworkName = newFrameworkName;
		frameworkLanguage = newFrameworkLanguage;
	}

	
	//Getters and Setters
	public int getFrameworkId() {
		return frameworkId;
	}

	public void setFrameworkId(int frameworkId) {
		this.frameworkId = frameworkId;
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

}
