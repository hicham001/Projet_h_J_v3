package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IDescriptionObjDao;
import com.sqli.echallenge.bap.model.DescriptionObjModel;

@Transactional
public class IDescriptionObjServiceImpl implements IDescriptionObjService{

	private IDescriptionObjDao descriptionObjDao;
	
	public void setDescriptionObjDao(IDescriptionObjDao descriptionObjDao) {
		this.descriptionObjDao = descriptionObjDao;
	}

	@Override
	public DescriptionObjModel find(Long modelId) {
		return descriptionObjDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		return descriptionObjDao.delete(id);
	}

	@Override
	public DescriptionObjModel edit(DescriptionObjModel des) {
		return descriptionObjDao.edit(des);
	}

	@Override
	public DescriptionObjModel save(DescriptionObjModel des) {
		return descriptionObjDao.save(des);
	}

	@Override
	public List<DescriptionObjModel> findAll(){ 
		return descriptionObjDao.findAll();
	}

}
