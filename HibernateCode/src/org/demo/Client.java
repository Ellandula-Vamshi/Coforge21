package org.demo;

public class Client {

	public static void main(String[] args) {
		
		
		StudentDAOImpl stdl=new StudentDAOImpl();
		Student std=new Student();
		
		//insert
		std.setId(2);
		
		
		stdl.viewStudent(std);
		
		
		
		
	}
}
