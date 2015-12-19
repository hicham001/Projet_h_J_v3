package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.ProjetDto;
import com.sqli.echallenge.bap.web.facade.IObjectifFacade;
import com.sqli.echallenge.bap.web.facade.IProjetFacade;


@Controller
@RequestMapping(value="/Objectif")
public class ObjectifController {

	@Autowired
	private IObjectifFacade facade;
	@Autowired
	private IProjetFacade f;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<ObjectifDto> getAllObjectif(){
		return facade.findAll();
	}
	
	@RequestMapping(value = "/Getdescriptions",method=RequestMethod.GET)
	public @ResponseBody  List<DescriptionObjDto> getADes(ObjectifDto  objectif){
//		ObjectifDto odt = new ObjectifDto();
//		odt.setIdObjectif(obj);
		System.out.println(objectif.getIdObjectif());
		return facade.getDescriptionsss(objectif);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  ObjectifDto addEvaluateur(@RequestBody ObjectifDto  objectif ){
		
		ObjectifDto obj =  facade.save(objectif);
		System.out.println("======>"+obj.getIdObjectif());
		return obj;
		
	}
	
	@RequestMapping(value = "/{idObjectif}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteEvaluateur(@RequestParam("idObjectif")Long idObjectif ){
	   return facade.delete(idObjectif);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  ObjectifDto updateUser(@RequestBody ObjectifDto objectif){
	   return facade.edit(objectif);
	}
	
	@RequestMapping(value = "/UpdateObjectifCollab",method=RequestMethod.PUT)
	public @ResponseBody  List<ObjectifDto> updateObjectifs(@RequestBody List<ObjectifDto> objectifs){
	   return facade.editObjectifsCollab(objectifs);
	}
	
	@RequestMapping(value = "/AjouterList",method=RequestMethod.POST)
	public @ResponseBody  List<ObjectifDto> addList(@RequestBody List<ObjectifDto> objectifs){
	   return facade.saveObjectifs(objectifs);
	}
	
	@RequestMapping(value = "/getProjet",method=RequestMethod.GET)
	public @ResponseBody  ProjetDto getProj(ObjectifDto objectif){
	   return f.getProjetObjectif(objectif);
	}
	
	
	
}
