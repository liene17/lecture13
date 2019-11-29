package com.accenture.lecture18;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty = 3;

	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;

	}

	public Book(String name, Author author, double price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book name = " + name + ", " + author + ", price = " + price
				+ " eur " + ", qty = " + qty + "";
	}

}
