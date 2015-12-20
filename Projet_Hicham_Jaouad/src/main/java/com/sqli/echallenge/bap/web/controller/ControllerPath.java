package com.sqli.echallenge.bap.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ControllerPath {
	@RequestMapping("GestionFeedback")
	public String collaborateur(){
		return "GestionFeedback";
	}
	@RequestMapping("GestionObjectifs")
	public String collaborateurProfil(){
		return "profilCollab";
	}
	@RequestMapping("GestionCollaborateur")
	public String feedbaks(){
		return "GestionCollaborateur";
	}
    @RequestMapping("GestionManager")
    public String manager(){
	    return "GestionManager";
     }
    @RequestMapping("GestionEvaluateur")
    public String evaluateur(){
	    return "GestionEvaluateur";
     } 

    @RequestMapping("GestionProjet")
    public String projet(){
	    return "projet";
     } 
    @RequestMapping("login")
    public String login(){
	    return "login";
     } 
    
    @RequestMapping("/404")
    public String l1(){
 	    return "404";
      }  

    @RequestMapping("/")
    public String wlcm(){
    	return "login";
    }

    
}
