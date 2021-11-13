package org.demo2;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static SessionFactory sessionFactoryObj;
	static Session sessionObj;
	
	
	@Override
	public Employee createEmployee(Employee employee) {                         // DONE

		                                                                         
       Transaction tx=null;
		
		
		try {
			sessionObj=HibernateUtility.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			sessionObj.save(employee);   //insert to table 
			tx.commit();
		}
		catch(Exception e)
		{
			if(tx !=null)
			tx.rollback();
			e.printStackTrace();
			
		}
		finally {
			sessionObj.close();
			
		}
		System.out.println("Record isertion is  Done..!!");
		return employee;
		
	}


	@Override
	public Employee updateEmployee(Employee employee) {                         // DONE
		
		
     Transaction tx=null;
		
		
		try {
			sessionObj=HibernateUtility.buildSessionFactory().openSession();
			tx=sessionObj.beginTransaction();
			
			sessionObj.update(employee); 
			
			
			//update to table 
			tx.commit();
		}
		catch(Exception e)
		{
			if(tx !=null)
			tx.rollback();
			e.printStackTrace();
			
		}
		finally {
			sessionObj.close();
			
		}
		System.out.println("Updation is Done..!!");
		return employee;
		
	}


	


	@Override
	public Employee viewEmployee(Employee employee, String id ) {                      //PENDING
		
		 Transaction tx=null;
			
			
			try {
				sessionObj=HibernateUtility.buildSessionFactory().openSession();
				tx=sessionObj.beginTransaction();
				
				Employee emp=(Employee) sessionObj.load(Employee.class, id );
				
				System.out.println(emp);
				tx.commit();
			}
			catch(Exception e)
			{
				if(tx !=null)
				tx.rollback();
				e.printStackTrace();
				
			}
			finally {
				sessionObj.close();
				
			}
			return employee;
			
		
		
	}


	@Override
	public List<Employee> viewAllEmployee(Employee employee) {            //  PENDING
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Employee removeEmployee(Employee employee) {                                // DONE
		
		
	     Transaction tx=null;
			
			
			try {
				sessionObj=HibernateUtility.buildSessionFactory().openSession();
				tx=sessionObj.beginTransaction();
				
				sessionObj.delete(employee);   //delete 
				tx.commit();
			}
			catch(Exception e)
			{
				if(tx !=null)
				tx.rollback();
				e.printStackTrace();
				
			}
			finally {
				sessionObj.close();
				
			}
			System.out.println("Updation is Done..!!");
			return employee;
			
		
		
	}
	
	
}
