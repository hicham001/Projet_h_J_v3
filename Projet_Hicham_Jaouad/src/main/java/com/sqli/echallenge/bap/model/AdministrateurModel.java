package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@DiscriminatorValue("ADMINISTRATEUR")
public class AdministrateurModel extends UserModel implements Serializable{
	
	private static final long serialVersionUID = 880104587661410999L;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="administrateur",cascade=CascadeType.ALL)
	private Collection<SujetModel> sujets;

	public Collection<SujetModel> getSujets() {
		return sujets;
	}

	public void setSujets(Collection<SujetModel> sujets) {
		this.sujets = sujets;
	}

	public AdministrateurModel() {
		super();
	}

	public AdministrateurModel(Collection<SujetModel> sujets) {
		super();
		this.sujets = sujets;
	}
	

}
