package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		Message message1=(Message) context.getBean("ms");
		
		Message message2=(Message) context.getBean("ms");

		Message message3=(Message) context.getBean("ms");


		message1.setMessage("I am bean One");
		System.out.println(message1.getMessage());
		System.out.println(message1);

		
		message2.setMessage("I am bean Two");
		System.out.println(message2.getMessage());
		System.out.println(message2);

		
		message3.setMessage("I am bean Three");
		System.out.println(message3.getMessage());
		System.out.println(message3);

	}

}
