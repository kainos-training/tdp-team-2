package com.kainos.projectdrill.views;

import java.util.List;

import io.dropwizard.views.View;

import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.User;

public class FrameworkExpert extends View{
	
	private List<User> frameworkSummary;
	
	public FrameworkExpert(List<User> frameworkExperts) {	
		super("/framework.ftl");
		this.frameworkSummary = frameworkExperts;
	}
	

}
