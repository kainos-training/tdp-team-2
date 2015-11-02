package com.kainos.projectdrill.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
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
	@Path("/frameworks")
	@Produces(MediaType.TEXT_HTML)
	public View getListOfFrameworks(){
		
		return new Frameworks();
	}
}
