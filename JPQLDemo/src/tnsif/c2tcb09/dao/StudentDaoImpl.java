package tnsif.c2tcb09.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import tnsif.c2tcb09.entity.Student;

public class StudentDaoImpl implements StudentDao{

	EntityManager entityManager;//talk to the database//
	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}
	@Override
	public void addStudent(Student s)
	{   entityManager.persist(s);
	}
	@Override
	public void startTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();
		
	}
	@Override
	public void endTransaction() {
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}
	@Override
	public Long getcount() {
		// TODO Auto-generated method stub
		String query="Select COUNT(s.uid) from Student s";
	TypedQuery<Long> t=entityManager.createQuery(query, Long.class);
	Long count=t.getSingleResult();
	return count;
	}
	@Override
	public List<Student> getStudentbytrainer_name(String string) {
		// TODO Auto-generated method stub
		String query="Select s from Student s "+ " where s.trainer_name like: name";
	TypedQuery<Student> t= entityManager.createQuery(query, Student.class);
	t.setParameter("name","%"+string+"%");
    List<Student> list=t.getResultList();
		return list;
	}
	@Override
	public List<Student> getStudentintherangeofdate(Date date1, Date date2) {
		// TODO Auto-generated method stub
		String query="Select s from Student s "+ " where s.dateofbirth between:date1 and :date2";
		TypedQuery<Student> t= entityManager.createQuery(query, Student.class);
		t.setParameter("date1",date1);
		t.setParameter("date2",date2);
	    List<Student> list=t.getResultList();
		return list;
	}
	
	}


