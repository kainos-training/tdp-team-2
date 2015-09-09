package com.kainos.librarysystem.model;

import java.util.List;

public class Book {
	
	private String title, author;
	private List<Category> categories;
	private int yearPublished;
	
	public Book(){
	}
	
	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Book(String title, String author){
		this.title=title;
		this.author=author;
	}
	
	public Book(String title, String author, int yearPublished){
		this.title=title;
		this.author=author;
		this.yearPublished=yearPublished;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYearPublished() {
		return yearPublished;
	}
	
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", categories="
				+ categories + ", yearPublished=" + yearPublished + "]";
	}
	

}