package com.sqli.echallenge.bap.dao;

import com.sqli.echallenge.bap.model.ProjetModel;

public interface IProjetDao extends IGenericDao<ProjetModel>{
	
	 public ProjetModel find(String modelMat);
	    public boolean delete(String mat);

}
