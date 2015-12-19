package com.sqli.echallenge.bap.model;

public enum StatusBAP {
	En_attente{
		public String toString(){
			return "En attente";
		}
	},
	En_cours{
		public String toString(){
			return "En cours";
		}
	},
	Valide,
	Rejete,
	Annuler

}
