package com.kainos.librarysystem.database;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.kainos.librarysystem.model.Book;

public class LibraryConnectorTest {

	 LibraryConnector lc = new LibraryConnector(
	 
			"jdbc:mysql://localhost/LibraryDB", "libraryuser",
			"librarypassword");

	@Ignore
	public void testCanGetBooksFromDatabase() {

		List<Book> books = new ArrayList<Book>();

		try {
			books = new ArrayList<Book>(lc.getBooks());
		} catch (SQLException e) {
			e.printStackTrace();
		}

		assertFalse(books.size() == 0);
	}
	
	@Test
	public void canAddBooks() {
		java.util.Date date = new java.util.Date();
		Long timestamp = date.getTime();
		String bookTitle = "Test Title " + timestamp.toString();
		
		try {
		lc.addBook(bookTitle, "TestAuthor", "2015", "1");
		} catch (SQLException e) {
			e.printStackTrace();
			assertFalse("SQL Exception thrown", true);
		}
		
		// Check new book is added to DB 
		try {
			List<Book> books = new ArrayList<Book>();
			books = new ArrayList<Book>(lc.getBooks());
			
			boolean bookFound = false;
			for (Book bookResult : books)
			{
				String titleResult = bookResult.getTitle();
				if (titleResult.equals(bookResult))
				{
					bookFound = true;
				}
				
			}
			assertFalse("Book not added to database", bookFound);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
