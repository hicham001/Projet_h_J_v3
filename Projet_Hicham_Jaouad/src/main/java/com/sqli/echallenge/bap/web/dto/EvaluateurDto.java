package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class EvaluateurDto extends UserDto {
	
	private Collection<CollaborateurDto> collaborateurs;
	private Collection<ProjetDto> projets;
	

	public Collection<ProjetDto> getProjets() {
		return projets;
	}

	public void setProjets(Collection<ProjetDto> projets) {
		this.projets = projets;
	}

	public EvaluateurDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvaluateurDto(String matricule) {
		super(matricule);
	}

	@JsonIgnore
	public Collection<CollaborateurDto> getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(Collection<CollaborateurDto> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	

}
