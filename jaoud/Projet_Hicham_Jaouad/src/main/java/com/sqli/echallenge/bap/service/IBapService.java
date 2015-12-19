package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.BAPModel;

public interface IBapService {

	public BAPModel find(Long modelId);
	public Boolean delete(Long id);
	public BAPModel edit(BAPModel model);
	public BAPModel save(BAPModel model);
	public List<BAPModel> findAll();

}
