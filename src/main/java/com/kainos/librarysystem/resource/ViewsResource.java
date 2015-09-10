package com.kainos.librarysystem.resource;

import io.dropwizard.views.View;

import java.sql.SQLException;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.database.LibraryConnector;
import com.kainos.librarysystem.views.AddBookView;
import com.kainos.librarysystem.views.Home;
import com.kainos.librarysystem.views.Index;

@Path("/")
public class ViewsResource {

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
	public View Home() {

		return new Home();

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
		System.out.println("title: " + title + "auther: " + author + "year: "
				+ year + "catId: " + catId);

		LibraryConnector lc = new LibraryConnector(
				"jdbc:mysql://localhost/LibraryDB", "libraryuser",
				"librarypassword");

		lc.addBook(title, author, year, catId);

		if (title.isEmpty() || author.isEmpty()) {
			getAddBook();
		}
		if(catId.equals("-1")){
			getAddBook();
		}

		return new Home();

	}
}
