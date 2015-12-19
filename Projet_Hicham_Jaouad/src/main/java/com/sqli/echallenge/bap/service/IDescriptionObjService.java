package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.DescriptionObjModel;

public interface IDescriptionObjService {

	public DescriptionObjModel find(Long modelId);
	public Boolean delete(Long id);
	public DescriptionObjModel edit(DescriptionObjModel des);
	public DescriptionObjModel save(DescriptionObjModel des);
	public List<DescriptionObjModel> findAll();
}
