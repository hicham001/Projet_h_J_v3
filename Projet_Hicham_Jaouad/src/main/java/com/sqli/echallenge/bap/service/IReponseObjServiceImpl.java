package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IReponseObjDao;
import com.sqli.echallenge.bap.model.ReponseObjModel;

@Transactional
public class IReponseObjServiceImpl implements IReponseObjService{

	private IReponseObjDao reponseObjDao;
	
	
	public void setReponseObjDao(IReponseObjDao reponseObjDao) {
		this.reponseObjDao = reponseObjDao;
	}

	@Override
	public ReponseObjModel find(Long modelId) {
		return reponseObjDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return reponseObjDao.delete(id);
	}

	@Override
	public ReponseObjModel edit(ReponseObjModel model) {
		return reponseObjDao.edit(model);
	}

	@Override
	public ReponseObjModel save(ReponseObjModel model) {
		return reponseObjDao.save(model);
	}

	@Override
	public List<ReponseObjModel> findAll() {
		return reponseObjDao.findAll();
	}

}
