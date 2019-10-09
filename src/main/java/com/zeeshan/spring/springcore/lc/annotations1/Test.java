package com.zeeshan.spring.springcore.lc.annotations1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/zeeshan/spring/springcore/lc/annotations1/reftypesconfig.xml");
	TicketReservation ticketreservation = (TicketReservation) context.getBean("ticketreservation");
		System.out.println(ticketreservation);
		context.registerShutdownHook();

	}

}
