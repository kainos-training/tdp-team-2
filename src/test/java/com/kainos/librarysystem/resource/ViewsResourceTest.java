package com.kainos.librarysystem.resource;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.kainos.librarysystem.database.LibraryConnector;

public class ViewsResourceTest {
	
	private LibraryConnector dbMockClient;
	private ViewsResource viewsResource;
	
	@Before
	public void setup()
	{
		dbMockClient = mock(LibraryConnector.class);
		viewsResource = new ViewsResource(dbMockClient);
	}
	
	@Test
	public void testDatabaseConnectorCalledOnViewBooks() throws SQLException
	{
		viewsResource.Home();
		
		verify(dbMockClient).getBooks();
	
	}
	
	@Test
	public void testDatabaseConnectorCalledOnAddBooks() throws SQLException
	{
		viewsResource.addBook("Title", "author", "2000", "1");
		
		
	    verify(dbMockClient).addBook("Title", "author", "2000", "1");
		verify(dbMockClient).getBooks();
	
	}
	
}
