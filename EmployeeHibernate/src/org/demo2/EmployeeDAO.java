package org.demo2;

import java.util.List;

public interface EmployeeDAO {

	//create
	public Employee createEmployee(Employee employee);

	
	//update
	public Employee updateEmployee(Employee employee);
	
	//fetch
	public Employee viewEmployee(Employee employee, String id);
	
	//fetchAll
	public List<Employee> viewAllEmployee(Employee employee);
	
	
	//remove
	public Employee removeEmployee(Employee employee);
	
}
