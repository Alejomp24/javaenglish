package com.perezcasallas.learnspringframework.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {

		try (
				// 1: Launch a Spring Context - Queremos lanzar un Spring Context con la clase
				// de Configutation
				var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {

			// 2: Configure the things that we want Sprint to manage -
			// HelloWorldConfiguration - @Configuration Class
			// name - @Bean

			// 3: Retrieving Beans managed by Spring
			// Spring está gestionando un Bean en especifico, en este caso name
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean("person3Parameters"));
			System.out.println(context.getBean(Address.class));

			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
