package com.kainos.librarysystem.views;

import java.util.ArrayList;

import io.dropwizard.views.View;

public class Home extends View {

	public Home() {
		super("/Home.ftl");
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<String> getBooks (){
		ArrayList Books = new ArrayList();
		
		Books.add("Java for Beginners");
		Books.add("MySQL");
		Books.add("PHP");
		Books.add("WAMP is brill");
		Books.add("JavaScript");
		Books.add("JQuery is lovely");
		
		return Books;
	}
	 

}
