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
import com.sqli.echallenge.bap.web.dto.ManagerDto;
import com.sqli.echallenge.bap.web.facade.IUserFacade;

@Controller
@RequestMapping(value="/Manager")
public class ManagerController {
	
	@Autowired
	private IUserFacade facade;
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<ManagerDto> getAllManagers(){
		return facade.getAllManager();
	}
	
	@RequestMapping(value = "/getCollaborateur",method=RequestMethod.GET)
	public @ResponseBody  List<CollaborateurDto> getAllCollaborateur(String matricule){
		return facade.getCollaborateurManager(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  ManagerDto addManager(@RequestBody ManagerDto  manager ){
		return  (ManagerDto) facade.save(manager);
	}
	
	@RequestMapping(value = "/{matricule}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean delete(@RequestParam("matricule")String matricule ){
	   return facade.delete(matricule);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  ManagerDto updateUser(@RequestBody ManagerDto manager){
	   return (ManagerDto) facade.edit(manager);
	}

}
