package com.kainos.projectdrill.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.projectdrill.database.Driver;
import com.kainos.projectdrill.views.FrameworkExpert;
import com.kainos.projectdrill.views.Frameworks;
import com.kainos.projectdrill.views.Index;
import com.kainos.projectdrill.configuration.DatabaseConfiguration;

import io.dropwizard.views.View;

@Path("/")
public class ViewsResource {

	private DatabaseConfiguration dbConfig;

	public ViewsResource(DatabaseConfiguration dbConfig) {
		this.dbConfig = dbConfig;
	}

	@GET
	@Timed
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		return new Index();
	}
	
	//{id}

	@GET
	@Timed
	@Path("/framework/{id}")
	@Produces(MediaType.TEXT_HTML)
	public View FrameworkResource(@PathParam("id") int id){	
	
		Driver newDriver = new Driver(this.dbConfig);
		return new FrameworkExpert(newDriver.frameworkSummary(id));
	
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
	public View getListOfFrameworks() {
		Driver newDriver = new Driver(this.dbConfig);
		return new Frameworks(newDriver.listFrameworks());
	}
	
}
