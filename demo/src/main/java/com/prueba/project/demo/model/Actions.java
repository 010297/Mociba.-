package com.prueba.project.demo.model;

public class Actions {

	private int idAct;
	private String action;
	private double percTot;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public int getIdAct() {
		return idAct;
	}
	public void setIdAct(int idAct) {
		this.idAct = idAct;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public double getPercTot() {
		return percTot;
	}
	public void setPercTot(double percTot) {
		this.percTot = percTot;
	}
	
	/*---------- CONSTRUCTOR ----------*/
	public Actions(int idAct, String action, double percTot) {
		super();
		this.idAct = idAct;
		this.action = action;
		this.percTot = percTot;
	}
	
	
	
}
