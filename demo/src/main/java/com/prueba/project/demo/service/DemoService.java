package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.DemoDAO;
import com.prueba.project.demo.model.User;

@Service
public class DemoService {

	@Autowired
	DemoDAO a;
	
	public User getUserService() {
		return a.getUser3();
	}
	
	public List<User> getAllUsers(){
		List<User> list = new ArrayList<>();

		list.add(a.addUser("A","V","C",11,"Niño"));
		list.add(a.getUser1());
		list.add(a.getUser2());
		list.add(a.getUser3());
		
		return list;
	}
}
