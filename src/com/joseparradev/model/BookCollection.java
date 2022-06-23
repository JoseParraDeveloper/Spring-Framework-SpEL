package com.joseparradev.model;

import java.util.List;

public class BookCollection {

	private List<Book> bookList;

	public BookCollection() {
		super();
	}

	public BookCollection(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	public Book getFirstBook() {
		List<Book> listBook = this.getBookList();
		if (listBook != null && !listBook.isEmpty()) {
			return listBook.get(0);
		}
		return null;
	}

}
