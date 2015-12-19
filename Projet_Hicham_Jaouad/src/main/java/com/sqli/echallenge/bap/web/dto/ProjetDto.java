package com.sqli.echallenge.bap.web.dto;

import java.sql.Date;
import java.util.Collection;


public class ProjetDto extends AbstractDto{
	
	private String codeprojet;
	private Date dateP;
	private String categorie;
	private ManagerDto manager;
	private Collection<ObjectifDto> objectifs;
	private Collection<EvaluateurDto> evaluateurs;
	
	public Collection<EvaluateurDto> getEvaluateurs() {
		return evaluateurs;
	}
	public void setEvaluateurs(Collection<EvaluateurDto> evaluateurs) {
		this.evaluateurs = evaluateurs;
	}
	public ProjetDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjetDto(boolean deleted, java.util.Date creationDate,
			java.util.Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public ProjetDto(String codeprojet, Date dateP, String categorie,
			ManagerDto manager, Collection<ObjectifDto> objectifs) {
		super();
		this.codeprojet = codeprojet;
		this.dateP = dateP;
		this.categorie = categorie;
		this.manager = manager;
		this.objectifs = objectifs;
	}
	public String getCodeprojet() {
		return codeprojet;
	}
	public void setCodeprojet(String codeprojet) {
		this.codeprojet = codeprojet;
	}
	public Date getDateP() {
		return dateP;
	}
	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public ManagerDto getManager() {
		return manager;
	}
	public void setManager(ManagerDto manager) {
		this.manager = manager;
	}
	public Collection<ObjectifDto> getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(Collection<ObjectifDto> objectifs) {
		this.objectifs = objectifs;
	}

	
}
