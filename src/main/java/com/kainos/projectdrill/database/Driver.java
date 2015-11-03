package com.kainos.projectdrill.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.kainos.projectdrill.configuration.DatabaseConfiguration;
import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.User;



public class Driver {

	private DatabaseConfiguration dbConfig;
	Connection connection;

	public Driver(DatabaseConfiguration dbConfig) {
		this.dbConfig = dbConfig;
	}


	//Try to connect to database
	public void connectToDatabase(){
		try{
		    connection = DriverManager.getConnection(dbConfig.getUrl(), dbConfig.getUser(), dbConfig.getPassword());
		    System.out.println("Successfully connected to database.");
		} catch (Exception e){
			System.out.println("An error occurred while attempting to connect to the database.");
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
			System.out.println("An error occurred when retrieving framework objects from the database.");
			e.printStackTrace();
			return frameworkArray;
		}

	}

	//Method to list all frameworks names in database
	public ArrayList<String> listFrameworksNames(){

		connectToDatabase();
		ArrayList<String> frameworkNameArray = new ArrayList<String>();
		try {
			Statement create = connection.createStatement();
			ResultSet result = create.executeQuery("Select frameworks.Name AS name FROM frameworks;");

			while(result.next()){
				String newFrameworkName = result.getString("name");
				frameworkNameArray.add(newFrameworkName);
			}
			return frameworkNameArray;
		} catch (SQLException e) {
			System.out.println("An error occurred when retriving framework names from the database.");
			e.printStackTrace();
			return frameworkNameArray;
		}

	}

	public void addFramework(String frameworkName, int languageId){

		connectToDatabase();
		try {
			//SQL Statement to Add Framework
			PreparedStatement addFrameworkStatement = connection.prepareStatement(
					"CALL addFramework (Name, Language) Values(?, ?)");
			addFrameworkStatement.setString(1,frameworkName);
			addFrameworkStatement.setInt(2,languageId);

			//Executing prepared statement
			addFrameworkStatement.executeUpdate();
			System.out.println("Framework "+frameworkName+" has been added Successfully");

		} catch (SQLException e) {
			System.out.println("Unable to add framework to the database. ");
			e.printStackTrace();
		}

	}
	
	public ArrayList<User> frameworkSummary(int id){
		
		connectToDatabase();
		
		ArrayList<User> frameworkSummaryArray = new ArrayList<User>();
				
		try{
			
			Statement create = connection.createStatement();
			ResultSet result = create.executeQuery("select frameworks.Name AS name, User.id AS userId, User.name AS expert, languages.Name AS language "+ 
				"FROM frameworks "+
				"JOIN Framework_User ON frameworks.ID = Framework_User.frameworkid "+
				"JOIN User ON Framework_User.userid = User.id " +
				"JOIN languages ON frameworks.Language = languages.ID " +
				"WHERE frameworks.ID = " + id + ";");

			int i = 0;
			while(result.next()){
				i++;
				User newUser = new User(result.getInt("userId"), result.getString("expert"), result.getString("name"), result.getString("language"));
	//			Framework fWork = new Framework(result.getString(), result.getString);
				frameworkSummaryArray.add(newUser);
			}
			System.out.println("SELECT DONE, RESULT SIZE : " + i);
			System.out.println("SELECT DONE, RESULT SIZE : " + frameworkSummaryArray.size());
			return frameworkSummaryArray;
			}
			catch (SQLException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
				return frameworkSummaryArray;
			}
	}
	
}
