package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClient {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Message message1=(Message) context.getBean("mss");
		
		Message message2=(Message)context.getBean("mss");
		
		message1.setMessage("a bean ");
		
		message2.setMessage(" a duplicate message");
		
		System.out.println("I am "+message1);
		
		System.out.println("I am "+message2);
		
		message1.show();
	}

}
