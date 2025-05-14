package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
//		AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		Greeting greeting1 = (Greeting)context.getBean("greeting");
//		System.out.println("Hello "+greeting1.getName());
//		greeting1.setName("TCSer");
//		Greeting greeting2 = (Greeting)context.getBean("greeting");
//		System.out.println("Hello "+greeting1.getName());
//		System.out.println("Hello "+greeting2.getName());
//		context.registerShutdownHook();
//		TextEditor textEditor=(TextEditor)context.getBean("TextEditor");
//		textEditor.spellCheck();
//		javaCollection jc = (javaCollection)context.getBean("jCollection");	
//		jc.getAddressList();
//		jc.getAddressSet();
//		jc.getAddressMap();
//		jc.getAddressProp();
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		TextEditor textEditor=(TextEditor)context.getBean(TextEditor.class);
		textEditor.spellCheck();
		System.out.println("End");
		
	}
}