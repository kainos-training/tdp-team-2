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

	public LibraryConnector(String uri, String userName, String password) {

		try {
			c = DriverManager.getConnection(uri, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public List<Category> getCategories() throws SQLException {

		List<Category> categories = new ArrayList<Category>();

		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("SELECT CategoryName FROM Category");
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
				.executeQuery("SELECT Book.Title, "
						+ 	  "Book.Author, "
						+ 	  "Book.YearPublished, "
						+     "Category.CategoryName, "
						+     "Category.CategoryID FROM Book "
						+     "LEFT JOIN BookCategory ON "
						+ 	  "BookCategory.BookID = Book.BookID "
						+     "LEFT JOIN Category on "
						+     "Category.CategoryID = BookCategory.CategoryID;");
		
		while (rs.next()) {
			
			List<Category> categories = new ArrayList<Category>();
			Book bookToAdd = new Book(rs.getString("Title"),
					rs.getString("Author"), rs.getInt("YearPublished"));

			categories.add(new Category(rs.getInt("CategoryID"), rs.getString("CategoryName")));
			bookToAdd.setCategories(categories);

			books.add(bookToAdd);
		}
		return books;
	}

}
