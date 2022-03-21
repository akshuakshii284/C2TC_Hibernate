package tnsif.c2tcb09.dao;

import java.util.List;

import tnsif.c2tcb09.entity.Book;

public interface BookDao {

	void startTransaction();

	void addBook(Book book);

	void endTransaction();

	Long getBookCount();

	Book getBookById(int i);

	List<Book> getAllBooks();

	List<Book> getAuthorBooks(String string);

	List<Book> getBookByTitle(String string);

	List<Book> getBooksInPriceRange(double i, double j);

	



}
