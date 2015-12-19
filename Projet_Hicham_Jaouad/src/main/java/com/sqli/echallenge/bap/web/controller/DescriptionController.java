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
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;
import com.sqli.echallenge.bap.web.facade.IDescriptionObjFacade;
import com.sqli.echallenge.bap.web.facade.IResultatPoidsFacade;


@Controller
@RequestMapping(value="/Description")
public class DescriptionController {

	@Autowired
	private IDescriptionObjFacade facade;
	@Autowired
	private IResultatPoidsFacade f;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<DescriptionObjDto> getAllCollaborateur(){
		return facade.findAll();
	}
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  DescriptionObjDto addEvaluateur(@RequestBody DescriptionObjDto  description ){
		return  facade.save(description);
	}
	
	@RequestMapping(value = "/{id}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteEvaluateur(@RequestParam("id")Long id ){
	   return facade.delete(id);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  DescriptionObjDto updateUser(@RequestBody DescriptionObjDto collaborateur){
	   return facade.edit(collaborateur);
	}
	@RequestMapping(value = "/Resultat",method=RequestMethod.GET)
	public @ResponseBody  List<ResultatPoidsDto> updatfser(){
	   return f.findAll();
	}
	@RequestMapping(value = "/AjouterResultat",method=RequestMethod.POST)
	public @ResponseBody  List<ResultatPoidsDto> ajouterList(@RequestBody List<ResultatPoidsDto> l){
	   return f.setListRP(l);
	}
	@RequestMapping(value = "/GETRP",method=RequestMethod.GET)
	public @ResponseBody  List<ResultatPoidsDto> ajouterList(DescriptionObjDto d){
	   return facade.getListrp(d);
	}
	
	
}
