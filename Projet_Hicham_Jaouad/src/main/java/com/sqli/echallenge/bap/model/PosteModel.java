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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;




@Entity
public class PosteModel extends AbstractModel implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6149306596145368203L;
	
	@Id
	@Column(name="ID_POST")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPost;
	private String intitule;

	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy="poste",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private Collection<CollaborateurModel> collaborateurs;
	public PosteModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public PosteModel(String intitule,
			Collection<CollaborateurModel> collaborateurs) {
		super();
		this.intitule = intitule;
		this.collaborateurs = collaborateurs;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public Collection<CollaborateurModel> getCollaborateurs() {
		return collaborateurs;
	}
	public void setCollaborateurs(Collection<CollaborateurModel> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	
	

}
