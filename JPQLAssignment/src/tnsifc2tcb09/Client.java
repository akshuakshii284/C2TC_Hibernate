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
		System.out.println("Book with ID 105:"+service.getBookById(105));
		System.out.println("************Listing All books*************");
		for(Book b:service.getAllBooks()) {
			System.out.println(b);
		}
		System.out.println("************Listing book written by Danny Coward*************");
		for(Book b:service.getAuthorBooks("Danny Coward") ) {
			System.out.println(b);
		}
	System.out.println("************Listing book on Android*************");
		for(Book b:service.getBookByTitle("Android")) {
			System.out.println(b);
		}
		System.out.println("************Listing All books between 500 and 600*************");
		for(Book b:service.getBooksInPriceRange(500, 600) ) {
			System.out.println(b);
		}
		

	}

}

