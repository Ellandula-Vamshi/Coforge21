package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopMain {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Laptop laptop=(Laptop) context.getBean("laptop");
		
		System.out.println(laptop);
	}

}
