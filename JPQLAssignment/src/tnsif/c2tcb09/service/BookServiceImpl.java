package tnsif.c2tcb09.service;

import java.util.List;

import tnsif.c2tcb09.dao.BookDao;
import tnsif.c2tcb09.dao.BookDaoImpl;
import tnsif.c2tcb09.entity.Book;

public class BookServiceImpl implements BookService{
 BookDao  bd;
public BookServiceImpl()
{
	bd=new BookDaoImpl();
	
}
@Override
public void addBook(Book book) {
	// TODO Auto-generated method stub
	bd.startTransaction();
	bd.addBook(book);
	bd.endTransaction();
}
@Override
public Long getBookCount() {
	// TODO Auto-generated method stub
	
	return bd.getBookCount();
}
@Override
public Book getBookById(int i) {
	// TODO Auto-generated method stub
	Book book=bd.getBookById(i);
	return book;
}
@Override
public List<Book> getAllBooks() {
	// TODO Auto-generated method stub
	List<Book> list=bd.getAllBooks();
	return list;
}
@Override
public List<Book> getAuthorBooks(String string) {
	// TODO Auto-generated method stub
	List<Book>list=bd.getAuthorBooks(string);
	return list;
}
@Override
public List<Book> getBookByTitle(String string) {
	// TODO Auto-generated method stub
	List<Book> list=bd.getBookByTitle(string);
	return list;
}
@Override
public List<Book> getBooksInPriceRange(double i, double j) {
	// TODO Auto-generated method stub
	List<Book> list=bd. getBooksInPriceRange( i,  j);
	return list;
}


}



