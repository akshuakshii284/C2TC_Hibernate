package tnsifc2tcb9;

import tnsifc2tcb9.entity.Course;
import tnsifc2tcb9.entity.Student;
import tnsifc2tcb9service.StudentService;
import tnsifc2tcb9service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService ss=new  StudentServiceImpl();
		Student student=new Student();
		Course c1=new Course();
		Course c2=new Course();
		student.setUid(2100);
		student.setName("Radha");
		student.setAge(24);
		c1.setCid(1);
		c1.setCname("technical");
		c2.setCid(2);
		c2.setCname("softskill");
		student.getCourses().add(c1);
		student.getCourses().add(c2);
		ss.addCourse(c1);
		ss.addCourse(c2);
		ss.addStudent(student);

	}

}
