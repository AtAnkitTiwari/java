package com.annotation.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.annotation.practice.Marks;

@Configuration
public class javaconfig {
@Bean
	public Student getstudent() {
		return new Student();
}	
@Bean
public Marks getmark() {
	
	return new Marks();
}
}
