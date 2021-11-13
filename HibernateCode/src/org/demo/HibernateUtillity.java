package org.demo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



public class HibernateUtillity {

	static SessionFactory sessionfactoryobject;
	static Session sessionobject;
	
	public static SessionFactory buildSessionFactory()
	{
		// Creating Configuration object and  Passing Hibernate Configuration File
		
		Configuration config =new Configuration();
		config.configure("hibernate.cfg.xml");
		
		ServiceRegistry serviceRegObject= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		
		
		//create hibernate session factory
		
		sessionfactoryobject=config.buildSessionFactory(serviceRegObject);
		return sessionfactoryobject;
	}
}
