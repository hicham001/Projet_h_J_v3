package com.sqli.echallenge.bap.web.facade;

import java.util.List;

import com.sqli.echallenge.bap.web.dto.QualificationDto;

public interface IQualificationFacade {
	public QualificationDto find(Long i);
	public Boolean delete(Long id);
	public QualificationDto edit(QualificationDto dto);
	public QualificationDto save(QualificationDto dto);
	public List<QualificationDto> findAll();
	public List<QualificationDto> addList(List<QualificationDto> list);

}
