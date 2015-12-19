package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.util.Date;


public class ObjectifDto extends AbstractDto{

	
	private Long idObjectif;
	private String intitule;
	private ProjetDto projet;
	private Collection<DescriptionObjDto> descriptions;
	private Collection<CollaborateurDto> collaborateurs;
	private ReponseObjDto reponse;
	public ObjectifDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ObjectifDto(boolean deleted, Date creationDate, Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public ObjectifDto(String intitule) {
		super();
		this.intitule = intitule;
	}
	public ObjectifDto(Long idObjectif, String intitule, ProjetDto projet,
			Collection<DescriptionObjDto> descriptions,
			Collection<CollaborateurDto> collaborateurs, ReponseObjDto reponse) {
		super();
		this.idObjectif = idObjectif;
		this.intitule = intitule;
		this.projet = projet;
		this.descriptions = descriptions;
		this.collaborateurs = collaborateurs;
		this.reponse = reponse;
	}
	
	public ObjectifDto(Long idObjectif) {
		super();
		this.idObjectif = idObjectif;
	}
	public Long getIdObjectif() {
		return idObjectif;
	}
	public void setIdObjectif(Long i) {
		this.idObjectif = i;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public ProjetDto getProjet() {
		return projet;
	}
	public void setProjet(ProjetDto projet) {
		this.projet = projet;
	}
	public Collection<DescriptionObjDto> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(Collection<DescriptionObjDto> descriptions) {
		this.descriptions = descriptions;
	}
	public Collection<CollaborateurDto> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(Collection<CollaborateurDto> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	public ReponseObjDto getReponse() {
		return reponse;
	}
	public void setReponse(ReponseObjDto reponse) {
		this.reponse = reponse;
	}
	
	
}
