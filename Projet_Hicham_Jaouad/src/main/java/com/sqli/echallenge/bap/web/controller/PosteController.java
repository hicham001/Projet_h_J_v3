package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.PosteDto;
import com.sqli.echallenge.bap.web.facade.IPosteFacade;

@Controller
@RequestMapping(value="/Poste")
public class PosteController {
	@Autowired
	private IPosteFacade facade;
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<PosteDto> getAllPotes(){
		return facade.findAll();
	}
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  PosteDto addPoste(@RequestBody PosteDto  poste ){
		return facade.save(poste);
	}
	
	@RequestMapping(value = "/{idPost}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean delete(@RequestParam("idPost")Long idPost ){
	   return facade.delete(idPost);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  PosteDto updateUser(@RequestBody PosteDto poste){
	   return facade.edit(poste);
	}

}
