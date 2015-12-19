package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="BAPs")
public class BAPModel extends AbstractModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3623102104386664496L;
	@Id
	@Column(name="ID_BAP")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
    private StatusBAP statut;
	private Date datedebut;
	private Date datefin;
	private Double resultatFinale;
	private Boolean mode;
	@ManyToOne
	@JoinColumn(name="MAT_COLLABORATEUR")
	private CollaborateurModel collaborateur;
	
	
	
	public BAPModel(Long id, StatusBAP statut, Date datedebut, Date datefin,
			Double resultatFinale, Boolean mode) {
		super();
		this.id = id;
		this.statut = statut;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.resultatFinale = resultatFinale;
		this.mode = mode;
	}
	
	public CollaborateurModel getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(CollaborateurModel collaborateur) {
		this.collaborateur = collaborateur;
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
	public CollaborateurModel getColaborateur() {
		return collaborateur;
	}
	public void setColaborateur(CollaborateurModel colaborateur) {
		this.collaborateur = colaborateur;
	}
	public BAPModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BAPModel(StatusBAP statut, Date datedebut, Date datefin,
			Double resultatFinale, Boolean mode, CollaborateurModel colaborateur) {
		super();
		this.statut = statut;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.resultatFinale = resultatFinale;
		this.mode = mode;
		this.collaborateur = colaborateur;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	
}
