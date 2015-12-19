package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IResultatPoidsDao;
import com.sqli.echallenge.bap.model.ResultatPoidsModel;

@Transactional
public class IResultatPoidsServiceImpl implements IResultatPoidsService{

	private IResultatPoidsDao resultatPoidDao;
	
	public void setResultatPoidDao(IResultatPoidsDao resultatPoidDao) {
		this.resultatPoidDao = resultatPoidDao;
	}

	@Override
	public ResultatPoidsModel find(Long modelId) {
		return resultatPoidDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return resultatPoidDao.delete(id);
	}

	@Override
	public ResultatPoidsModel edit(ResultatPoidsModel model) {
		return resultatPoidDao.edit(model);
	}

	@Override
	public ResultatPoidsModel save(ResultatPoidsModel model) {
		return resultatPoidDao.save(model);
	}
	
	@Override
	public List<ResultatPoidsModel> findAll() {
		return resultatPoidDao.findAll();
	}

}
