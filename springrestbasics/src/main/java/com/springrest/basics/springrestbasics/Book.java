package com.springrest.basics.springrestbasics;

public class Book {
	String bookId;
	String bookTitle;
	String author;
	
	public Book(String bookId, String bookTitle, String author) {
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

}
