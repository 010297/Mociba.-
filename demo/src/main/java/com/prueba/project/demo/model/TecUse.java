package com.prueba.project.demo.model;

public class TecUse {
	
	protected String freq;
	protected double percent;
	
	/*---------- GETTERS AND SETTERS ----------*/
	
	public String getFreq() {
		return freq;
	}
	public void setFreq(String freq) {
		this.freq = freq;
	}
	public double getPercent() {
		return percent;
	}
	public void setPercent(double percent) {
		this.percent = percent;
	}
	
	public TecUse(String freq, double percent) {
		super();
		this.freq = freq;
		this.percent = percent;
	}
	
	
	
}
