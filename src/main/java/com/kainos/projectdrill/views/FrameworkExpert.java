package com.kainos.projectdrill.views;

import java.util.List;

import io.dropwizard.views.View;

import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.User;

public class FrameworkExpert extends View{
	
	public FrameworkExpert(){
		super("/framework.ftl");
	}

}
