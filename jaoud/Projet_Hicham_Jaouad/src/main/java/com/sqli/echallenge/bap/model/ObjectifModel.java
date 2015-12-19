package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@Table(name="OBJECTIFS")
public class ObjectifModel extends AbstractModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7865250233181990613L;
	@Id
	@Column(name="ID_OBJ")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idObjectif;
	private String intitule;
	@ManyToOne
	@JoinColumn(name="CODE_PROJET")
	private ProjetModel projet;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="objectif",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
	private Collection<DescriptionObjModel> descriptions;

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany(mappedBy="objectifs")
	private Collection<CollaborateurModel> collaborateurs;
	public ObjectifModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ObjectifModel(Long idObjectif) {
		super();
		this.idObjectif = idObjectif;
	}

	public ObjectifModel(String intitule, ProjetModel projet,
			Collection<DescriptionObjModel> descriptions,
			Collection<CollaborateurModel> collaborateurs,
			ReponseObjModel reponse) {
		super();
		this.intitule = intitule;
		this.projet = projet;
		this.descriptions = descriptions;
		this.collaborateurs = collaborateurs;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public ProjetModel getProjet() {
		return projet;
	}
	public void setProjet(ProjetModel projet) {
		this.projet = projet;
	}
	public Collection<DescriptionObjModel> getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(Collection<DescriptionObjModel> descriptions) {
		this.descriptions = descriptions;
	}
	public Collection<CollaborateurModel> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(Collection<CollaborateurModel> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	public Long getIdObjectif() {
		return idObjectif;
	}
	public void setIdObjectif(Long idObjectif) {
		this.idObjectif = idObjectif;
	}
	
	
	
	

}
