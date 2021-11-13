package org.demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtility {

	static SessionFactory sessionfactoryObj;
	static Session sessionObj;
	
	public  static SessionFactory buildSessionFactory()
	{
		Configuration config =new Configuration();
		
		config.configure("hibernate.cfg.xml");
		
		ServiceRegistry serviceRegistryobj = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
				
		sessionfactoryObj = config.buildSessionFactory(serviceRegistryobj);
		return sessionfactoryObj;
		
	}
}
