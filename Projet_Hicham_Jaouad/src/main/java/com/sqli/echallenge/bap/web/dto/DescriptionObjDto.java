package com.sqli.echallenge.bap.web.dto;


import java.util.Collection;
import java.util.Date;

import com.sqli.echallenge.bap.model.ResultatPoidsModel;


public class DescriptionObjDto extends AbstractDto {

	private Long id;
	private String description;
	private String mesure;
	private String responsableMesure;
	private ObjectifDto objectif;
	private Collection<ResultatPoidsDto> resultatpoids;
	
	
	
	public DescriptionObjDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Collection<ResultatPoidsDto> getResultatpoids() {
		return resultatpoids;
	}

	public void setResultatpoids(Collection<ResultatPoidsDto> resultatpoids) {
		this.resultatpoids = resultatpoids;
	}

	public DescriptionObjDto(boolean deleted, Date creationDate,
			Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public DescriptionObjDto(String description, String mesure,
			String responsableMesure, double poids, Double resultat,
			Double noteFinal, ObjectifDto objectif) {
		super();
		this.description = description;
		this.mesure = mesure;
		this.responsableMesure = responsableMesure;
		this.objectif = objectif;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMesure() {
		return mesure;
	}
	public void setMesure(String mesure) {
		this.mesure = mesure;
	}
	public String getResponsableMesure() {
		return responsableMesure;
	}
	public void setResponsableMesure(String responsableMesure) {
		this.responsableMesure = responsableMesure;
	}
	public ObjectifDto getObjectif() {
		return objectif;
	}
	public void setObjectif(ObjectifDto objectif) {
		this.objectif = objectif;
	}
	
	
}

