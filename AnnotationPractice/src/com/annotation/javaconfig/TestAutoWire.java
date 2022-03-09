package com.annotation.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				"javaconfig");
	
		Student student=(Student) context.getBean(Student.class);
		System.out.println(student);
		System.out.println("Math Mark-" + student.getMark().getMath()
				+ ",Physics Mark- " + student.getMark().getPhysics()
				+ ",Chemistry Mark- " + student.getMark().getChemistry());
	}
}
