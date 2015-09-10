package com.kainos.librarysystem.database;

import static org.junit.Assert.assertFalse;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Ignore;

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

}
