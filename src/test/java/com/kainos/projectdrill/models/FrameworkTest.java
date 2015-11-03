package com.kainos.projectdrill.models;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

// Program to test the Framework class
public class FrameworkTest {

	// Create new framework
	Framework framework = new Framework();
	
	// Testing data
	private static final int CORRECT_FRAMEWORK_ID = 5;
	private static final String CORRECT_FRAMEWORK_NAME = "Ruby on Rails";
	private static final String CORRECT_FRAMEWORK_LANGUAGE = "Ruby";
	
	private static final Framework TEST_FRAMEWORK = 
			new Framework(CORRECT_FRAMEWORK_ID, CORRECT_FRAMEWORK_NAME, CORRECT_FRAMEWORK_LANGUAGE);
	
	// TESTS (testing only get and set methods; nothing else available)
	@Test
	public void testForGetFrameworkId() {
		assertTrue(TEST_FRAMEWORK.getFrameworkId() == CORRECT_FRAMEWORK_ID);		
	}//testForGetFrameworkId()
	
	@Test
	public void testForSetFrameworkId() {
		framework.setFrameworkId(CORRECT_FRAMEWORK_ID);
		assertTrue(framework.getFrameworkId() == CORRECT_FRAMEWORK_ID);
	}//testForSetFrameworkId()
	
	@Test
	public void testForGetFrameworkName() {
		assertTrue(TEST_FRAMEWORK.getFrameworkName().equals(CORRECT_FRAMEWORK_NAME));		
	}//testForGetFrameworkName()
	
	@Test
	public void testForSetFrameworkName() {
		framework.setFrameworkName(CORRECT_FRAMEWORK_NAME);
		assertTrue(framework.getFrameworkName().equals(CORRECT_FRAMEWORK_NAME));
	}//testForSetFrameworkName()

	@Test
	public void testForGetFrameworkLanguage() {
		assertTrue(TEST_FRAMEWORK.getFrameworkLanguage().equals(CORRECT_FRAMEWORK_LANGUAGE));		
	}//testForGetFrameworkLanguage()
	
	@Test
	public void testForSetFrameworkLanguage() {
		framework.setFrameworkLanguage(CORRECT_FRAMEWORK_LANGUAGE);
		assertTrue(framework.getFrameworkLanguage().equals(CORRECT_FRAMEWORK_LANGUAGE));
	}//testForSetFrameworkLanguage()
	
}//class