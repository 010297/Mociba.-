package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.AgesDAO;
import com.prueba.project.demo.model.Ages;

@Service

public class AgesService {

	@Autowired
	AgesDAO ag;
	
	public List<Ages>getAgesTable(){
		List<Ages>list=new ArrayList<>();
		
		list.add(ag.addAgesTable(1,"12-19",26.7,25.4,28.1));
		list.add(ag.addAgesTable(2, "20-29", 32.3, 34.8, 30.0));
		list.add(ag.addAgesTable(3, "30-49", 22.6, 24.7, 20.8));
		list.add(ag.addAgesTable(4, "50 y más", 10, 11.1, 9));
		
		return list;
		
	}
	
}
