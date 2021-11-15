package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Message message=(Message) context.getBean("message");
		
		System.out.println(message);
		
		message.show();
		
		
	}

}
