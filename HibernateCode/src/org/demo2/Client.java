package org.demo2;



public class Client {

	public static void main(String[] args) {

		
		EmployeeDAOImpl empdl=new EmployeeDAOImpl();
		
		Employee emp=new  Employee();
		emp.setId(101);
		emp.setName("Babu");
		emp.setSal("30000");
		
		empdl.createEmployee(emp);
		
		System.out.println("Employee record is Done..!!");
	}

}
