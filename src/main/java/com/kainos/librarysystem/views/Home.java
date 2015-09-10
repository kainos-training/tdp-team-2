package com.kainos.librarysystem.views;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.database.LibraryConnector;
import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.model.Category;

public class Home extends View {

	public Home() {
		super("/Home.ftl");
		// TODO Auto-generated constructor stub
	}
	
	public List<Book> getBooks (){
		
		LibraryConnector libConnector = new LibraryConnector("jdbc:mysql://localhost/LibraryDB", "libraryuser", "librarypassword");
		List<Book> books = new ArrayList<Book>();
		
		try {
			books = libConnector.getBooks();
		} catch (SQLException e) {
			System.err.println("Error in Home.getBooks() " + e.getMessage());
		}
		
		return books;
	}
	 

}
