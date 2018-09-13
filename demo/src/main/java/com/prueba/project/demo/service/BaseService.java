package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.BaseDAO;
import com.prueba.project.demo.model.Base;

@Service
public class BaseService {
	
	@Autowired
	BaseDAO b;
	
	public List<Base> getBaseTable(){
		List<Base>list=new ArrayList<>();
		
		list.add(b.addBaseTable('M',47.8));
		list.add(b.addBaseTable('F',52.3));
		
		return list;
	}
}
