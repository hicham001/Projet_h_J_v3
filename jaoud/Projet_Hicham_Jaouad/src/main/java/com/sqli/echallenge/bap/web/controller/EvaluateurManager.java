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
import com.sqli.echallenge.bap.web.facade.IUserFacade;

@Controller
@RequestMapping(value="/Evaluateur")
public class EvaluateurManager {

	@Autowired
	private IUserFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<EvaluateurDto> getAllCollaborateur(){
		return facade.getAllEvaluateur();
	}
	
	@RequestMapping(value = "/GetCollabPourEval",method=RequestMethod.GET)
	public @ResponseBody  List<CollaborateurDto> getCollabPourEval(String matricule){
		return facade.getCollabEvaluateur(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  EvaluateurDto addEvaluateur(@RequestBody EvaluateurDto  collaborateur ){
		return (EvaluateurDto) facade.save(collaborateur);
	}
	
	@RequestMapping(value = "/{matricule}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteEvaluateur(@RequestParam("matricule")String matricule ){
	   return facade.delete(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  EvaluateurDto updateUser(@RequestBody EvaluateurDto collaborateur){
	   return (EvaluateurDto) facade.edit(collaborateur);
	}
	
}
