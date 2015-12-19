package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.util.Date;

import com.sqli.echallenge.bap.model.ValeurReponse;

public class ReponseObjDto extends AbstractDto {

	private Long IdReponse;
    private ValeurReponse valeur;
	private Collection<ObjectifDto> objectifs;
	public ReponseObjDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReponseObjDto(boolean deleted, Date creationDate, Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public ReponseObjDto(ValeurReponse valeur, Collection<ObjectifDto> objectifs) {
		super();
		this.valeur = valeur;
		this.objectifs = objectifs;
	}
	public Long getIdReponse() {
		return IdReponse;
	}
	public void setIdReponse(Long idReponse) {
		IdReponse = idReponse;
	}
	public ValeurReponse getValeur() {
		return valeur;
	}
	public void setValeur(ValeurReponse valeur) {
		this.valeur = valeur;
	}
	public Collection<ObjectifDto> getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(Collection<ObjectifDto> objectifs) {
		this.objectifs = objectifs;
	}
	
	
}
