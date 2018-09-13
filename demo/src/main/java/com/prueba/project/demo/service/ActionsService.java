package com.prueba.project.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.project.demo.dao.ActionsDAO;
import com.prueba.project.demo.model.Actions;

@Service
public class ActionsService {

	@Autowired
	ActionsDAO ac;
	
	public List<Actions> getActionsTable() {
		List<Actions>list=new ArrayList<>();
		
		list.add(ac.addTableActions(1, "Bloquear", 26.3));
		list.add(ac.addTableActions(2, "Ignorar situación",26.3));
		list.add(ac.addTableActions(3, "Cambiar o cancelar cuenta o núm. tel.", 13.9));
		list.add(ac.addTableActions(4, "No responder",11.3));
		list.add(ac.addTableActions(5, "Informar a 3a persona",8.4));
		list.add(ac.addTableActions(6, "Confrontar",5.6));
		list.add(ac.addTableActions(7, "Denunciar ante una autoridad", 4.0));
		list.add(ac.addTableActions(8, "Otra",4.2));
		
		return list;
	}
}
