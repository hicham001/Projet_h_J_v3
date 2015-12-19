package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.util.Date;

import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.model.ValeurReponse;

public class ReponseObjDto extends AbstractDto {

	private Long IdReponse;
    private String valeur;
    private ObjectifDto objectif;
    private CollaborateurDto collaborateur;
    private double NbrRejet;
	public ReponseObjDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReponseObjDto(boolean deleted, Date creationDate, Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public ReponseObjDto(ValeurReponse valeur, Collection<ObjectifDto> objectifs) {
		super();
	}
	public Long getIdReponse() {
		return IdReponse;
	}
	public void setIdReponse(Long idReponse) {
		IdReponse = idReponse;
	}
	
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public ObjectifDto getObjectif() {
		return objectif;
	}
	public void setObjectif(ObjectifDto objectif) {
		this.objectif = objectif;
	}
	public CollaborateurDto getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(CollaborateurDto collaborateur) {
		this.collaborateur = collaborateur;
	}
	public double getNbrRejet() {
		return NbrRejet;
	}
	public void setNbrRejet(double nbrRejet) {
		NbrRejet = nbrRejet;
	}
	
	
	
	
	
}
