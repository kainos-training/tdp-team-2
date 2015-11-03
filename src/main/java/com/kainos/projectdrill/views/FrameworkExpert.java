package com.kainos.projectdrill.views;

import java.util.List;

import io.dropwizard.views.View;

import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.User;

public class FrameworkExpert extends View{
	
	private List<User> userList;
	
	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public FrameworkExpert(List<User> userList) {	
		super("/framework.ftl");
		this.userList = userList;
	}
	
}
