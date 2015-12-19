package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.ReponseObjDto;
import com.sqli.echallenge.bap.web.facade.IReponseObjFacade;


@Controller
@RequestMapping(value="/Reponse")
public class ReponseController {
	
	@Autowired
	private IReponseObjFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<ReponseObjDto> getAllCollaborateur(){
		return facade.findAll();
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  ReponseObjDto addFeedback(@RequestBody ReponseObjDto  feedback ){
		return facade.save(feedback);
	}
	
	@RequestMapping(value = "/{IdFeedback}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteProduit(@RequestParam("IdFeedback")Long IdFeedback ){
	   return facade.delete(IdFeedback);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  ReponseObjDto updateUser(@RequestBody  ReponseObjDto  feedback){
	   return facade.edit(feedback);
	}
	

}
