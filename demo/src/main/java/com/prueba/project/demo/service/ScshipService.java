package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.ScshipDAO;
import com.prueba.project.demo.model.Scship;

@Service
public class ScshipService {

	@Autowired
	ScshipDAO sc;
	
	public List<Scship> getScshipTable() {
		List<Scship>list=new ArrayList<>();
		
		list.add(sc.addScshipTable(1, "Sin escolaridad", 8.3,6.0,10.0));
		list.add(sc.addScshipTable(2, "Basico", 17.7, 17.9, 17.5));
		list.add(sc.addScshipTable(3, "Medio-Superior",28.5,42.6,26.0));
		list.add(sc.addScshipTable(4, "Superior", 39.1, 42.6, 35.7));
		
		return list;
		
	}
}
