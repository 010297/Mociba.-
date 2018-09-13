package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.TecUseDAO;
import com.prueba.project.demo.model.TecUse;

@Service
public class TecUseService {

	@Autowired
	TecUseDAO tu;
	
	public List<TecUse> getTecUseTable(){
		List<TecUse>list=new ArrayList<>();
		
		list.add(tu.addTecUseTable("1 Tipo",55.5));
		list.add(tu.addTecUseTable("2 Tipos",22.6));
		list.add(tu.addTecUseTable("3 Tipos",10.8));
		list.add(tu.addTecUseTable("4 Tipos",6.1));
		list.add(tu.addTecUseTable("5 Tipos o más",5.1));
		
		return list;
	}
	
}
