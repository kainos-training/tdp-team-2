package com.kainos.projectdrill.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Driver {
	private final String databaseUrl = "jdbc:mysql://localhost";
	private final String databaseUser = "root";
	private final String databasePassword = "";
	Connection connection;

	
	//Try to connect to database
	public void connectToDatabase(){
		try{
		    connection = DriverManager.getConnection(databaseUrl,databaseUser,databasePassword);
		    System.out.println("Successfully connected to database.");
		} catch (Exception e){
			System.out.println("Error occured while attempting connection to database");
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	
	//Method to list all frameworks in database
	public void listFrameworks(){

		try {
			Statement create = connection.createStatement();
			ResultSet result = create.executeQuery("Select * from frameworks");
			
			while(result.next()){
				System.out.println(result.getString(2));
			}
		} catch (SQLException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		
	}
	
}
