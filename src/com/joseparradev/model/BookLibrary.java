package com.joseparradev.model;

import java.util.List;

public class BookLibrary {
	private String nameLibrary;
	private String description;
	private List<Book> allBooks;
	private Book firtsBookLibrary;
	private String email;
	private Book sixBookInList;
	private List<Book> firstFourBook;
	private List<String> nameBooks;

	public BookLibrary() {
		super();

	}

	public BookLibrary(String nameLibrary, String description, List<Book> allBooks, Book firtsBookLibrary, String email,
			Book sixBookInList, List<Book> firstFourBook, List<String> nameBooks) {
		super();
		this.nameLibrary = nameLibrary;
		this.description = description;
		this.allBooks = allBooks;
		this.firtsBookLibrary = firtsBookLibrary;
		this.email = email;
		this.sixBookInList = sixBookInList;
		this.firstFourBook = firstFourBook;
		this.nameBooks = nameBooks;
	}

	public Book getSixBookInList() {
		return sixBookInList;
	}

	public void setSixBookInList(Book sixBookInList) {
		this.sixBookInList = sixBookInList;
	}

	public List<Book> getFirstFourBook() {
		return firstFourBook;
	}

	public void setFirstFourBook(List<Book> firstFourBook) {
		this.firstFourBook = firstFourBook;
	}

	public List<String> getNameBooks() {
		return nameBooks;
	}

	public void setNameBooks(List<String> nameBooks) {
		this.nameBooks = nameBooks;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNameLibrary() {
		return nameLibrary;
	}

	public void setNameLibrary(String nameLibrary) {
		this.nameLibrary = nameLibrary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
