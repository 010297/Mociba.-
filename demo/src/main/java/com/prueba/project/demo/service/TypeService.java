package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.TypeDAO;
import com.prueba.project.demo.model.Type;

@Service
public class TypeService {

	@Autowired
	TypeDAO ty;
	
	public List<Type> getTypeTable() {
		List<Type>list=new ArrayList<>();
		
		list.add(ty.addTypeTable("A", "SPAM o Virus", 22));
		list.add(ty.addTypeTable("B", "Recibe llamadas", 13.9));
		list.add(ty.addTypeTable("C", "Recibe contenido multimedia", 13.6));
		list.add(ty.addTypeTable("D", "Es contactado con un ID falso", 13.6));
		list.add(ty.addTypeTable("E", "Recibe mensajes", 11.2));
		list.add(ty.addTypeTable("F", "Es registrado en un sitio web", 9.8));
		list.add(ty.addTypeTable("G", "Robo de ID",8.1));
		list.add(ty.addTypeTable("H", "Rastreo de sitios web", 3.9));
		list.add(ty.addTypeTable("I", "Publicación de inf. personal",3.5));
		list.add(ty.addTypeTable("J", "Obligado a dar psw",0.4));
		
		return list;
	}
	
}
