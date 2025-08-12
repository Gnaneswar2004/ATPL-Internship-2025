package com.aaslin.SpringCore.SetterInjection;

public class Library {

	private Book book;

	public Library() {
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	public void show() {
		System.out.println("Library has books.");
		book.display();
	}
}