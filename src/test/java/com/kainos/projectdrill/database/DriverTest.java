package com.kainos.projectdrill.database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.kainos.projectdrill.models.Framework;


public class DriverTest {

	Driver newDriver = new Driver();
	
	
	@Test
	public void testCanGetFrameworksFromDatabase() {
		ArrayList<Framework> frameworks = new ArrayList<Framework>();
		frameworks = new ArrayList<Framework>(newDriver.listFrameworks());
		assertFalse(frameworks.size() == 0);
		}
}
