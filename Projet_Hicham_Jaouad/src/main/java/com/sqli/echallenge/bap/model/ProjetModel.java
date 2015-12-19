package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name="PROJET",uniqueConstraints={ @UniqueConstraint(columnNames = {"CODE_PROJET"})})
public class ProjetModel extends AbstractModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4234589160999142510L;
	@Id
	@Column(name="CODE_PROJET")
	private String codeprojet;
	private Date dateP;
	private String categorie;
	@ManyToOne
	@JoinColumn(name="MAT_MANAGER")
	private ManagerModel manager;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<ObjectifModel> objectifs;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany
	@JoinTable(name="PROJET_EVALUATEUR",joinColumns =
	@JoinColumn(name = "CODE_PROJET"),
	inverseJoinColumns = @JoinColumn(name = "MAT_EVALUATEUR"))
	private Collection<EvaluateurModel> evaluateurs;
	
	
	public Collection<EvaluateurModel> getEvaluateurs() {
		return evaluateurs;
	}
	public void setEvaluateurs(Collection<EvaluateurModel> evaluateurs) {
		this.evaluateurs = evaluateurs;
	}
	public ProjetModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProjetModel(String codeprojet, Date dateP, String categorie,
			ManagerModel manager, Collection<ObjectifModel> objectifs) {
		super();
		this.codeprojet = codeprojet;
		this.dateP = dateP;
		this.categorie = categorie;
		this.manager = manager;
		this.objectifs = objectifs;
	}
	public String getCodeprojet() {
		return codeprojet;
	}
	public void setCodeprojet(String codeprojet) {
		this.codeprojet = codeprojet;
	}
	public Date getDateP() {
		return dateP;
	}
	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public ManagerModel getManager() {
		return manager;
	}
	public void setManager(ManagerModel manager) {
		this.manager = manager;
	}
	public Collection<ObjectifModel> getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(Collection<ObjectifModel> objectifs) {
		this.objectifs = objectifs;
	}
	
	

}
