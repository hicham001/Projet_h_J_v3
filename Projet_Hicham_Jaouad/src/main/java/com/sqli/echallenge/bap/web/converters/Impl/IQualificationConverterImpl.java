package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.QualificationModel;
import com.sqli.echallenge.bap.web.converters.IFeedbackConverter;
import com.sqli.echallenge.bap.web.converters.IQualificationConverter;
import com.sqli.echallenge.bap.web.dto.QualificationDto;

public class IQualificationConverterImpl implements IQualificationConverter{

	private IFeedbackConverter feedbackConverter;
	
	public void setFeedbackConverter(IFeedbackConverter feedbackConverter) {
		this.feedbackConverter = feedbackConverter;
	}
	

	@Override
	public QualificationDto convertModelDto(QualificationModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public QualificationModel convertDtoModel(QualificationDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<QualificationDto> converteListModelDto(
			Collection<QualificationModel> source) {
		return converteListModelDto(source, true);
	}

	@Override
	public Collection<QualificationModel> converteListDtoModel(
			Collection<QualificationDto> source) {
		return converteListDtoModel(source, true);
	}


	@Override
	public QualificationDto convertModelDto(QualificationModel source, boolean inlcudeRelation) {
		QualificationDto target = new QualificationDto();
		if(source != null){
			if(inlcudeRelation)
		target.setFeedback(feedbackConverter.convertModelDto(source.getFeedback(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdQualification(source.getIdQualification());
		target.setRemarque(source.getRemarque());
		target.setTheme(source.getTheme());
		target.setValeur(source.getValeur());
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public QualificationModel convertDtoModel(QualificationDto source, boolean includeRelation) {
		QualificationModel target = new QualificationModel();
		if(source != null){
			if(includeRelation)
		target.setFeedback(feedbackConverter.convertDtoModel(source.getFeedback(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdQualification(source.getIdQualification());
		target.setRemarque(source.getRemarque());
		target.setTheme(source.getTheme());
		target.setValeur(source.getValeur());
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public Collection<QualificationDto> converteListModelDto(
			Collection<QualificationModel> source, boolean includeRelation) {
		Collection<QualificationDto> listDto = new ArrayList<QualificationDto>();
		if(source != null){
			for (QualificationModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<QualificationModel> converteListDtoModel(
			Collection<QualificationDto> source, boolean includeRelation) {
		Collection<QualificationModel> listModel = new ArrayList<QualificationModel>();
		if(source != null){
			for (QualificationDto dto : source) {
				listModel.add(convertDtoModel(dto, includeRelation));
			}
			return listModel;
		}
		return null;
	}

}
