package com.sqli.echallenge.bap.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class ResultatPoidsModel  extends AbstractModel{

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Double poids;
	private Double resultat;

	@ManyToOne
	@JoinColumn(name="MAT_COLLAB")
	private CollaborateurModel collaborateur;

	@ManyToOne
	@JoinColumn(name="ID_DESCRIPTION")
	private DescriptionObjModel description;

	
	public ResultatPoidsModel(boolean deleted, Date creationDate, Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}

	public ResultatPoidsModel(Double poids, Double resultat,
			CollaborateurModel collaborateur, DescriptionObjModel descriptionObj) {
		super();
		this.poids = poids;
		this.resultat = resultat;
		this.collaborateur = collaborateur;
		this.description= descriptionObj;
	}

	public ResultatPoidsModel() {
		super();
		// TODO Auto-generated constructor stub
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

	public CollaborateurModel getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(CollaborateurModel collaborateur) {
		this.collaborateur = collaborateur;
	}

	public DescriptionObjModel getDescription() {
		return description;
	}

	public void setDescription(DescriptionObjModel description) {
		this.description = description;
	}


	
	
	
}
