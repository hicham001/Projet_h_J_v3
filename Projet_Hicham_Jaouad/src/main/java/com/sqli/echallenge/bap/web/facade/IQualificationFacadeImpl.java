package com.sqli.echallenge.bap.web.facade;

import java.util.ArrayList;
import java.util.List;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.model.QualificationModel;
import com.sqli.echallenge.bap.service.IQualificationService;
import com.sqli.echallenge.bap.web.converters.IQualificationConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;
import com.sqli.echallenge.bap.web.dto.QualificationDto;

public class IQualificationFacadeImpl implements IQualificationFacade{

	private IQualificationService qualificationService;
	private IQualificationConverter converter;
	
	
	public void setQualificationService(IQualificationService qualificationService) {
		this.qualificationService = qualificationService;
	}

	public void setConverter(IQualificationConverter converter) {
		this.converter = converter;
	}

	@Override
	public QualificationDto find(Long i) {
		return converter.convertModelDto(qualificationService.find(i));
	}

	@Override
	public Boolean delete(Long id) {
		return qualificationService.delete(id);
	}

	@Override
	public QualificationDto edit(QualificationDto dto) {
		QualificationModel model = converter.convertDtoModel(dto);
		if(model != null)
		return (QualificationDto) converter.convertModelDto(qualificationService.edit(model));
		return null;
	}

	@Override
	public QualificationDto save(QualificationDto dto) {
		QualificationModel model = converter.convertDtoModel(dto);
		if(model != null)
		return converter.convertModelDto(qualificationService.save(model));
		return null;
	}

	@Override
	public List<QualificationDto> findAll() {

		List<QualificationDto> objDtoList = new ArrayList<QualificationDto>();
		List<QualificationModel> objList = qualificationService.findAll();
		if(objList != null){
			for (QualificationModel obj : objList) {
				objDtoList.add(converter.convertModelDto(obj));
			}
			return objDtoList;
		}
			return null;
	}

	@Override
	public List<QualificationDto> addList(List<QualificationDto> list) {
		List<QualificationDto> listR = new ArrayList<QualificationDto>();
		for(QualificationDto qual : list){
			QualificationDto q = this.save(qual);
			listR.add(q);
		}
		return listR;
		
	}

}
