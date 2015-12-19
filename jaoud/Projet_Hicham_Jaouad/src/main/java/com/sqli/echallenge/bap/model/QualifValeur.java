package com.sqli.echallenge.bap.model;

public enum QualifValeur {
	Critique,
	A_developper{
		public String toString(){
			return " A developper";
		}
	},
	Selon_attente{
		public String toString(){
			return " Selon attente";
		}
	},
	Demonte_forces{
		public String toString(){
			return " Demontre des forces";
		}
	},
	
	NA

}
