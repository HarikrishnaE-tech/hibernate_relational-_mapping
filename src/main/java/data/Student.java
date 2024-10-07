package data;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
 private int stdid;
 private String stdname;
@ManyToOne
 Course course;
public int getStdid() {
	return stdid;
}
public void setStdid(int stdid) {
	this.stdid = stdid;
}
public String getStdname() {
	return stdname;
}
public void setStdname(String stdname) {
	this.stdname = stdname;
}
public Course getCourse() {
	return course;
}
public void setCourse(Course course) {
	this.course = course;
}
public Student(int stdid, String stdname, Course course) {
	super();
	this.stdid = stdid;
	this.stdname = stdname;
	this.course = course;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [stdid=" + stdid + ", stdname=" + stdname + ", course=" + course + "]";
}



}
