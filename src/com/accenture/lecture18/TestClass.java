package com.accenture.lecture18;

public class TestClass {

	public static void main(String[] args) {
		Author author = new Author("Janis Jonevs", "janis@gmail.com", 'm');
		System.out.println(author);
		Book book = new Book("Jelgava 94", author, 20.5);
		System.out.println(book);

		Author author2 = new Author("Charles Bukowsi", "bukowski@gmail.com",
				'm');
		System.out.println(author2);
		Book book2 = new Book("Hollywood", author2, 12.13, 10);
		System.out.println(book2);

		Author author3 = new Author("Ilze Klavina", "ilze@ilze.lv", 'f');
		System.out.println(author3);
		Book book3 = new Book("Kaut kas", author3, 10.15, 4);
		System.out.println(book3);

	}

}
