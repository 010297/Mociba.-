package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.IdentityDAO;
import com.prueba.project.demo.model.Identity;

@Service
public class IdentityService {

	@Autowired
	IdentityDAO id;
	
	public List<Identity>getIdentityTable() {
		List<Identity>list=new ArrayList<>();
		
		list.add(id.addIdentityTable(1,"Familiar", 1.6,0.9,2.3));
		list.add(id.addIdentityTable(2, "Pareja o ex-pareja", 2.1, 2.0, 2.2));
		list.add(id.addIdentityTable(3, "Compañero (Trabajo o colegio)",3.7,3.0,4.5));
		list.add(id.addIdentityTable(4, "Amigo",6.3,6.6,5.9));
		list.add(id.addIdentityTable(5, "Conocido", 10.2, 9.3, 11.1));
		list.add(id.addIdentityTable(6, "Desconocido", 87.7, 89.0, 86.3));
	
		return list;
	}
	
}
