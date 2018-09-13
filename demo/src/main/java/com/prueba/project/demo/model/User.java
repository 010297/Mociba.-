package com.prueba.project.demo.model;

public class User {

	protected String name;
	protected String appat;
	protected String apmat;
	protected int age;
	protected String tipo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getAppat() {
		return appat;
	}
	public void setAppat(String appat) {
		this.appat = appat;
	}
	public String getApmat() {
		return apmat;
	}
	public void setApmat(String apmat) {
		this.apmat = apmat;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public User(String name, String appat, String apmat, int age, String tipo) {
		super();
		this.name = name;
		this.appat = appat;
		this.apmat = apmat;
		this.age = age;
		this.tipo = tipo;
	}
	
	 
	
}
