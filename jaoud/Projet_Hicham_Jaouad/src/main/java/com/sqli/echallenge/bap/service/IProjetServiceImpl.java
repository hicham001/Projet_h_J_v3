package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IProjetDao;
import com.sqli.echallenge.bap.model.ProjetModel;

@Transactional
public class IProjetServiceImpl implements IProjetService{
	
	private IProjetDao projetDao;
	

	public void setProjetDao(IProjetDao projetDao) {
		this.projetDao = projetDao;
	}

	@Override
	public ProjetModel find(String modelId) {
		return projetDao.find(modelId);
	}

	@Override
	public Boolean delete(String id) {
		return projetDao.delete(id);
	}

	@Override
	public ProjetModel edit(ProjetModel projet) {
		return projetDao.edit(projet);
	}

	@Override
	public ProjetModel save(ProjetModel projet) {
		return projetDao.save(projet);
	}

	@Override
	public List<ProjetModel> findAll() {
		return projetDao.findAll();
	}

}
