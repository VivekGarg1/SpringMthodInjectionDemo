package com.home.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.ATM;
import com.home.model.Ticket;
import com.home.model.TicketVendingMachine;

public class ClientTest {
	
	public static void main(String[] args) {
		
		//AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeansUsingFactoryMethod.xml");
		 
		/*
		 * TicketVendingMachine
		 * ticketVendingMachine=context.getBean("ticketVendingMachine",
		 * TicketVendingMachine.class); Ticket ticket =
		 * ticketVendingMachine.generateTicket();
		 * System.out.println(ticket.printTicket());
		 */
		
		ATM atm = context.getBean("atm", ATM.class);
		atm.printBalanceInformation("123456789");
		 context.close();
	}

}
