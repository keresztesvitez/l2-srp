package com.epam.training;

import java.util.List;

public class Application {

	private BookDao dao;

	public Application() {
		dao = new BookDao();
	}
	
	public void start() {
		List<Book> books = dao.getBooks();
		System.out.println(books);
	}

	public static void main(String[] args) {
		new Application().start();
	}
}
