package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.sql.Date;


import com.fasterxml.jackson.annotation.JsonIgnore;


public class CollaborateurDto extends UserDto {
	
    private Collection<ObjectifDto> objectifs;
	private PosteDto poste;
	
	private Collection<EvaluateurDto> evaluateurs;
	private ManagerDto manager;
	private Collection<FeedbackDto> feedbacks;
	private Collection<BAPDto> BAPs;

	public CollaborateurDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CollaborateurDto(String mat) {
		super(mat);
		// TODO Auto-generated constructor stub
	}
	
	public CollaborateurDto(String matricule, String nom, String prenom,
			String email, String sexe, String telephone, Date dateEmbauche,
			Date dateDN, String adresse, String photo, String psseudo,
			String password) {
		super(matricule, nom, prenom, email, sexe, telephone, dateEmbauche, dateDN,
				adresse, photo, psseudo, password);
		// TODO Auto-generated constructor stub
	}
	public Collection<ObjectifDto> getObjectifs() {
		return objectifs;
	}

	public void setObjectifs(Collection<ObjectifDto> objectifs) {
		this.objectifs = objectifs;
	}

	public PosteDto getPoste() {
		return poste;
	}

	public void setPoste(PosteDto poste) {
		this.poste = poste;
	}
	public Collection<EvaluateurDto> getEvaluateurs() {
		return evaluateurs;
	}

	public void setEvaluateurs(Collection<EvaluateurDto> evaluateurs) {
		this.evaluateurs = evaluateurs;
	}
	public ManagerDto getManager() {
		return manager;
	}

	public void setManager(ManagerDto manager) {
		this.manager = manager;
	}
	public Collection<FeedbackDto> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(Collection<FeedbackDto> feedbacks) {
		this.feedbacks = feedbacks;
	}
	public Collection<BAPDto> getBAPs() {
		return BAPs;
	}

	public void setBAPs(Collection<BAPDto> bAPs) {
		BAPs = bAPs;
	}

	
}
