package com.prueba.project.demo.model;

public class Base {

	protected char gender;
	protected double percentage;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	
	/*---------- CONSTRUCTOR ----------*/
	public Base(char gender, double percentage) {
		super();
		this.gender = gender;
		this.percentage = percentage;
	}
	
	
	
}
