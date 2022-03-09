package com.annotation.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"config.xml");
		Student student = (Student) context.getBean("student");
		System.out.println(student);
		System.out.println("Math Mark-" + student.getMark().getMath()
				+ ",Physics Mark- " + student.getMark().getPhysics()
				+ ",Chemistry Mark- " + student.getMark().getChemistry());
	}
}
