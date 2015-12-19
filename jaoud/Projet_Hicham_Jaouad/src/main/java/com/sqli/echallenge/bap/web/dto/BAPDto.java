package com.sqli.echallenge.bap.web.dto;

import java.sql.Date;

import com.sqli.echallenge.bap.model.StatusBAP;

public class BAPDto extends AbstractDto{

	private Long id;
    private StatusBAP statut;
	private Date datedebut;
	private Date datefin;
	private Double resultatFinale;
	private Boolean mode;
	private CollaborateurDto collaborateur;
	public BAPDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BAPDto(boolean deleted, java.util.Date creationDate,
			java.util.Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public BAPDto(StatusBAP statut, Date datedebut, Date datefin,
			Double resultatFinale, Boolean mode, CollaborateurDto collaborateur) {
		super();
		this.statut = statut;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.resultatFinale = resultatFinale;
		this.mode = mode;
		this.collaborateur = collaborateur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public StatusBAP getStatut() {
		return statut;
	}
	public void setStatut(StatusBAP statut) {
		this.statut = statut;
	}
	public Date getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}
	public Date getDatefin() {
		return datefin;
	}
	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	public Double getResultatFinale() {
		return resultatFinale;
	}
	public void setResultatFinale(Double resultatFinale) {
		this.resultatFinale = resultatFinale;
	}
	public Boolean getMode() {
		return mode;
	}
	public void setMode(Boolean mode) {
		this.mode = mode;
	}
	public CollaborateurDto getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(CollaborateurDto collaborateur) {
		this.collaborateur = collaborateur;
	}
	
	
}
