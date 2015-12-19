package com.sqli.echallenge.bap.service;

import java.util.List;

import com.sqli.echallenge.bap.model.QualificationModel;

public interface IQualificationService {
	public QualificationModel find(Long modelId);
	public Boolean delete(Long id);
	public QualificationModel edit(QualificationModel model);
	public QualificationModel save(QualificationModel model);
	public List<QualificationModel> findAll();


}
