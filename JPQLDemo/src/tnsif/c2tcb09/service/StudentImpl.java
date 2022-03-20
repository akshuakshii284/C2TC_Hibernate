package tnsif.c2tcb09.service;



import java.util.Date;
import java.util.List;

import tnsif.c2tcb09.dao.StudentDao;
import tnsif.c2tcb09.dao.StudentDaoImpl;
import tnsif.c2tcb09.entity.Student;

public class StudentImpl implements StudentService{
	StudentDao sd;
	 public StudentImpl() {
		// TODO Auto-generated constructor stub
		sd=new StudentDaoImpl();
	}
			
			
	
	@Override
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		sd.startTransaction();
		sd.addStudent(s);
		sd.endTransaction();
	}



	@Override
	public Long getcount() {
		// TODO Auto-generated method stub
		return sd.getcount();
		
	}



	@Override
	public List<Student> getStudentbytrainer_name(String string) {
		// TODO Auto-generated method stub
		List<Student> list=sd.getStudentbytrainer_name(string);
		return list;
	}



	@Override
	public List<Student> getStudentintherangeofdate(Date date1, Date date2) {
		// TODO Auto-generated method stub
		List<Student> list=sd.getStudentintherangeofdate(date1,date2);
		return list;
	}
	

}
