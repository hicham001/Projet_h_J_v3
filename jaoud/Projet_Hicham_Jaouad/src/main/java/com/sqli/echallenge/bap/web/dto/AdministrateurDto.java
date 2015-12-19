package com.sqli.echallenge.bap.web.dto;

import java.util.Collection;
import java.sql.Date;


public class AdministrateurDto extends UserDto {

	private Collection<SujetDto> sujets;

	public AdministrateurDto() {
		super();
	}
	public AdministrateurDto(String matricule) {
		super(matricule);
	}
	
	public AdministrateurDto(String matricule, String nom, String prenom,
			String email, String sexe, String telephone, Date dateEmbauche,
			Date dateDN, String adresse, String photo, String psseudo,
			String password) {
		super(matricule, nom, prenom, email, sexe, telephone, dateEmbauche, dateDN,
				adresse, photo, psseudo, password);
		// TODO Auto-generated constructor stub
	}

	public Collection<SujetDto> getSujets() {
		return sujets;
	}

	public void setSujets(Collection<SujetDto> sujets) {
		this.sujets = sujets;
	}

	
}
