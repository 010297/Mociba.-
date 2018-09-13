package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.Base;

@Repository
public class BaseDAO {

	public Base addBaseTable(char gender, double percentage){
		return new Base(gender,percentage);
	}
}
