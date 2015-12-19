package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IPosteDao;
import com.sqli.echallenge.bap.model.PosteModel;

@Transactional
public class IPosteServiceImpl implements IPosteService{

	private IPosteDao posteDao;
	
	public void setPosteDao(IPosteDao posteDao) {
		this.posteDao = posteDao;
	}

	@Override
	public PosteModel find(Long modelId) {
		return posteDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return posteDao.delete(id);
	}

	@Override
	public PosteModel edit(PosteModel model) {
		return posteDao.edit(model);
	}

	@Override
	public PosteModel save(PosteModel model) {
		return posteDao.save(model);
	}

	@Override
	public List<PosteModel> findAll() {
		return posteDao.findAll();
	}

}
