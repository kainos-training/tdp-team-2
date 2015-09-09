package com.kainos.librarysystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Category;

public class LibraryConnector {
	private Connection c;
	private Class driver;

	public LibraryConnector(String uri, String userName, String password) {
		try {
			driver = Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			c = DriverManager.getConnection(uri, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Category> getCategories() {
		
		List<Category> categories = new List<Category>;
		
		Statement st = c.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT CategoryName FROM Category");
		while (rs.next()) {
			Category categoryToAdd = new Category();
			categoryToAdd.setName(rs.getString("CategoryName"));
			categories.add(categoryToAdd);
		}
		return categories;
	}

	public List<Book> getBooks() {
		
		List<Book> books = new List<Book>;
		
		Statement st = c.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT Title, Author, YearPublished FROM Book");
		
		while (rs.next()) {
			Book bookToAdd = new Book();
			bookToAdd.setName(rs.getString("CategoryName"));
			books.add(bookToAdd);
		}
		
		return books;
	}
}
