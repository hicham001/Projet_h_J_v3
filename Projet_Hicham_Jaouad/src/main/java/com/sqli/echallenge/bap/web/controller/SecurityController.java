package com.sqli.echallenge.bap.web.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.sqli.echallenge.bap.web.dto.UserDto;
import com.sqli.echallenge.bap.web.facade.IAuthenticationFacade;
import com.sqli.echallenge.bap.web.facade.IUserFacade;


@Controller
public class SecurityController {

	@Autowired
    private IAuthenticationFacade authenticationFacade;
	
	@Autowired
	private IUserFacade userfacade;
	
    @RequestMapping(value = "/activeUser", method = RequestMethod.GET)
    public @ResponseBody UserDto currentUser() {
    	if (!(authenticationFacade instanceof AnonymousAuthenticationToken)) {
             UserDetails activeUser =  (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

             if( activeUser != null){
             System.out.println(" username is: " + activeUser.getUsername());
             System.out.println(" pass is: " + activeUser.getPassword());
             UserDto active = userfacade.findUserByPsseudo(activeUser.getUsername(), activeUser.getPassword());
         	return active;
             }
    	}
    	return null;
    }

	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied(Principal user) {
		ModelAndView model = new ModelAndView();

		if (user != null) {
			model.addObject("msg", "Salut " + user.getName() 
			+ ", vous n'avez pas le droit d'acceder a cette resource! Veuillez s'authentifier");
		} else {
			model.addObject("msg", 
			"vous n'avez pas le droit d'acceder a cette resource! Veuillez s'authentifier");
		}
		model.setViewName("login");
		return model;

	}

	@RequestMapping(value = "/acceuil")
	public String acceuilUser(ModelMap model) {
		UserDto user = this.currentUser();
		String nom = null;
		String prenom = null;
		if(user != null){
		 nom = user.getNom();
		 prenom = user.getPrenom();
		}
		else{
			 nom = "admin";
			 prenom = "amdin";
		}
		model.addAttribute("nom", nom);
		model.addAttribute("prenom", prenom);
		return "acceuil";
	}
}
