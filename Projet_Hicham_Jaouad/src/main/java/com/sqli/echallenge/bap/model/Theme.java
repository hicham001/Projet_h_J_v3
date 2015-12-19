package com.sqli.echallenge.bap.model;

public enum Theme {

	Productivite,
	Qualite_OR_Fiabilte{
		public String toString(){
			return "Qualité/Fiabilité";
		}
	},
	technicite,
	Conception,
	Avant_vente{
		public String toString(){
			return "Avant-vente";
		}
	},
	Gestion_de_projet{
		public String toString(){
			return "Gestion de projet";
		}
	},
	Gestion_de_relation_client{
		public String toString(){
			return "Gestion de relation client";
		}
	},
	Gestion_des_equipes{
		public String toString(){
			return "Gestion des équipes";
		}
	},
	Polyvalence
}
