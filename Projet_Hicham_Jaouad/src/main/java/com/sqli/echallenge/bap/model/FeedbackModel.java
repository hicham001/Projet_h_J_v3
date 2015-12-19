package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class FeedbackModel extends AbstractModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -365278662984673021L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_FEEDBACK")
	private Long IdFeedback;
	
	private Date datedebut;
	private Date datefin;
	
	@Column(name="NBR_JOUR_VALORISE")
	private Long nbrJourValorise;
	@Column(name="REMARQUE_GLOBALE")
	private String remarqueG;
	private double noteGlobale;
	private double nbrThemeqal;
	private double totalPoids;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="feedback",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<QualificationModel> Qualifications;

	@ManyToOne
	@JoinColumn(name="MAT_COLLABORATEUR")
	private CollaborateurModel collaborateur;
	
	@ManyToOne
	@JoinColumn(name="CODE_PROJET")
	private ProjetModel projet;
	
	private String rolejouer;

	public FeedbackModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FeedbackModel(Date datedebut, Date datefin, Long nbrJourValorise,
			String remarqueG, Collection<QualificationModel> qualifications,
			CollaborateurModel collaborateur) {
		super();
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.nbrJourValorise = nbrJourValorise;
		this.remarqueG = remarqueG;
		Qualifications = qualifications;
		this.collaborateur = collaborateur;
	}


	public Long getIdFeedback() {
		return IdFeedback;
	}

	public void setIdFeedback(Long idFeedback) {
		IdFeedback = idFeedback;
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

	public Long getNbrJourValorise() {
		return nbrJourValorise;
	}

	public void setNbrJourValorise(Long nbrJourValorise) {
		this.nbrJourValorise = nbrJourValorise;
	}

	public String getRemarqueG() {
		return remarqueG;
	}

	public void setRemarqueG(String remarqueG) {
		this.remarqueG = remarqueG;
	}

	public Collection<QualificationModel> getQualifications() {
		return Qualifications;
	}

	public void setQualifications(Collection<QualificationModel> qualifications) {
		Qualifications = qualifications;
	}

	public CollaborateurModel getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(CollaborateurModel collaborateur) {
		this.collaborateur = collaborateur;
	}

	public ProjetModel getProjet() {
		return projet;
	}

	public void setProjet(ProjetModel projet) {
		this.projet = projet;
	}

	public String getRolejouer() {
		return rolejouer;
	}

	public void setRolejouer(String rolejouer) {
		this.rolejouer = rolejouer;
	}

	public double getNoteGlobale() {
		return noteGlobale;
	}

	public void setNoteGlobale(double noteGlobale) {
		this.noteGlobale = noteGlobale;
	}

	public double getNbrThemeqal() {
		return nbrThemeqal;
	}

	public void setNbrThemeqal(double nbrThemeqal) {
		this.nbrThemeqal = nbrThemeqal;
	}

	public double getTotalPoids() {
		return totalPoids;
	}

	public void setTotalPoids(double totalPoids) {
		this.totalPoids = totalPoids;
	}
	

}
