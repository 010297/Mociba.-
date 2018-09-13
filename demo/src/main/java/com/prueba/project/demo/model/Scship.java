package com.prueba.project.demo.model;

public class Scship {

	protected int idLvl;
	protected String level;
	protected double percTot,percM,percF;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public int getIdLvl() {
		return idLvl;
	}
	public void setIdLvl(int idLvl) {
		this.idLvl = idLvl;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
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
	public Scship(int idLvl, String level, double percTot, double percM, double percF) {
		super();
		this.idLvl = idLvl;
		this.level = level;
		this.percTot = percTot;
		this.percM = percM;
		this.percF = percF;
	}
	
	
	
}
