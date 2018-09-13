package com.prueba.project.demo.model;

public class Identity {

	private int idId;
	private String Identity;
	private double percTot,percM,percF;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public int getIdId() {
		return idId;
	}
	public void setIdId(int idId) {
		this.idId = idId;
	}
	public String getIdentity() {
		return Identity;
	}
	public void setIdentity(String identity) {
		Identity = identity;
	}
	public double getPercTot() {
		return percTot;
	}
	public void setPercTot(double percTot) {
		this.percTot = percTot;
	}
	public double getPercM() {
		return percM;
	}
	public void setPercM(double percM) {
		this.percM = percM;
	}
	public double getPercF() {
		return percF;
	}
	public void setPercF(double percF) {
		this.percF = percF;
	}
	
	/*---------- CONSTRUCTOR ----------*/
	public Identity(int idId, String identity, double percTot, double percM, double percF) {
		super();
		this.idId = idId;
		Identity = identity;
		this.percTot = percTot;
		this.percM = percM;
		this.percF = percF;
	}
	
	
	
}
