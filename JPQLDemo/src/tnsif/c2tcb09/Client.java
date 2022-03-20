package tnsif.c2tcb09;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import tnsif.c2tcb09.entity.Student;
import tnsif.c2tcb09.service.StudentImpl;
import tnsif.c2tcb09.service.StudentService;

public class Client {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
StudentService ss=new StudentImpl();
Student student=new Student();
String datestring="26-05-1999";
SimpleDateFormat format=new SimpleDateFormat("dd-MM-yyyy");
Date date =format.parse(datestring);
student.setUid(101);
student.setName("Akshatha");
student.setTrainer_name("Sanjana");
student.setMarks(90.8f);
//student.setDateofbirth(date);
//ss.addStudent(student);//
System.out.println(ss.getcount());
System.out.println(ss.getStudentbytrainer_name("Sanjana"));
String datestring1="01-01-2000";
String datestring2="01-12-2000";
Date date1 =format.parse(datestring1);
Date date2 =format.parse(datestring2);
System.out.println(ss.getStudentintherangeofdate(date1,date2));
	}
	

}
