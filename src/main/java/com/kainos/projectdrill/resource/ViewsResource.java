package com.kainos.projectdrill.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.projectdrill.database.Driver;
import com.kainos.projectdrill.views.FrameworkExpert;
import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.views.Frameworks;
import com.kainos.projectdrill.views.Index;
import com.kainos.projectdrill.views.addFramework;

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
		
		Driver newDriver = new Driver();
		return new Frameworks(newDriver.listFrameworks());
	}
	
	
	@GET
	@Timed
	@Path("/addframework")
	@Produces(MediaType.TEXT_HTML)
	public View AddFramework(){
		
		Driver newDriver = new Driver();
		return new addFramework();
		
	}
	
	

	/*
	 * Gets a POST Request on /addFramework
	 * and
	 * returns validates to make sure that framework does not exist before saving the framework to database.
	 */

	@POST
	@Timed
	@Path("/processAddFramework")
	@Produces(MediaType.TEXT_HTML)
	public View processAddFramework(@FormParam("name") String languageName){
		//TODO come back to this and complete but need to add get method first to display the page
		Driver newDriver = new Driver();
		
		return new Frameworks(newDriver.listFrameworks());
	}
}
