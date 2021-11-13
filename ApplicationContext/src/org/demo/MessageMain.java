package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMain {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Message mes=(Message) context.getBean("messageservice");
		
		System.out.println(mes.getMessage());
		
		mes.show();
		
	}

}
