package com.sqli.echallenge.bap.web.dto;

import java.util.Date;


public class ResultatPoidsDto extends AbstractDto{

	private Long id;
	
	private Double poids;
	private Double resultat;
	private CollaborateurDto collaborateur;
	private DescriptionObjDto descriptionObj;
	
	public ResultatPoidsDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResultatPoidsDto(boolean deleted, Date creationDate,
			Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	
	public ResultatPoidsDto(Double poids, Double resultat, CollaborateurDto collaborateur,
			DescriptionObjDto descriptionObj) {
		super();
		this.poids = poids;
		this.resultat = resultat;
		this.collaborateur = collaborateur;
		this.descriptionObj = descriptionObj;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPoids() {
		return poids;
	}
	public void setPoids(Double poids) {
		this.poids = poids;
	}
	public Double getResultat() {
		return resultat;
	}
	public void setResultat(Double resultat) {
		this.resultat = resultat;
	}
	public CollaborateurDto getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(CollaborateurDto collaborateur) {
		this.collaborateur = collaborateur;
	}
	public DescriptionObjDto getDescriptionObj() {
		return descriptionObj;
	}
	public void setDescriptionObj(DescriptionObjDto descriptionObj) {
		this.descriptionObj = descriptionObj;
	}
	
}
