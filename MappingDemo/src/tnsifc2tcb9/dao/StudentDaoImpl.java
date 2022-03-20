package tnsifc2tcb9.dao;

import javax.persistence.EntityManager;

import tnsifc2tcb9.entity.Course;
import tnsifc2tcb9.entity.Student;

public class StudentDaoImpl implements StudentDao {

	EntityManager entityManager;
	public StudentDaoImpl()
	{
		entityManager=Configuration.getEntityManager();
	}
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		entityManager.persist(s);
		
	}
	@Override
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		entityManager.persist(c);
		
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
	  
}
