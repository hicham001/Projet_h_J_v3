package com.sqli.echallenge.bap.web.dto;

import java.sql.Date;
import java.util.Collection;


public class FeedbackDto extends AbstractDto{

	private Long IdFeedback;
	private Date datedebut;
	private Date datefin;
	private Long nbrJourValorise;
	private String remarqueG;
	private Collection<QualificationDto> Qualifications;
	private CollaborateurDto collaborateur;
	private ProjetDto projet;
	private String rolejouer;
	private double noteGlobale;
	private double nbrThemeqal;
	private double totalPoids;
	
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
	public Collection<QualificationDto> getQualifications() {
		return Qualifications;
	}
	public void setQualifications(Collection<QualificationDto> qualifications) {
		Qualifications = qualifications;
	}
	public CollaborateurDto getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(CollaborateurDto collaborateur) {
		this.collaborateur = collaborateur;
	}
	public ProjetDto getProjet() {
		return projet;
	}
	public void setProjet(ProjetDto projet) {
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
