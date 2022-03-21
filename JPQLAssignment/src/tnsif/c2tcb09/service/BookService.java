package tnsif.c2tcb09.service;

import java.util.List;

import tnsif.c2tcb09.entity.Book;

public interface BookService {

	void addBook(Book book);

	Long getBookCount();

	Book getBookById(int i);

    List<Book> getAllBooks();

	List<Book> getAuthorBooks(String string);

	List<Book>  getBookByTitle(String string);

       List<Book> getBooksInPriceRange(double i, double j);

	
}
