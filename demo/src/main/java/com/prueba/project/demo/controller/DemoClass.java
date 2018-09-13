package com.prueba.project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.project.demo.model.Actions;
/*---------- Model Imports ----------*/
import com.prueba.project.demo.model.Ages;
import com.prueba.project.demo.model.Base;
import com.prueba.project.demo.model.Identity;
import com.prueba.project.demo.model.Scship;
import com.prueba.project.demo.model.TecUse;
import com.prueba.project.demo.model.Type;
import com.prueba.project.demo.model.User;
import com.prueba.project.demo.service.ActionsService;
/*---------- Service Class Imports ----------*/
import com.prueba.project.demo.service.AgesService;
import com.prueba.project.demo.service.BaseService;
import com.prueba.project.demo.service.DemoService;
import com.prueba.project.demo.service.IdentityService;
import com.prueba.project.demo.service.ScshipService;
import com.prueba.project.demo.service.TecUseService;
import com.prueba.project.demo.service.TypeService;

@RestController
@RequestMapping("/prueba")

public class DemoClass {

	/*---------- PRUEBA ----------*/
	@Autowired
	DemoService s;	
	
	@GetMapping
	public User newUser() {
		return s.getUserService();
	}
	
	@GetMapping("/list")
	public List<User> findAllUsers(){
		return s.getAllUsers();
	}
	
	/*
	public String finalUser() {
		String cadena="Usuario tipo: "
				+s.getUserService().getTipo()+" / Nombre: "
				+s.getUserService().getAppat()+" "
				+s.getUserService().getApmat()+" "
				+s.getUserService().getName()+" / "
				+" Edad: "+s.getUserService().getAge()+" años.";
		return cadena;
	}*/
	
	
	/*---------- Table 1: Base ---------- */
	
	@Autowired
	BaseService bS;
	
	 @GetMapping("/BaseTable")
	 public List<Base>showBaseTable(){
		 return bS.getBaseTable();
	 }
	 
	 
	 /*---------- Table 2: Tecnology Use---------- */
	 @Autowired
	 TecUseService tuS;
	 
	 @GetMapping("/TecUseTable")
	 public List<TecUse>showTecUseTable(){
		 return tuS.getTecUseTable();
	 }
	 
	 
	 /*---------- Table 3: Ages rank ---------- */
	 @Autowired
	 AgesService aS;
	 
	 @GetMapping("/AgesTable")
	 public List<Ages>showAgesTable(){
		 return aS.getAgesTable();
	 }
	 
	 /*---------- Table 4: Scholarship ---------- */
	 @Autowired
	 ScshipService scS;
	 
	 @GetMapping("/ScshipTable")
	 public List<Scship>showScshipTable(){
		 return scS.getScshipTable();
		 
	 }
	 
	 /*---------- Table 5: Type ---------- */
	 @Autowired
	 TypeService tyS;
	 
	 @GetMapping("/TypesTable")
	 public List<Type> showTypeTable(){		 
		 return tyS.getTypeTable();
	 }
	 
	 /*---------- Table 6: Identity ---------- */
	 @Autowired
	 IdentityService idS;
	 
	 @GetMapping("/IdentityTable")
	 public List<Identity>showIdentityTable(){
		 return idS.getIdentityTable();
	 }
	 
	 /*---------- Table 7: Actions ---------- */
	 
	 @Autowired
	 ActionsService acS;
	 
	 @GetMapping("/ActionsTable")
	 public List<Actions> showActionsTable() {
		 return acS.getActionsTable();
	 }
}






