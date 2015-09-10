package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.database.LibraryConnector;
import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.views.Home;
import com.kainos.librarysystem.views.Index;

@Path("/")
public class ViewsResource {
	
	LibraryConnector dbConnector;
	
	public ViewsResource(LibraryConnector dbConnector){ 
		this.dbConnector = dbConnector;
	}
	
	@GET
	@Timed
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		return new Index();
		
		
	}
	@GET
	@Timed
	@Path("/Home")
	@Produces(MediaType.TEXT_HTML)
	public View Home() throws SQLException{
		
		List<Book> books = dbConnector.getBooks();
		
		return new Home(books);
	
	}
}
