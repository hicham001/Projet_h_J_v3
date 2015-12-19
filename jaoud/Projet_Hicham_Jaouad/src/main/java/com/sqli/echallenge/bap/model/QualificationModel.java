package com.sqli.echallenge.bap.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="QUALIFICATION")
public class QualificationModel extends AbstractModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5859681754475746557L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_QUALIFICATION")
	private Long idQualification;
	
    private String theme;
    private String valeur;
	private String remarque;
	@ManyToOne
	@JoinColumn(name="feedback_id")
	private FeedbackModel feedback;
	
	public QualificationModel() {
		super();
	}
	public QualificationModel(
			String remarque, FeedbackModel feedback) {
		super();
		
		this.remarque = remarque;
		this.feedback = feedback;
	}
	
	
	public Long getIdQualification() {
		return idQualification;
	}
	public void setIdQualification(Long idQualification) {
		this.idQualification = idQualification;
	}
	
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	public String getValeur() {
		return valeur;
	}
	public void setValeur(String valeur) {
		this.valeur = valeur;
	}
	public String getRemarque() {
		return remarque;
	}
	public void setRemarque(String remarque) {
		this.remarque = remarque;
	}
	public FeedbackModel getFeedback() {
		return feedback;
	}
	public void setFeedback(FeedbackModel feedback) {
		this.feedback = feedback;
	}

	
}
