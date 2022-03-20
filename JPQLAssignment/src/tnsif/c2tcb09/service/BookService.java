package tnsif.c2tcb09.service;

import tnsif.c2tcb09.entity.Book;

public interface BookService {

	void addBook(Book book);

	Long getBookCount();

	
}
