/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
abstract class Book {
	// Encapsulation 
	//declaring the private fields 
	private String bookName;
	private int bookId;
	private double price;
	private String genre;
	private String author;
	private int issuePeriod;

	public Book(String bookName, int bookId, double price, String genre, String author, int issuePeriod) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.price = price;
		this.genre = genre;
		this.author = author;
		this.issuePeriod = issuePeriod;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIssuePeriod() {
		return issuePeriod;
	}

	public void setIssuePeriod(int issuePeriod) {
		this.issuePeriod = issuePeriod;
	}

	public abstract void Print();// abstract method
}

//Inheritance
class Book1 extends Book {
	private String pages;

	public Book1(String bookName, int bookId, double price, String genre, String author, int issuePeriod,
			String pages) {
		super(bookName, bookId, price, genre, author, issuePeriod); // Calling superclass constructor
		this.pages = pages;
	}

	public String getPages() {
		return pages;
	}

	public void setPages(String pages) {
		this.pages = pages;
	}

	@Override
	// Polymorphism
	public void Print() {
		System.out.println("Book name " + getBookName() + ", Book ID: " + getBookId() + ", Price: " + getPrice()
				+ ", Genre: " + getGenre() + ", Author: " + getAuthor() + ", Issue Period: " + getIssuePeriod()
				+ " No. of pages " + pages);

	}
}

class Book2 extends Book {
	private String subject;

	public Book2(String bookName, int bookId, double price, String genre, String author, int issuePeriod,
			String subject) {
		super(bookName, bookId, price, genre, author, issuePeriod);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public void Print() {
		System.out.println("Non-Fiction Book: " + getBookName() + ", Book ID: " + getBookId() + ", Price: " + getPrice()
				+ ", Genre: " + getGenre() + ", Author: " + getAuthor() + ", Issue Period: " + getIssuePeriod()
				+ " days, Subject: " + subject);
	}
}

public class Library {

	public static void main(String[] args) {

		Book Book1 = new Book1("Mathematics", 101, 150.00, "Education", "Various Authors", 30, "Textbook");
		Book Book2 = new Book1("Physics ", 102, 180.00, "Education", "Various Authors", 45, "Textbook");

		Book Book3 = new Book2("Quantum Mechanics", 201, 500.00, "Non-Fiction", "David J. Griffiths", 60, "Physics");
		Book Book4 = new Book2("Calculus", 202, 350.00, "Non-Fiction", "James Stewart", 40, "Mathematics");

		Book1.Print();
		Book2.Print();
		Book3.Print();
		Book4.Print();


	}

}

