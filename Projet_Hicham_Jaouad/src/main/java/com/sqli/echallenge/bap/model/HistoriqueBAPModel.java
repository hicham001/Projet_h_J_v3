package com.sqli.echallenge.bap.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


@Entity
@Table(name="HISTORIQUE_BAP")
@PrimaryKeyJoinColumn(name="ID_HISOTBAP" ,referencedColumnName="ID_BAP")
public class HistoriqueBAPModel extends BAPModel {

	private Date datHisorisation;
	private String intitule;
	
	
	public HistoriqueBAPModel(Date datHisorisation, String intitule) {
		super();
		this.datHisorisation = datHisorisation;
		this.intitule = intitule;
	}
	public Date getDatHisorisation() {
		return datHisorisation;
	}
	public void setDatHisorisation(Date datHisorisation) {
		this.datHisorisation = datHisorisation;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	
}
