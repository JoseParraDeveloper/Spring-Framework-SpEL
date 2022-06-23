package com.joseparradev.model;

public class Book {

	private Long id;
	private String bookName;

	public Book() {
		super();
	}

	public Book(Long id, String bookName) {
		super();
		this.id = id;
		this.bookName = bookName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

}
