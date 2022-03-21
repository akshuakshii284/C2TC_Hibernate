package tnsif.c2tcb09.dao;

import java.util.Date;
import java.util.List;

import tnsif.c2tcb09.entity.Student;

public interface StudentDao {
	void addStudent(Student s);

	void startTransaction();
	void endTransaction();

	Long getcount();

	List<Student> getStudentbytrainer_name(String string);

	

	List<Student> getStudentintherangeofdate(Date date1, Date date2);

	List<Student> getAllStudents();

}
