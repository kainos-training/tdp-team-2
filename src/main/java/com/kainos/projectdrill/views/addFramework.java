package com.kainos.projectdrill.views;

import java.util.ArrayList;
import java.util.List;

import com.kainos.projectdrill.models.Language;

import io.dropwizard.views.View;

public class addFramework extends View {
	
	private List<Language> languages;
	
	public addFramework(ArrayList<Language> languages) {
		super("/addframework.ftl");
		this.languages = languages;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

}
