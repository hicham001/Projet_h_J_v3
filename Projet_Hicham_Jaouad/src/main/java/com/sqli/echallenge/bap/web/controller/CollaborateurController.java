package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.facade.IUserFacade;

@Controller
@RequestMapping(value="/Collaborateur")
public class CollaborateurController {
	
	@Autowired
	private IUserFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<CollaborateurDto> getAllCollaborateur(){
		return facade.getAllCollaborateur();
	}
	
	@RequestMapping(value = "/getCollab",method=RequestMethod.GET)
	public @ResponseBody CollaborateurDto getCollab(String matricule){
		return (CollaborateurDto) facade.find(matricule);
	}
	
	@RequestMapping(value = "/getCollabObjectifs",method=RequestMethod.GET)
	public @ResponseBody List<ObjectifDto> getCollabObjectifs(String matricule){
		return facade.getObjectifsCollab(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  CollaborateurDto addCollab(@RequestBody CollaborateurDto  collaborateur ){
		return (CollaborateurDto) facade.save(collaborateur);
	}
	
	@RequestMapping(value = "/{matricule}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteProduit(@RequestParam("matricule")String matricule ){
	   return facade.delete(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  CollaborateurDto updateUser(@RequestBody CollaborateurDto collaborateur){
	   return (CollaborateurDto) facade.edit(collaborateur);
	}
	
//	@RequestMapping(value = "/Categorie",method=RequestMethod.GET)
//	public @ResponseBody  List<Categorie> getallCat(){
//	   return metier.getAllCats();
//	}
	

}
