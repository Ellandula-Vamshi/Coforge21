package org.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SampleMessageMain {

	public static void main(String[] args) {

		Resource resource =new ClassPathResource("Bean.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		SampleMessage message=(SampleMessage) factory.getBean("bean");
		
		System.out.println(message.getMessage());
		
		message.show();
		
	}

}
