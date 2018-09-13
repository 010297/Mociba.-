package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Scship;

@Repository
public class ScshipDAO {
	
	public Scship addScshipTable(int idLvl, String level, double percTot, double percM, double percF) {
		return new Scship(idLvl,level,percTot,percM,percF);
	}
	
}
