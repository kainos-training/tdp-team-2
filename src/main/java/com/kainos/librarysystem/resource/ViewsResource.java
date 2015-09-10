package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.List;


import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.database.LibraryConnector;
import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.views.AddBookView;
import com.kainos.librarysystem.views.Home;
import com.kainos.librarysystem.views.Index;


@Path("/")
public class ViewsResource {
	
	LibraryConnector dbConnector;
	
	public ViewsResource(LibraryConnector dbConnector){ 
		this.dbConnector = dbConnector;
	}
	


	public ViewsResource() {
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
	@Path("/Home")
	@Produces(MediaType.TEXT_HTML)
	public View Home() throws SQLException{
		
		List<Book> books = dbConnector.getBooks();
		
		return new Home(books);
	
	}

	@GET
	@Timed
	@Path("/add-book")
	@Produces(MediaType.TEXT_HTML)
	public View getAddBook() {
		return new AddBookView();
	}

	@POST
	@Timed
	@Path("add-book")
	public View addBook(@FormParam("title") String title,
			@FormParam("author") String author, @FormParam("year") String year,
			@FormParam("catId") String catId) throws SQLException {

		/*
		LibraryConnector lc = new LibraryConnector(
				"jdbc:mysql://localhost/LibraryDB", "libraryuser",
				"librarypassword");
*/ 
		
		dbConnector.addBook(title, author, year, catId);

		Response response = null;
		
		if (title.isEmpty() || author.isEmpty()) {
			response.seeOther(UriBuilder.fromUri("add-book").build()).build();
		}
		if(catId.equals("-1")){
			response.seeOther(UriBuilder.fromUri("add-book").build()).build();
		}

		List<Book> books = dbConnector.getBooks();
		
		return new Home(books);
	}

	}
