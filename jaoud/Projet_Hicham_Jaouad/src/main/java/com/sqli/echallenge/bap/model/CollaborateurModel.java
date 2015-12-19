package com.sqli.echallenge.bap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;



@Entity
@DiscriminatorValue("COLLABORATEUR")
public class CollaborateurModel extends UserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4186884051425164936L;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name="COLLABORATEUR_OBJECTIFS",joinColumns =
	@JoinColumn(name = "MAT_COLLABORATEUR"),
	inverseJoinColumns = @JoinColumn(name = "ID_OBJECTIF"))
	private Collection<ObjectifModel> objectifs;
	
	@ManyToOne
	@JoinColumn(name="ID_POSTE")
	private PosteModel poste;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToMany
	@JoinTable(name="COLLABORATEUR_EVALUATEUR",joinColumns =
	@JoinColumn(name = "MAT_COLLABORATEUR"),
	inverseJoinColumns = @JoinColumn(name = "MAT_EVALUATEUR"))
	private Collection<EvaluateurModel> evaluateurs;
	

	@LazyCollection(LazyCollectionOption.FALSE)
	@ManyToOne
	@JoinColumn(name="MAT_MANAGER")
	private ManagerModel manager;
	
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="collaborateur")
	private Collection<FeedbackModel> feedbacks;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="collaborateur")
	private Collection<BAPModel> BAPs;
	

	public CollaborateurModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Collection<ObjectifModel> getObjectifs() {
		return objectifs;
	}

	public void setObjectifs(Collection<ObjectifModel> objectifs) {
		this.objectifs = objectifs;
	}

	public PosteModel getPoste() {
		return poste;
	}

	public void setPoste(PosteModel poste) {
		this.poste = poste;
	}

	public Collection<EvaluateurModel> getEvaluateurs() {
		return evaluateurs;
	}

	public void setEvaluateurs(Collection<EvaluateurModel> evaluateurs) {
		this.evaluateurs = evaluateurs;
	}

	public ManagerModel getManager() {
		return manager;
	}

	public void setManager(ManagerModel manager) {
		this.manager = manager;
	}

	public Collection<FeedbackModel> getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(Collection<FeedbackModel> feedbacks) {
		this.feedbacks = feedbacks;
	}

	public Collection<BAPModel> getBAPs() {
		return BAPs;
	}

	public void setBAPs(Collection<BAPModel> bAPs) {
		BAPs = bAPs;
	}
	

	
}

