package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.model.ProjetModel;

public interface IObjectifService  {

	public ObjectifModel find(Long modelId);
	public Boolean delete(Long id);
	public ObjectifModel edit(ObjectifModel obj);
	public ObjectifModel save(ObjectifModel obj);
	public List<ObjectifModel> findAll();

}
