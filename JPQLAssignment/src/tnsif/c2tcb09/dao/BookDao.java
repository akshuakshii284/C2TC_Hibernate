package tnsif.c2tcb09.dao;

import tnsif.c2tcb09.entity.Book;

public interface BookDao {

	void startTransaction();

	void addBook(Book book);

	void endTransaction();

	Long getBookCount();



}
