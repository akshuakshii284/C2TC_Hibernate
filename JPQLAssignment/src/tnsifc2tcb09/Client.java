package tnsifc2tcb09;

import tnsif.c2tcb09.entity.Book;
import tnsif.c2tcb09.service.BookService;
import tnsif.c2tcb09.service.BookServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookService service=new BookServiceImpl();
		Book book=new Book();
		book.setId(2);
		book.setTitle("Wings of fire");
		book.setAuthor("A.P.J");
		book.setPrice(100.0);
		//bs.addBook(book);
		System.out.println("************Listing total number of books*************");
		System.out.println("Total books:"+service.getBookCount());
		System.out.println("************Listing book with id 105*************");
		//System.out.println("Book with ID 106:"+service.getBookById(105));
		

	}

}
