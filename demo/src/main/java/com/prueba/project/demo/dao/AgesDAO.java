package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Ages;

@Repository
public class AgesDAO {

	public Ages addAgesTable(int idRank, String rank, double percTot, double percM, double percF) {
		return new Ages(idRank,rank,percTot,percM,percF);
	}
	
}
