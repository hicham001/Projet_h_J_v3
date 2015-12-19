package com.sqli.echallenge.bap.web.dto;

import java.sql.Date;

public abstract class UserDto extends AbstractDto {
	
	  	protected String matricule;
		protected String nom;
		protected String prenom;
		protected String email;
		protected String sexe;
		protected String telephone;
		protected Date dateEmbauche;
		protected Date dateDN;
		protected String adresse;
		protected String photo;
		protected String psseudo;
		protected String password;
		
		public UserDto(String matricule) {
			super();
			this.matricule = matricule;
		}
		public UserDto(boolean deleted, Date creationDate, Date modifiedDate) {
			super(deleted, creationDate, modifiedDate);
			// TODO Auto-generated constructor stub
		}
		public String getMatricule() {
			return matricule;
		}
		public void setMatricule(String matricule) {
			this.matricule = matricule;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getSexe() {
			return sexe;
		}
		public void setSexe(String sexe) {
			this.sexe = sexe;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public Date getDateEmbauche() {
			return dateEmbauche;
		}
		public void setDateEmbauche(Date dateEmbauche) {
			this.dateEmbauche = dateEmbauche;
		}
		public Date getDateDN() {
			return dateDN;
		}
		public void setDateDN(Date dateDN) {
			this.dateDN = dateDN;
		}
		public String getAdresse() {
			return adresse;
		}
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}
		public String getPhoto() {
			return photo;
		}
		public void setPhoto(String photo) {
			this.photo = photo;
		}
		public String getPsseudo() {
			return psseudo;
		}
		public void setPsseudo(String psseudo) {
			this.psseudo = psseudo;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public UserDto() {
			super();
			// TODO Auto-generated constructor stub
		}
		public UserDto(String matricule, String nom, String prenom,
				String email, String sexe, String telephone, Date dateEmbauche,
				Date dateDN, String adresse, String photo, String psseudo,
				String password) {
			super();
			this.matricule = matricule;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.sexe = sexe;
			this.telephone = telephone;
			this.dateEmbauche = dateEmbauche;
			this.dateDN = dateDN;
			this.adresse = adresse;
			this.photo = photo;
			this.psseudo = psseudo;
			this.password = password;
		}
		
		
	
	
}
