package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.SujetModel;

public interface ISujetService {


	public SujetModel find(Long modelId);
	public Boolean delete(Long id);
	public SujetModel edit(SujetModel sujet);
	public SujetModel save(SujetModel sujet);
	public List<SujetModel> findAll();
}
