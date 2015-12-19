package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DiscriminatorValue("MANAGER")
public class ManagerModel extends UserModel implements Serializable{
	
	private static final long serialVersionUID = 85622811618346620L;


	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="manager",cascade=CascadeType.ALL)
	private Collection<SujetModel> sujets;
	

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="manager",cascade=CascadeType.ALL)
	private Collection<ProjetModel> projets;
	

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="manager",cascade=CascadeType.ALL)
	private Collection<CollaborateurModel> collaborateurs;

	
	public ManagerModel() {
	super();
	}


	public Collection<SujetModel> getSujets() {
		return sujets;
	}


	public void setSujets(Collection<SujetModel> sujets) {
		this.sujets = sujets;
	}


	public Collection<ProjetModel> getProjets() {
		return projets;
	}


	public void setProjets(Collection<ProjetModel> projets) {
		this.projets = projets;
	}


	public Collection<CollaborateurModel> getCollaborateurs() {
		return collaborateurs;
	}


	public void setCollaborateurs(Collection<CollaborateurModel> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	

}
