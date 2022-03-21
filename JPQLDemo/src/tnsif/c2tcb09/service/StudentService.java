package tnsif.c2tcb09.service;

import java.util.Date;
import java.util.List;

import tnsif.c2tcb09.entity.Student;

public interface StudentService {
public void addStudent(Student s);

public Long getcount();

public List<Student>getStudentbytrainer_name(String string);

public List<Student> getStudentintherangeofdate(Date date1, Date date2);

public List<Student> getAllStudents();
}
