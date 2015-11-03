package com.kainos.projectdrill.resource;

import org.junit.Test;
import io.dropwizard.views.View;
import com.kainos.projectdrill.views.Index;
import static org.junit.Assert.assertTrue;

public class ViewsResourceTest {
	
    ViewsResource resource = new ViewsResource();

	@Test
	public void testSayHelloReturnsIndexView() {
        View actualView = resource.sayHello();
		assertTrue(actualView instanceof Index);
	}


}
