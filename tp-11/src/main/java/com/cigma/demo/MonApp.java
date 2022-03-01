package com.cigma.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cigma.demo.Models.Client;

import com.cigma.demo.controllers.ClientController;

public class MonApp {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		ClientController ctr = (ClientController) ctx.getBean("ctrl");
		Client client1 = new Client("Omar");
		Client client2 = new Client("Said");
		Client client3 = new Client("Ahmed");
		// Test1 => save 3 Clients
		/*client1=ctr.save(client1);
		client2=ctr.save(client2);
		client3=ctr.save(client3);
		// Test2 => getAll Clients before modify and remove
		ctr.getAll().stream().forEach(i-> System.out.println(i));
		// Test3 => getOne Client service
		System.out.println(ctr.getOne(1));
		// Test4 => modify Client service
		client1.setName("Hassan");
		ctr.update(client1);
		// Test5 => remove Client service
		//ctr.remove(2);
		// Test getAll Client after modify and remove
		ctr.getAll().stream()
		.forEach(i-> System.out.println(i));*/
	}
}
