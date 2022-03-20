package tnsif.c2tcb09.service;

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


}



