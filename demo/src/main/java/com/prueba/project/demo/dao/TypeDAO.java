package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Type;

@Repository
public class TypeDAO {

	public Type addTypeTable(String idType, String type, double percent) {
		return new Type(idType,type,percent);
	}
	
}
