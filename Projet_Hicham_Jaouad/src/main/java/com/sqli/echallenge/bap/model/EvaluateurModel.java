package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DiscriminatorValue("EVALUATEUR")
public class EvaluateurModel extends UserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3760631556276757811L;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy="evaluateurs", cascade = CascadeType.ALL)
	private Collection<CollaborateurModel> collaborateurs;
	

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy="evaluateurs", cascade = CascadeType.ALL)
	private Collection<ProjetModel> projets;
	

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

	public EvaluateurModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EvaluateurModel(Collection<CollaborateurModel> collaborateurs) {
		super();
		this.collaborateurs = collaborateurs;
	}

	
	
}
