package com.kainos.projectdrill.resource;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.projectdrill.configuration.DatabaseConfiguration;
import com.kainos.projectdrill.database.Driver;
import com.kainos.projectdrill.views.FrameworkExpert;
import com.kainos.projectdrill.views.Frameworks;
import com.kainos.projectdrill.views.Index;
import com.kainos.projectdrill.views.addFramework;

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
	public View sayHello() {
		return new Index();
	}

	@GET
	@Timed
	@Path("/framework")
	@Produces(MediaType.TEXT_HTML)
	public View FrameworkResource() {
		return new FrameworkExpert();
	}

	/*
	 * Gets a GET Request on /frameworks and returns a frameworks view with the
	 * list of frameworks.
	 */
	@GET
	@Timed
	@Path("/frameworks")
	@Produces(MediaType.TEXT_HTML)

	public View getListOfFrameworks() {

		Driver newDriver = new Driver(dbConfig);
		return new Frameworks(newDriver.listFrameworks());
	}
	
	/*
	 * Handles GET requests to show a add framework form.
	 */

	@GET
	@Timed
	@Path("/addframework")
	@Produces(MediaType.TEXT_HTML)
	public View AddFramework() {
		
		Driver driver = new Driver(dbConfig);
		return new addFramework(driver.listLanguages());

	}

	/*
	 * Gets a POST Request on /addFramework and returns validates to make sure
	 * that framework does not exist before saving the framework to database.
	 */

	@POST
	@Timed
	@Path("/processAddFramework")
	@Produces(MediaType.TEXT_HTML)
	public View processAddFramework(@FormParam("name") String languageName) {
		// TODO come back to this and complete but need to add get method first
		// to display the page
		Driver newDriver = new Driver(dbConfig);
		return null;
	}
}
