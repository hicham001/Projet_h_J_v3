package com.sqli.echallenge.bap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sqli.echallenge.bap.web.dto.FeedbackDto;
import com.sqli.echallenge.bap.web.facade.IFeedbackFacade;



@Controller
@RequestMapping(value="/FEEDBACK")
public class FeedbackController {
	
	@Autowired
	private IFeedbackFacade facade;
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public @ResponseBody  List<FeedbackDto> getAllCollaborateur(){
		return facade.findAll();
	}
	
	@RequestMapping(value = "/",method=RequestMethod.POST)
	public @ResponseBody  FeedbackDto addFeedback(@RequestBody FeedbackDto  feedback ){
		return facade.save(feedback);
	}
	
	@RequestMapping(value = "/{IdFeedback}",method=RequestMethod.DELETE)
	public @ResponseBody  boolean deleteProduit(@RequestParam("IdFeedback")Long IdFeedback ){
	   return facade.delete(IdFeedback);
	}
	
	@RequestMapping(value = "/",method=RequestMethod.PUT)
	public @ResponseBody  FeedbackDto updateUser(@RequestBody  FeedbackDto  feedback){
	   return facade.edit(feedback);
	}
	

}
