package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class PosteDto extends AbstractDto{
	private Long idPost;
	private String intitule;
	private Collection<CollaborateurDto> collaborateurs;
	public Long getIdPost() {
		return idPost;
	}
	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
    @JsonIgnore
	public Collection<CollaborateurDto> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(Collection<CollaborateurDto> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	
}
