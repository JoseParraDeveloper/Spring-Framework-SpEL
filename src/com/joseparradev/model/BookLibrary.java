package com.joseparradev.model;

import java.util.List;

public class BookLibrary {

	private List<Book> allBooks;
	private Book firtsBookLibrary;

	public BookLibrary(List<Book> allBooks, Book firtsBookLibrary) {
		super();
		this.allBooks = allBooks;
		this.firtsBookLibrary = firtsBookLibrary;
	}

	public BookLibrary() {
		super();
	}

	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}

	public Book getFirtsBookLibrary() {
		return firtsBookLibrary;
	}

	public void setFirtsBookLibrary(Book firtsBookLibrary) {
		this.firtsBookLibrary = firtsBookLibrary;
	}

}
