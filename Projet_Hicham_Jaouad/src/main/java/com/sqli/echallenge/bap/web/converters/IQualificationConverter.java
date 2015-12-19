package com.sqli.echallenge.bap.web.converters;

import java.util.Collection;

import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.model.QualificationModel;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;
import com.sqli.echallenge.bap.web.dto.QualificationDto;

public interface IQualificationConverter {

	public QualificationDto convertModelDto(QualificationModel source);
	public QualificationModel convertDtoModel(QualificationDto source);
	
	public QualificationDto convertModelDto(QualificationModel source, boolean includeRelation);
	public QualificationModel convertDtoModel(QualificationDto source, boolean includeRelation);

	public Collection<QualificationDto> converteListModelDto(Collection<QualificationModel> source);
	public Collection<QualificationModel> converteListDtoModel(Collection<QualificationDto> source);
	
	public Collection<QualificationDto> converteListModelDto(Collection<QualificationModel> source, boolean includeRelation);
	public Collection<QualificationModel> converteListDtoModel(Collection<QualificationDto> source, boolean includeRelation);

}
