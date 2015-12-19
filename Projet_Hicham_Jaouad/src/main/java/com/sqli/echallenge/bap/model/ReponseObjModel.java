package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;


@Entity
@Table(name="REPONSE")
public class ReponseObjModel  extends AbstractModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8644182306895662908L;
	@Id
	@Column(name="ID_REPONSE")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long IdReponse;
	@Enumerated(EnumType.STRING)
    private ValeurReponse valeur;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="reponse",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<ObjectifModel> objectifs;
	public ReponseObjModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReponseObjModel(ValeurReponse valeur,
			Collection<ObjectifModel> objectifs) {
		super();
		this.valeur = valeur;
		this.objectifs = objectifs;
	}
		public ValeurReponse getValeur() {
		return valeur;
	}
	public void setValeur(ValeurReponse valeur) {
		this.valeur = valeur;
	}
	public Collection<ObjectifModel> getObjectifs() {
		return objectifs;
	}
	public void setObjectifs(Collection<ObjectifModel> objectifs) {
		this.objectifs = objectifs;
	}
	public Long getIdReponse() {
		return IdReponse;
	}
	public void setIdReponse(Long idReponse) {
		IdReponse = idReponse;
	}
	
	
}
