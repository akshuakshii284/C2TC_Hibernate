package tnsifc2tcb9service;

import tnsifc2tcb9.dao.StudentDao;
import tnsifc2tcb9.dao.StudentDaoImpl;
import tnsifc2tcb9.entity.Course;
import tnsifc2tcb9.entity.Student;

public class StudentServiceImpl implements StudentService {

	StudentDao sd;
	public StudentServiceImpl() {
// TODO Auto-generated constructor stub
		sd=new StudentDaoImpl();
	}
	@Override
	public void addCourse(Course c) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addCourse(c);
		sd.endTransaction();
		
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addStudent(student);
		sd.endTransaction();
		

	}

}
