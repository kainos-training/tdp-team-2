package com.kainos.projectdrill.models;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

// Program to test the User class
public class UserTest {

	// Create new user
	User user = new User();
	
	// Testing data
	private static final String CORRECT_USER_NAME = "User three";
	private static final int CORRECT_USER_ID = 3;
	private static final User TEST_USER = new User(CORRECT_USER_ID, CORRECT_USER_NAME);
	
	// TESTS (testing only get and set methods; nothing else available)
	@Test
	public void testForGetUserName() {
		assertTrue(TEST_USER.getUserName().equals(CORRECT_USER_NAME));		
	}//testForGetUserName()
	
	@Test
	public void testForSetUserName() {
		user.setUserName(CORRECT_USER_NAME);
		assertTrue(user.getUserName().equals(CORRECT_USER_NAME));
	}//testForSetUserName()

	@Test
	public void testForGetUserId() {
		assertTrue(TEST_USER.getUserId() == CORRECT_USER_ID);		
	}//testForGetUserId()
	
	@Test
	public void testForSetUserId() {
		user.setUserId(CORRECT_USER_ID);
		assertTrue(user.getUserId() == CORRECT_USER_ID);
	}//testForSetUserId()
	
}//class