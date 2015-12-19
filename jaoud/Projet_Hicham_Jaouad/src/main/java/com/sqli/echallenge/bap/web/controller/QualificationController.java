package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.QualificationDto;
import com.sqli.echallenge.bap.web.facade.IQualificationFacade;


@Controller
@RequestMapping(value="/Qualification")
public class QualificationController {

	@Autowired
	private IQualificationFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<QualificationDto> getAllCollaborateur(){
		return facade.findAll();
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  QualificationDto addFeedback(@RequestBody QualificationDto  qualifiaction ){
		return facade.save(qualifiaction);
	}
	
	@RequestMapping(value = "/ADDLIST",method=RequestMethod.POST)
	public @ResponseBody  List<QualificationDto> addListQualification(@RequestBody List<QualificationDto>  list ){
		return facade.addList(list);
	}
	
	@RequestMapping(value = "/{idQualification}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteProduit(@RequestParam("idQualification")Long idQualification ){
	   return facade.delete(idQualification);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  QualificationDto updateUser(@RequestBody  QualificationDto  qualification){
	   return facade.edit(qualification);
	}
	

}
