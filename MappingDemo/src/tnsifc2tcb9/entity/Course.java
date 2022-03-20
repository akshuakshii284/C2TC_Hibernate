package tnsifc2tcb9.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
@Entity
public class Course {
	@Id
private int cid;
private String cname;
@ManyToOne
private Student student;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}

}
