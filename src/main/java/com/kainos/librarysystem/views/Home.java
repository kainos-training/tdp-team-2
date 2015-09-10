package com.kainos.librarysystem.views;

import io.dropwizard.views.View;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.database.LibraryConnector;
import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.model.Category;

public class Home extends View {

	private List<Book> books;
	
	public Home(List<Book> books) {
		super("/Home.ftl");
		
		this.books = books;
	}
	
	public List<Book> getBooks (){
		
		
		return books;
	}
	 

}
