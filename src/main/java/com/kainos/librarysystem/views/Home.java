package com.kainos.librarysystem.views;

import io.dropwizard.views.View;

import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.model.Category;

public class Home extends View {

	public Home() {
		super("/Home.ftl");
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Book> getBooks (){
		ArrayList Books = new ArrayList();
		Book b = new Book();
		
		List<Category> assignedCategory = new ArrayList<Category>();
		Category c = new Category("Technical");
		
		
		b.setAuthor("Martin");
		b.setTitle("Java is Cool");
		b.setCategories(assignedCategory);
		b.setYearPublished(2010);
		
		Books.add(b);
		
		return Books;
	}
	 

}
