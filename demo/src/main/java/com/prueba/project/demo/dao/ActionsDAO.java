package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Actions;

@Repository
public class ActionsDAO {

	public Actions addTableActions(int idAct, String action, double percTot) {
		return new Actions(idAct,action,percTot);
	}
}
