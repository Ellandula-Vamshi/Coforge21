package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringContextMain {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		SpringCollections collection=(SpringCollections) context.getBean("sc");
		
		System.out.println(collection.getFruits());
		System.out.println(collection.getAnimals());
		System.out.println(collection.getEmpDetails());
		System.out.println(collection.getIntegers());

	}
}
