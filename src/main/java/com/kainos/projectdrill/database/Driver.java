package com.kainos.projectdrill.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kainos.projectdrill.models.Framework;


public class Driver {
	private final String databaseUrl = "jdbc:mysql://localhost/team2";
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
	public ArrayList<Framework> listFrameworks(){
		
		connectToDatabase();
		ArrayList<Framework> frameworkArray = new ArrayList<Framework>();
		try {
			Statement create = connection.createStatement();
			ResultSet result = create.executeQuery("Select frameworks.ID AS id, frameworks.Name AS name, languages.Name AS language FROM frameworks JOIN languages ON frameworks.language = languages.ID;");

			while(result.next()){
				
				Framework newFramework = new Framework(result.getInt("id"), result.getString("name"), result.getString("language") );
				frameworkArray.add(newFramework);
			}
			return frameworkArray;
		} catch (SQLException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			return frameworkArray;
		}
		
	}
	
}
