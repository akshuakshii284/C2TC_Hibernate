package tnsif.c2tcb09.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import tnsif.c2tcb09.entity.Book;



public class BookDaoImpl implements BookDao {
EntityManager entityManager;
public BookDaoImpl()
{
	entityManager=Configuration.getEntityManager();
}
@Override
public void startTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().begin();
	
}
@Override
public void addBook(Book book) {
	// TODO Auto-generated method stub
	entityManager.persist(book);
}
@Override
public void endTransaction() {
	// TODO Auto-generated method stub
	entityManager.getTransaction().commit();
}
@Override
public Long getBookCount() {
	// TODO Auto-generated method stub
	String query="Select COUNT(book.id) from Book book";
	TypedQuery<Long> t=entityManager.createQuery(query,Long.class);
	Long count=t.getSingleResult();
	return count;
}
@Override
public Book getBookById(int i) {
	// TODO Auto-generated method stub
	Book book=entityManager.find(Book.class, i);
	return book;
}
@Override
public List<Book> getAllBooks() {
	// TODO Auto-generated method stub
	Query query=entityManager.createNamedQuery("getAllBooks");
	List<Book> list=query.getResultList();
	return list;
}

@Override
public List<Book> getAuthorBooks(String string) {
	// TODO Auto-generated method stub
	String query="Select b from Book b "+ " where b.author like: name";
	TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
	t.setParameter("name","%"+string+"%");
    List<Book> list=t.getResultList();
		return list;

}
@Override
public List<Book> getBookByTitle(String string) {
	// TODO Auto-generated method stub
	String query="Select b from Book b "+ " where b.title like: name";
	TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
	t.setParameter("name","%"+string+"%");
    List<Book> list=t.getResultList();
		return list;
}
@Override
public List<Book> getBooksInPriceRange(double i, double j) {
	// TODO Auto-generated method stub
	String query="Select b from Book b "+ " where b.price between:i and :j";
	TypedQuery<Book> t= entityManager.createQuery(query, Book.class);
	t.setParameter("i",i);
	t.setParameter("j",j);
    List<Book> list=t.getResultList();
	return list;

}

}



