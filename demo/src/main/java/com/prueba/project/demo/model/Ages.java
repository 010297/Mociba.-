package com.prueba.project.demo.model;

public class Ages {
	
	protected int idRank;
	protected String rank;
	protected double percTot,percM,percF;
	
	/*---------- GETTERS AND SETTERS ----------*/
	public int getIdRank() {
		return idRank;
	}
	public void setIdRank(byte idRank) {
		this.idRank = idRank;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
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
	public Ages(int idRank, String rank, double percTot, double percM, double percF) {
		super();
		this.idRank = idRank;
		this.rank = rank;
		this.percTot = percTot;
		this.percM = percM;
		this.percF = percF;
	}
	
	

}
