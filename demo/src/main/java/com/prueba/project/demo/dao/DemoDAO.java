package com.prueba.project.demo.dao;

import org.springframework.stereotype.Repository;

import com.prueba.project.demo.model.User;

@Repository
public class DemoDAO {

	public User getUser1() {
		return new User("Juan","Ortiz","Ramirez",22,"Cliente");
	}
	
	public User getUser2() {
		return new User("Lorena","Perez","Sandoval",29,"Admin");
	}
	
	public User getUser3() {
		return new User("Damian","Quevedo","Carrera",39,"Cliente");
	}
	
	public User addUser(String name, String appat, String apmat, int age, String tipo) {
		return new User(name, appat, apmat, age, tipo);
	}
}
