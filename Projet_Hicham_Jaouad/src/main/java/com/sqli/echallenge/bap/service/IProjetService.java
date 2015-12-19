package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.ProjetModel;

public interface IProjetService {


	public ProjetModel find(String modelId);
	public Boolean delete(String id);
	public ProjetModel edit(ProjetModel feedback);
	public ProjetModel save(ProjetModel feeback);
	public List<ProjetModel> findAll();
}
