package tnsifc2tcb9.dao;

import tnsifc2tcb9.entity.Course;
import tnsifc2tcb9.entity.Student;

public interface StudentDao {
void addStudent(Student s);
void addCourse(Course c);
void startTransaction();
void endTransaction();

}
