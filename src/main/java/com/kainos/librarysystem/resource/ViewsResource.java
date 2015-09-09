package com.kainos.librarysystem.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import io.dropwizard.views.View;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.kainos.librarysystem.views.Index;


@Path("/")
public class ViewsResource {
	
	public ViewsResource(){ }
	
	@GET
	@Timed
	@Path("/index")
	@Produces(MediaType.TEXT_HTML)
	public View sayHello(){
		return new Index();
	}
	
	public void addBook(String title, String author, String year, String catId) throws SQLException {
		
		if(title.isEmpty() || author.isEmpty())
		{
			// error 	
		}
		
		 String dbDriver = "com.mysql.jdbc.Driver";
	     String dbUrl = "jdbc:mysql://localhost/LibraryDb";
	     try {
			Class.forName(dbDriver).newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     
		 Connection conn = DriverManager.getConnection(dbUrl, "root", "ch@ngeme1");
		  
		 // the mysql insert statement
	      String query = " insert into Book (title, author, year)"
	        + " values (?, ?, ?, ?)";
	 
	      // create the mysql insert preparedstatement
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString (1, title);
	      preparedStmt.setString (2, author);
	      preparedStmt.setString (3, year);
	      
	      // execute the preparedstatement
	      preparedStmt.execute();
	      
	      // close con
	      conn.close();	
	}
	
}
