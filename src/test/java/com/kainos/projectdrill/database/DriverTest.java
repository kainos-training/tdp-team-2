package com.kainos.projectdrill.database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import com.kainos.projectdrill.models.Framework;
import com.kainos.projectdrill.models.Language;
import com.kainos.projectdrill.configuration.DatabaseConfiguration;


public class DriverTest {

  private DatabaseConfiguration config = new DatabaseConfiguration();
  private Driver newDriver;

  @Before
  public void setup() {
    config.setUrl("jdbc:mysql://localhost/team2");
    config.setUser("Team2User");
    config.setPassword("Team2Password");
    newDriver = new Driver(config);
  }

	@Test
	public void testCanGetFrameworksFromDatabase() {
		ArrayList<Framework> frameworks = new ArrayList<Framework>();
		frameworks = new ArrayList<Framework>(newDriver.listFrameworks());
		assertFalse(frameworks.size() == 0);
		}
	
	
	@Test
	public void canAddFramework() {

		java.util.Date date = new java.util.Date();
		Long timestamp = date.getTime();
		String frameworkName = "frameName" + timestamp;

		newDriver.addFramework(frameworkName, 1);
		boolean frameworkFound = false;
		ArrayList<Framework> frameworks = new ArrayList<Framework>();
		frameworks = new ArrayList<Framework>(newDriver.listFrameworks());
		for (Framework frameworksResult : frameworks) {
			String FrameworkNameResult = frameworksResult.getFrameworkName();
			if (FrameworkNameResult.equals(frameworksResult)) {
				frameworkFound = true;
			}
		}
		assertFalse("Framework not added", frameworkFound);
	}
	
	@Test
	public void ListLanguagesFromDatabase() {
		ArrayList<Language> languages = new ArrayList<Language>();
		languages = new ArrayList<Language>(newDriver.listLanguages());
		assertFalse(languages.size() == 0);
	}

}
