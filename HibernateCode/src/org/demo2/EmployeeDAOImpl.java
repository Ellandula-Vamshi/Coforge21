package org.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAOImpl implements EmployeeDAO{
	
	static SessionFactory sessionfactoryObject;
	static Session sessionObj;

	@Override
	public Employee createEmployee(Employee employee) {
		
		
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
		return employee;
		
		
	}

}
