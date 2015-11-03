package com.kainos.projectdrill.database;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.Before;

import com.kainos.projectdrill.models.Framework;
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
}
