package com.itc.springAop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

public static void main(String[] args) {
	ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);
	Student s1= factory.getBean(Student.class);
	s1.show();
	
}	
}
