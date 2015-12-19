package com.sqli.echallenge.bap.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerPath {
	@RequestMapping("/GestionFeedback")
	public String collaborateur(){
		return "GestionFeedback";
	}
	@RequestMapping("/profilCollab")
	public String collaborateurProfil(){
		return "profilCollab";
	}
	@RequestMapping("/GestionCollaborateur")
	public String feedbaks(){
		return "GestionCollaborateur";
	}
    @RequestMapping("/GestionManager")
    public String manager(){
	    return "GestionManager";
     }
    @RequestMapping("/GestionEvaluateur")
    public String evaluateur(){
	    return "GestionEvaluateur";
     } 
    @RequestMapping("/header")
     public String header(){
 	    return "NewFile1";
      }
    @RequestMapping("/GestionProjet")
    public String projet(){
	    return "GestionProjet";
     } 
    
}
