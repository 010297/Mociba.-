package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Identity;

@Repository
public class IdentityDAO {

	public Identity addIdentityTable(int idId, String identity, double percTot, double percM, double percF) {
		return new Identity(idId, identity, percTot, percM, percF);
	}
	
}
