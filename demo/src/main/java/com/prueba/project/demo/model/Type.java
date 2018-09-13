package com.prueba.project.demo.model;

public class Type {
	
	private String idType;
	private String type;
	private double percent;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	/*---------- CONSTRUCTOR ----------*/
	public Type(String idType, String type, double percent) {
		super();
		this.idType = idType;
		this.type = type;
		this.percent = percent;
	}
	
	

}
