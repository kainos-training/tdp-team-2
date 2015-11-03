package com.kainos.projectdrill.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.projectdrill.views.FrameworkExpert;
import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.User;
import com.kainos.projectdrill.views.Frameworks;
import com.kainos.projectdrill.views.Index;

import io.dropwizard.views.View;

@Path("/")
public class ViewsResource {
	
	public ViewsResource(){ }
	
	@GET
	@Timed
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		return new Index();
	}

	
	@GET
	@Timed
	@Path("/framework")
	@Produces(MediaType.TEXT_HTML)
	public View FrameworkResource(){

		return new FrameworkExpert();
	}
	/*
	 * Gets a GET Request on /frameworks 
	 * and 
	 * returns a frameworks view with the list of frameworks.
	 */
	
	@GET
	@Timed
	@Path("/frameworks")
	@Produces(MediaType.TEXT_HTML)
	public View getListOfFrameworks(){
		//TODO Replace the below Arraylist and call database.	
		Framework mockData = new Framework();
		mockData.setFrameworkLanguage("Java");
		mockData.setFrameworkName("Dropwizard");
		List<Framework> frameworks = new ArrayList();
		frameworks.add(mockData);
		return new Frameworks(frameworks);
	}
	
}
