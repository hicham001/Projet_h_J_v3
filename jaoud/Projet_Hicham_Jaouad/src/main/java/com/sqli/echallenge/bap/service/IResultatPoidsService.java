package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.ResultatPoidsModel;

public interface IResultatPoidsService {
	
	public ResultatPoidsModel find(Long modelId);
	public Boolean delete(Long id);
	public ResultatPoidsModel edit(ResultatPoidsModel model);
	public ResultatPoidsModel save(ResultatPoidsModel model);
	public List<ResultatPoidsModel> findAll();

}
