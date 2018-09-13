package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.TecUse;

@Repository
public class TecUseDAO {

	public TecUse addTecUseTable(String freq, double percent) {
		return new TecUse(freq,percent);
	}
	
}
