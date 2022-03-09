package com.annotation.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;


public class Student {
    private String name;
    
	private Marks mark;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, Marks mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Marks getMark() {
		return mark;
	}
	public void setMark(Marks mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + "]";
	}
	
}
