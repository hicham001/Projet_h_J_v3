package com.sqli.echallenge.bap.model;

import java.sql.Date;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="HISTORIQUE_FEEDBACK")
@PrimaryKeyJoinColumn(name="ID_HISOTFEDDBACK", referencedColumnName="ID_FEEDBACK")
public class HistoriqueFeedbackModel extends FeedbackModel {

	private Date dateHisorisation;
	private String intitule;
	public HistoriqueFeedbackModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public HistoriqueFeedbackModel(Date datedebut, Date datefin,
			Long nbrJourValorise, String remarqueG,
			Collection<QualificationModel> qualifications,
			CollaborateurModel collaborateur) {
		super(datedebut, datefin, nbrJourValorise, remarqueG, qualifications,
				collaborateur);
	}

	public Date getDateHisorisation() {
		return dateHisorisation;
	}
	public void setDateHisorisation(Date dateHisorisation) {
		this.dateHisorisation = dateHisorisation;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
	
}
