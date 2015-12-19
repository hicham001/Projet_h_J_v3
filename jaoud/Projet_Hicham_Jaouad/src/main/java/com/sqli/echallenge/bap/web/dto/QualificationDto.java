package com.sqli.echallenge.bap.web.dto;

import java.util.Date;

import com.sqli.echallenge.bap.model.QualifValeur;
import com.sqli.echallenge.bap.model.Theme;

public class QualificationDto extends AbstractDto{
	
	private Long idQualification;
    private String theme;
    private String valeur;
	private String remarque;
	private FeedbackDto feedback;
	public QualificationDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QualificationDto(boolean deleted, Date creationDate,
			Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public QualificationDto(String remarque,
			FeedbackDto feedback) {
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
	public FeedbackDto getFeedback() {
		return feedback;
	}
	public void setFeedback(FeedbackDto feedback) {
		this.feedback = feedback;
	}

	
}
