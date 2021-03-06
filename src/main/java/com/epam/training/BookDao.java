package com.epam.training;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

  public List<Book> getBooks() {
      List<Book> books = new ArrayList<Book>();
      Book book = createBook();
      books.add(book);
      return books;
  }

    private Book createBook() {
        Book book = new Book();
        book.setTitle("Introduction to the Theory of Programming Languages and Touch of Class");
        book.setAuthor("Bertrand Meyer", "French academic, author, and consultant in the field of computer languages");
        book.setDescription("This book is an excellent reference for understanding how to architect a language");
        book.setYearOfPublication(1990);
        return book;
    }
}
