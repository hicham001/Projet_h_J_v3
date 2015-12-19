package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name="DESCRIPTIONOBJ")
public class DescriptionObjModel extends AbstractModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7961612064315144919L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String description;
	private String mesure;
	@Column(name="RESPONSABLE_DE_MESURE")
	private String responsableMesure;
	@ManyToOne
	@JoinColumn(name="ID_OBJECTIF")
	private ObjectifModel objectif;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="description")
	private Collection<ResultatPoidsModel> resultatpoids;
	
	
	public DescriptionObjModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DescriptionObjModel(String description, String mesure,
			String responsableMesure,ObjectifModel objectif) {
		super();
		this.description = description;
		this.mesure = mesure;
		this.responsableMesure = responsableMesure;
		this.objectif = objectif;
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

	public ObjectifModel getObjectif() {
		return objectif;
	}
	public void setObjectif(ObjectifModel objectif) {
		this.objectif = objectif;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Collection<ResultatPoidsModel> getResultatpoids() {
		return resultatpoids;
	}
	public void setResultatpoids(Collection<ResultatPoidsModel> resultatpoids) {
		this.resultatpoids = resultatpoids;
	}
	
}
