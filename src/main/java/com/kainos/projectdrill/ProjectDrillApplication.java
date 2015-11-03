package com.kainos.projectdrill;

import com.google.common.collect.ImmutableMap;
import com.kainos.projectdrill.configuration.ProjectDrillConfiguration;
import com.kainos.projectdrill.resource.ViewsResource;

import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.dropwizard.views.ViewBundle;


public class ProjectDrillApplication extends Application<ProjectDrillConfiguration> {

	public static void main(String[] args) throws Exception {
		new ProjectDrillApplication().run(args);
	}

	@Override
	public void run(ProjectDrillConfiguration configuration, Environment environment)
			throws Exception {
		final ViewsResource resource = new ViewsResource(configuration.getDatabaseConfiguration());
		environment.jersey().register(resource);
	}

	@Override
	public void initialize(Bootstrap<ProjectDrillConfiguration> bootstrap){
		bootstrap.addBundle(new ViewBundle<ProjectDrillConfiguration>() {
	        @Override
	        public ImmutableMap<String, ImmutableMap<String, String>> getViewConfiguration(ProjectDrillConfiguration config) {
	            return config.getViewRendererConfiguration();
	        }
        });

		bootstrap.addBundle(new AssetsBundle("/public/assets", "/assets"));
	}

}
