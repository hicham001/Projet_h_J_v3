package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class ManagerDto extends UserDto  {

	private Collection<SujetDto> sujets;	
	private Collection<ProjetDto> projets;	
	private Collection<CollaborateurDto> collaborateurs;
	
	public ManagerDto() {
		super();
	}
	
	public ManagerDto(String matricule) {
		super(matricule);
		// TODO Auto-generated constructor stub
	}

	public ManagerDto(String matricule, String nom, String prenom,
			String email, String sexe, String telephone, Date dateEmbauche,
			Date dateDN, String adresse, String photo, String psseudo,
			String password) {
		super(matricule, nom, prenom, email, sexe, telephone, dateEmbauche, dateDN,
				adresse, photo, psseudo, password);
		// TODO Auto-generated constructor stub
	}
	public ManagerDto(Collection<SujetDto> sujets,
			Collection<ProjetDto> projets,
			Collection<CollaborateurDto> collaborateurs) {
		super();
		this.sujets = sujets;
		this.projets = projets;
		this.collaborateurs = collaborateurs;
	}
	@JsonIgnore
	public Collection<SujetDto> getSujets() {
		return sujets;
	}
	public void setSujets(Collection<SujetDto> sujets) {
		this.sujets = sujets;
	}
	@JsonIgnore
	public Collection<ProjetDto> getProjets() {
		return projets;
	}
	public void setProjets(Collection<ProjetDto> projets) {
		this.projets = projets;
	}
	
	public Collection<CollaborateurDto> getCollaborateurs() {
		return collaborateurs;
	}
	
	public void setCollaborateurs(Collection<CollaborateurDto> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	
}
