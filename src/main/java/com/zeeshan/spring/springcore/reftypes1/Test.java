package com.zeeshan.spring.springcore.reftypes1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/zeeshan/spring/springcore/reftypes1/reftypesconfig1.xml");
		ShoppingCart shoppingcart = (ShoppingCart) context.getBean("shoppingcart");
		System.out.println(shoppingcart);

	}

}
