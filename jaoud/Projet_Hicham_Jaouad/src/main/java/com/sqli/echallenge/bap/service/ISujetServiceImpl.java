package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.ISujetDao;
import com.sqli.echallenge.bap.model.SujetModel;

@Transactional
public class ISujetServiceImpl implements ISujetService{

	private ISujetDao sujetDao;
	
	public void setSujetDao(ISujetDao sujetDao) {
		this.sujetDao = sujetDao;
	}

	@Override
	public SujetModel find(Long modelId) {
		return sujetDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return sujetDao.delete(id);
	}

	@Override
	public SujetModel edit(SujetModel sujet) {
		return sujetDao.edit(sujet);
	}

	@Override
	public SujetModel save(SujetModel sujet) {
		return sujetDao.save(sujet);
	}

	@Override
	public List<SujetModel> findAll() {
		return sujetDao.findAll();
	}

}
