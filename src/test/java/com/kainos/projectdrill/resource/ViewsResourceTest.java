package com.kainos.projectdrill.resource;

import org.junit.Test;
import org.junit.Before;

import io.dropwizard.views.View;

import com.kainos.projectdrill.views.FrameworkExpert;
import com.kainos.projectdrill.views.Frameworks;
import com.kainos.projectdrill.views.Index;
import com.kainos.projectdrill.configuration.DatabaseConfiguration;

import static org.junit.Assert.assertTrue;

public class ViewsResourceTest {

  private DatabaseConfiguration config = new DatabaseConfiguration();
  private ViewsResource resource;

  @Before
  public void setup() {
    config.setUrl("jdbc:mysql://localhost/team2");
    config.setUser("Team2User");
    config.setPassword("Team2Password");
    resource = new ViewsResource(config);
  }

	@Test
	public void testSayHelloReturnsIndexView() {
        View actualView = resource.sayHello();
		assertTrue(actualView instanceof Index);
	}

	@Test
	public void testgetListOfFrameworksReturnsFrameworks() {
        View actualView = resource.getListOfFrameworks();
		assertTrue(actualView instanceof Frameworks);
	}
	@Test
	public void testFrameworkResourceReturnsFramework() {
        View actualView = resource.FrameworkResource(1);
		assertTrue(actualView instanceof FrameworkExpert);
	}

}
