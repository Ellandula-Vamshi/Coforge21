package org.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAOImpl implements StudentDAO{
	
	static SessionFactory sessionfactoryObj;
	static Session sessionobj;
	
	
	@Override
	public Student createStudent(Student student) {
		
		Transaction tx=null;

	try {
		
			sessionobj=HibernateUtillity.buildSessionFactory().openSession();
			tx=sessionobj.beginTransaction();
			sessionobj.save(student);
			tx.commit();
		
		
	}
	catch(Exception e)
	
	{
		if(tx!=null)
			tx.rollback();
	 e.fillInStackTrace();
	 
	}
	finally {
		sessionobj.close();
		
	}
		
		return student;
	}


	@Override
	public Student updateStudent(Student student) {
		
		Transaction tx=null;

		try {
			
				sessionobj=HibernateUtillity.buildSessionFactory().openSession();
				tx=sessionobj.beginTransaction();
				sessionobj.update(student);
				tx.commit();
			
			
		}
		catch(Exception e)
		
		{
			if(tx!=null)
				tx.rollback();
		 e.fillInStackTrace();
		 
		}
		finally {
			sessionobj.close();
			
		}
			
			return student;
		
	}


	@Override
	public Student viewStudent(Student student) {
		
		Transaction tx=null;

		try {
			
				sessionobj=HibernateUtillity.buildSessionFactory().openSession();
				tx=sessionobj.beginTransaction();
				sessionobj.load(getClass(), sessionfactoryObj);
				System.out.println();
				tx.commit();
			
			
		}
		catch(Exception e)
		
		{
			if(tx!=null)
				tx.rollback();
		 e.fillInStackTrace();
		 
		}
		finally {
			sessionobj.close();
			
		}
			
			return student;
		
		
	}


	@Override
	public List<Student> viewAll(Student student) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Student deleteRecord(Student student) {
		
		Transaction tx=null;

		try {
			
				sessionobj=HibernateUtillity.buildSessionFactory().openSession();
				tx=sessionobj.beginTransaction();
				sessionobj.delete(student);
				tx.commit();
			
			
		}
		catch(Exception e)
		
		{
			if(tx!=null)
				tx.rollback();
		 e.fillInStackTrace();
		 
		}
		finally {
			sessionobj.close();
			
		}
			
		System.out.println("Record deleted successfully..!!");
			return student;
		
		
	}

}
