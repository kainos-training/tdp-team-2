/**
 * 
 */
package com.kainos.projectdrill.views;

import java.util.List;

import com.kainos.projectdrill.models.Framework;

import io.dropwizard.views.View;

/**
 * Displays the list of frameworks
 *
 */
public class Frameworks extends View {
	
	private List<Framework> frameworks;
	
	public Frameworks(List<Framework> frameworks) {	
		super("/frameworks.ftl");
		this.frameworks = frameworks;
	}

	public List<Framework> getFrameworks() {
		return frameworks;
	}

	public void setFrameworks(List<Framework> frameworks) {
		this.frameworks = frameworks;
	}
	
	
	

}
