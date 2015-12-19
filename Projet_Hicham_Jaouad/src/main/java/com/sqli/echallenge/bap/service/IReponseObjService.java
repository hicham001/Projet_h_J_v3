package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.ReponseObjModel;

public interface IReponseObjService {
	public ReponseObjModel find(Long modelId);
	public Boolean delete(Long id);
	public ReponseObjModel edit(ReponseObjModel model);
	public ReponseObjModel save(ReponseObjModel model);
	public List<ReponseObjModel> findAll();

}
