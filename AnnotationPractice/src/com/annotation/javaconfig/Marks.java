package com.annotation.javaconfig;



public class Marks {
	int math;
	int physics;
	int chemistry;
	public Marks() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistery(int chemistry) {
		this.chemistry = chemistry;
	}
	@Override
	public String toString() {
		return "Marks [math=" + math + ", physics=" + physics + ", chemistery=" + chemistry + "]";
	}
	

}
