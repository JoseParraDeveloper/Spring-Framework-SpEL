package com.joseparradev.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.model.Book;
import com.joseparradev.model.BookCollection;
import com.joseparradev.model.BookLibrary;
import com.joseparradev.model.InformationLibrary;

public class TestSpEl {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("--------------------------BEANS Book----------------------------------------------");
		Book book1 = contexto.getBean("book1", Book.class);
		Book book2 = contexto.getBean("book2", Book.class);

		System.out.println("Name book 1: " + book1.getBookName());
		System.out.println("Name book 2: " + book2.getBookName());

		System.out.println("--------------------------BEAN BookCollection-------------------------------------");
		// Bean with refer to other beans (book1 and book2) by id attribute
		BookCollection bookCollection = contexto.getBean("bookCollection", BookCollection.class);
		System.out.println("The list of books is:");

		List<Book> listBooks = new ArrayList<>();
		listBooks.add(new Book(8L, "Spring Data JPA"));
		listBooks.add(new Book(9L, "Spring Security"));
		List<Book> myListBooksCollection = bookCollection.getBookList();
		myListBooksCollection.addAll(listBooks);
		for (Book book : myListBooksCollection) {
			System.out.println(book.getBookName());
		}
		System.out.println("The first book is: " + bookCollection.getFirstBook().getBookName());

		System.out.println("--------------------------BEAN BookLibrary----------------------------------------");
		// Bean with dynamic dependency injection (properties and invoke methods defined
		// in BookCollection, static constants and invoke static methods)
		BookLibrary bookLibrary = contexto.getBean("bookLibrary", BookLibrary.class);
		System.out.println("Name Library: " + bookLibrary.getNameLibrary());
		System.out.println(bookLibrary.getDescription());
		System.out.println(bookLibrary.getEmail());
		List<Book> myListBooksLibrary = bookCollection.getBookList();
		for (Book book : myListBooksLibrary) {
			System.out.println("Id= " + book.getId() + ", Name: " + book.getBookName());
		}
		System.out.println("The sixth Book in the list: " + "Id= " + bookLibrary.getSixBookInList().getId() + ", Name: "
				+ bookLibrary.getSixBookInList().getBookName());
		List<Book> listBook = bookLibrary.getFirstFourBook();
		System.out.println("The first four Books in the list:");
		for (Book book : listBook) {
			System.out.println("Id= " + book.getId() + ", Name: " + book.getBookName());
		}
		System.out.println("The names of the Books in the list:");
		List<String> listNameBooks = bookLibrary.getNameBooks();
		for (String nameBook : listNameBooks) {
			System.out.println(nameBook);
		}
		System.out.println("--------------------------BEAN InformationLibrary-----------------------------------");
		InformationLibrary informationLibrary = contexto.getBean("informationLibrary", InformationLibrary.class);
		System.out.println(InformationLibrary.NAME_LIBRARY);
		System.out.println(InformationLibrary.getInformationLibrary());
		System.out.println("Is it a valid email? --> "
				+ (Boolean.TRUE.equals(informationLibrary.isIsvalidEmail()) ? "it's valid" : "it's not valid"));
		System.out.println("Director's telephone: " + informationLibrary.getTelephoneDirector());
		contexto.close();

	}
}
