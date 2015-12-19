package com.sqli.echallenge.bap.web.dto;

import java.sql.Date;

public class SujetDto extends AbstractDto {
	private Long id;
	private Date dateS;
	private String contenu;
	private AdministrateurDto administrateur;
	private ManagerDto manager;
	public SujetDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SujetDto(boolean deleted, java.util.Date creationDate,
			java.util.Date modifiedDate) {
		super(deleted, creationDate, modifiedDate);
		// TODO Auto-generated constructor stub
	}
	public SujetDto(Date dateS, String contenu,
			AdministrateurDto administrateur, ManagerDto manager) {
		super();
		this.dateS = dateS;
		this.contenu = contenu;
		this.administrateur = administrateur;
		this.manager = manager;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateS() {
		return dateS;
	}
	public void setDateS(Date dateS) {
		this.dateS = dateS;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public AdministrateurDto getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(AdministrateurDto administrateur) {
		this.administrateur = administrateur;
	}
	public ManagerDto getManager() {
		return manager;
	}
	public void setManager(ManagerDto manager) {
		this.manager = manager;
	}

	
}
