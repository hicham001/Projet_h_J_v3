package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class SujetModel extends AbstractModel implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_SUJET")
	private Long id;
	private static final long serialVersionUID = 5507921368628985789L;

	private Date dateS;
	private String contenu;
	@ManyToOne
	@JoinColumn(name="MAT_ADMIN")
	private AdministrateurModel administrateur;
	
	@ManyToOne
	@JoinColumn(name="MAT_MANAGER")
	private ManagerModel manager;
	public SujetModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SujetModel(Date dateS, String contenu,
			AdministrateurModel administrateur, ManagerModel manager) {
		super();
		this.dateS = dateS;
		this.contenu = contenu;
		this.administrateur = administrateur;
		this.manager = manager;
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
	public AdministrateurModel getAdministrateur() {
		return administrateur;
	}
	public void setAdministrateur(AdministrateurModel administrateur) {
		this.administrateur = administrateur;
	}
	public ManagerModel getManager() {
		return manager;
	}
	public void setManager(ManagerModel manager) {
		this.manager = manager;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
}
