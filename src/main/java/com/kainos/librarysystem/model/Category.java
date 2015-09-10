package com.kainos.librarysystem.model;

public class Category {

	private String categoryName;
	private int categoryID;
	
	public Category(String categoryName) {
		this.categoryName=categoryName;
	}
	
	public Category(int categoryID, String categoryName) {
		this.categoryName=categoryName;
		this.categoryID = categoryID;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", categoryID="
				+ categoryID + "]";
	}

}
