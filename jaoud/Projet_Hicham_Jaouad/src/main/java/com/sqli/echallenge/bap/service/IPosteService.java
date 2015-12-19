package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.PosteModel;

public interface IPosteService {

	public PosteModel find(Long modelId);
	public Boolean delete(Long id);
	public PosteModel edit(PosteModel model);
	public PosteModel save(PosteModel model);
	public List<PosteModel> findAll();
}
