package com.zeeshan.spring.springcore.propertiesassignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/zeeshan/spring/springcore/propertiesassignment/config.xml");
	webServer Webserver	=(webServer) context.getBean("Webserver");
	System.out.println(Webserver);
		
		
	}

}
