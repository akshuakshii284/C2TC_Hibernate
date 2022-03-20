package tnsif.c2tcb09.dao;

import javax.persistence.EntityManager;
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


}
