package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="REPONSE")
public class ReponseObjModel  extends AbstractModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8644182306895662908L;
	@Id
	@Column(name="ID_REPONSE")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdReponse;
    private String valeur;

    @ManyToOne
	@JoinColumn(name="ID_OBJECTIF")
	private ObjectifModel objectif;
    @ManyToOne
	@JoinColumn(name="MAT_COLLABORATEUR")
	private CollaborateurModel collaborateur;
    private double NbrRejet;
    
	public ReponseObjModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReponseObjModel(ValeurReponse valeur) {
		super();
		
	}
	
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	
	public ObjectifModel getObjectif() {
		return objectif;
	}
	public void setObjectif(ObjectifModel objectif) {
		this.objectif = objectif;
	}
	public CollaborateurModel getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(CollaborateurModel collaborateur) {
		this.collaborateur = collaborateur;
	}
	public Long getIdReponse() {
		return IdReponse;
	}
	public void setIdReponse(Long idReponse) {
		IdReponse = idReponse;
	}
	public double getNbrRejet() {
		return NbrRejet;
	}
	public void setNbrRejet(double nbrRejet) {
		NbrRejet = nbrRejet;
	}
	
	
	
}
