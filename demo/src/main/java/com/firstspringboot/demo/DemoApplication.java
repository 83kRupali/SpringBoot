package com.firstspringboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
	 	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		//var orderService = new OrderService(new PayPalPaymentService());
		//orderService.setPaymentService(new PayPalPaymentService());
		
		var orderService = context.getBean(OrderService.class);
		orderService.placeOrder();
	}
}








