package com.kainos.projectdrill.models;

public class Language {

	private int languageId;
	private String languageName;
	
	public Language(){}
	
	public Language(int newLanguageId, String newLanguageName){
		languageId = newLanguageId;
		languageName = newLanguageName;
	}
		
	public int getLanguageId() {
		return languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
	
}
