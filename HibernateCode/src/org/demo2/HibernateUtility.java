package org.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtility {

	static SessionFactory sessionfactoryObj;
	static Session sessionObj;
	
	public static SessionFactory buildSessionFactory()
	{
		//Instance of the configuration file
		Configuration config=new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		
		
	   ServiceRegistry serviceregistryObj=new StandardServiceRegistryBuilder().applySettings( config.getProperties()).build();
	   
	   //instance of sessionfactory
	   sessionfactoryObj=config.buildSessionFactory(serviceregistryObj);
	   return sessionfactoryObj;
	   
	   
	}
}
