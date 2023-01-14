package com.it.berdeja.oop;

import java.util.Arrays;
import java.util.Objects;

public class BookService {
    public Book[] filterBooksByAuthor(Author author, Book[] books) {
    	if (author == null || books == null) {
			return new Book[0];
		}
    	Book[] filterArray = new Book[books.length];
    	for (int i = 0; i < books.length; i++) {
    		for (Author bookAuthor : books[i].authors) {
    			if (author.toString().equals(bookAuthor.toString())) {
    				filterArray[i] = books[i];
    			}
    		}
    	}
    	return Arrays.stream(filterArray).filter(Objects::nonNull).toArray(Book[]::new);
	}

	public Book[] filterBooksByPublisher(Publisher publisher, Book[] books) {
		if (publisher == null || books == null) {
			return new Book[0];
		}
		Book[] filterArray = new Book[books.length];
		for (int i = 0; i < books.length; i++) {
			if (publisher.toString().equals(books[i].publisher.toString())) {
				filterArray[i] = books[i];
			}
		}
    	return Arrays.stream(filterArray).filter(Objects::nonNull).toArray(Book[]::new);
	}

	public Book[] filterBooksAfterSpecifiedYear(int yearFromInclusively, Book[] books) {
		if (books == null) {
			return new Book[0];
		}
		Book[] filterArray = new Book[books.length];
		for (int i = 0; i < books.length; i++) {
			if (books[i].publishingYear >= yearFromInclusively) {
				filterArray[i] = books[i];
			}
		}
    	return Arrays.stream(filterArray).filter(Objects::nonNull).toArray(Book[]::new);
	}
}
