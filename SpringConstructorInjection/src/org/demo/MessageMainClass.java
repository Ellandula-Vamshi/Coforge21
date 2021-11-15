package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MessageMainClass {

	public static void main(String[] args) {


		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");

		ElementMessage mes = (ElementMessage) context.getBean("eleMess");

		mes.show();

	}

}
