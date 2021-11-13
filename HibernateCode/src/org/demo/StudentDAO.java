package org.demo;

import java.util.List;

public interface StudentDAO {

	//insert 
	public Student createStudent(Student student);
	
	//update
	public Student updateStudent(Student student);
	
	//view
	public Student viewStudent(Student student);
	
	//viewAll
	public List<Student> viewAll(Student student);
	
	
	//remove
	public Student deleteRecord(Student student);
}
