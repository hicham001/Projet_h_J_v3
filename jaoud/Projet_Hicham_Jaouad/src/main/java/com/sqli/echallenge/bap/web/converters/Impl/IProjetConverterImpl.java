package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.ProjetModel;
import com.sqli.echallenge.bap.model.QualificationModel;
import com.sqli.echallenge.bap.web.converters.IManagerConverter;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.converters.IProjetConverter;
import com.sqli.echallenge.bap.web.dto.ProjetDto;
import com.sqli.echallenge.bap.web.dto.QualificationDto;
import com.sqli.echallenge.bap.web.dto.SujetDto;

public class IProjetConverterImpl implements IProjetConverter{

	private IManagerConverter managerConverter;
	private IObjectifConverter objConverter;
	private IEvaluateurConverterImpl evConverter;
	
	
	
	public void setEvConverter(IEvaluateurConverterImpl evConverter) {
		this.evConverter = evConverter;
	}

	public void setManagerConverter(IManagerConverter managerConverter) {
		this.managerConverter = managerConverter;
	}

	public void setObjConverter(IObjectifConverter objConverter) {
		this.objConverter = objConverter;
	}
	@Override
	public ProjetDto convertModelDto(ProjetModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public ProjetModel convertDtoModel(ProjetDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<ProjetDto> converteListModelDto(
			Collection<ProjetModel> source) {
		return converteListModelDto(source, true);
	}

	@Override
	public Collection<ProjetModel> converteListDtoModel(
			Collection<ProjetDto> source) {
		return converteListDtoModel(source, true);
	}

	@Override
	public ProjetDto convertModelDto(ProjetModel source, boolean includeRelation) {
		ProjetDto target = new ProjetDto();
		if(source != null){
			if(includeRelation){
		target.setManager(managerConverter.convertModelDto(source.getManager(), false));
		target.setObjectifs(objConverter.convertListModelDto(source.getObjectifs(), false));
		target.setEvaluateurs(evConverter.convertListModelDto(source.getEvaluateurs(), false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setCategorie(source.getCategorie());
		target.setCodeprojet(source.getCodeprojet());
		target.setDateP(source.getDateP());
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public ProjetModel convertDtoModel(ProjetDto source, boolean includeRelation) {
		ProjetModel target = new ProjetModel();
		if(source != null){
			if(includeRelation){
		target.setManager(managerConverter.convertDtoModel(source.getManager(), false));
		target.setObjectifs(objConverter.convertListDtoModel(source.getObjectifs(), false));
		target.setEvaluateurs(evConverter.convertListDtoModel(source.getEvaluateurs(), false));
		}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setCategorie(source.getCategorie());
		target.setCodeprojet(source.getCodeprojet());
		target.setDateP(source.getDateP());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public Collection<ProjetDto> converteListModelDto(
			Collection<ProjetModel> source, boolean includeRelation) {
		Collection<ProjetDto> listDto = new ArrayList<ProjetDto>();
		if(source != null){
			for (ProjetModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<ProjetModel> converteListDtoModel(
			Collection<ProjetDto> source, boolean includeRelation) {
		Collection<ProjetModel> listModel = new ArrayList<ProjetModel>();
		if(source != null){
			for (ProjetDto dto : source) {
				listModel.add(convertDtoModel(dto, includeRelation));
			}
			return listModel;
		}
		return null;
	}



}
