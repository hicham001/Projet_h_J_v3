package com.sqli.echallenge.bap.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.sqli.echallenge.bap.dao.IQualificationDao;
import com.sqli.echallenge.bap.model.QualificationModel;


@Transactional
public class IQualificationServiceImpl implements IQualificationService {

	private IQualificationDao qualificationDao;

	public void setQualificationDao(IQualificationDao qualificationDao) {
		this.qualificationDao = qualificationDao;
	}

	@Override
	public QualificationModel find(Long modelId) {
		return qualificationDao.find(modelId);
	}

	@Override
	public Boolean delete(Long id) {
		// TODO Auto-generated method stub
		return qualificationDao.delete(id);
	}

	@Override
	public QualificationModel edit(QualificationModel model) {
		return qualificationDao.edit(model);
	}

	@Override
	public QualificationModel save(QualificationModel model) {
		return qualificationDao.save(model);
	}

	@Override
	public List<QualificationModel> findAll() {
		return qualificationDao.findAll();
	}
	
	
}
