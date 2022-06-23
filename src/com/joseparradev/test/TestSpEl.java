package com.joseparradev.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model.Book;
import com.joseparradev.model.BookCollection;
import com.joseparradev.model.BookLibrary;

public class TestSpEl {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Book book1 = contexto.getBean("book1", Book.class);
		Book book2 = contexto.getBean("book2", Book.class);

		BookCollection bookCollection = contexto.getBean("bookCollection", BookCollection.class);

		List<Book> listBooks = new ArrayList<>();
		listBooks.add(new Book(3L, "Spring Data JPA"));
		listBooks.add(new Book(4L, "Spring Security"));
		;
		List<Book> myListBooksCollection = bookCollection.getBookList();
		myListBooksCollection.addAll(listBooks);
		System.out.println("The list book is: " + bookCollection.getFirstBook().getBookName());
		if (myListBooksCollection != null) {
			for (Book book : myListBooksCollection) {
				System.out.println(book.getBookName());
			}
		}
		System.out.println("The first book is: " + bookCollection.getFirstBook().getBookName());

		BookLibrary bookLibrary = contexto.getBean("bookLibrary", BookLibrary.class);
		List<Book> myListBooksLibrary = bookCollection.getBookList();

		for (Book book : myListBooksLibrary) {
			System.out.println("Id= " + book.getId() + ", Name: " + book.getBookName());
		}

		contexto.close();

	}
}
