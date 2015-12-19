package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;
import com.sqli.echallenge.bap.web.facade.IProjetFacade;


@Controller
@RequestMapping(value="/Projet")
public class ProjetController {
	@Autowired
	private IProjetFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<ProjetDto> getAllProjet(){
		return facade.findAll();
	}
	
	@RequestMapping(value = "/getProjets",method=RequestMethod.GET)
	public @ResponseBody  List<ProjetDto> getProjetbyCollaborateur(String matricule){
		return facade.getProjetByCollaborateur(matricule);
	}
	
	@RequestMapping(value = "/getProjet",method=RequestMethod.GET)
	public @ResponseBody  ProjetDto getProjet(String code){
		return facade.find(code);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  ProjetDto addProjet(@RequestBody ProjetDto  projet ){
		return facade.save(projet);
	}
	@RequestMapping(value = "/{codeprojet}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteProjet(@RequestParam("codeprojet")String codeprojet ){
	   return facade.delete(codeprojet);
	}
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  ProjetDto updateProjet(@RequestBody ProjetDto projet){
	   return facade.edit(projet);
	}
	
	

}
