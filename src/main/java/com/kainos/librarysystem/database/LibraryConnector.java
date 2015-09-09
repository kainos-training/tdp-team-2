package com.kainos.librarysystem.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kainos.librarysystem.model.Book;
import com.kainos.librarysystem.model.Category;

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

	public List<Category> getCategories() throws SQLException {
		
		List<Category> categories = new ArrayList<Category>();
		
		Statement st = c.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT CategoryName FROM Category");
		while (rs.next()) {
			Category categoryToAdd = new Category(rs.getString("CategoryName"));
			categories.add(categoryToAdd);
		}
		return categories;
	}

	public List<Book> getBooks() throws SQLException {
		
		List<Book> books = new ArrayList<Book>();
		
		Statement st = c.createStatement();
		ResultSet rs = st
				.executeQuery("SELECT Title, Author, YearPublished FROM Book");
		
		while (rs.next()) {
			Book bookToAdd = new Book(rs.getString("Title"), rs.getString("Author"));
			bookToAdd.setYearPublished(rs.getInt("YearPublished"));
			books.add(bookToAdd);
		}
		return books;
	}
}
