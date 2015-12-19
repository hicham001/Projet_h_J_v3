package com.sqli.echallenge.bap.web.converters.Impl;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.ObjectifModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IDescriptionObjConverter;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.converters.IProjetConverter;
import com.sqli.echallenge.bap.web.converters.IReponseObjConverter;
import com.sqli.echallenge.bap.web.dto.ObjectifDto;

public class IObjectifConverterImpl implements IObjectifConverter {

	private IProjetConverter projetConverter;
	private ICollaborateurConverter colConverter;
	private IDescriptionObjConverter desConverter;
	private IReponseObjConverter repConverter;
	
	
	public void setProjetConverter(IProjetConverter projetConverter) {
		this.projetConverter = projetConverter;
	}

	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}

	public void setDesConverter(IDescriptionObjConverter desConverter) {
		this.desConverter = desConverter;
	}

	public void setRepConverter(IReponseObjConverter repConverter) {
		this.repConverter = repConverter;
	}
	
	@Override
	public ObjectifDto convertModelDto(ObjectifModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public ObjectifModel convertDtoModel(ObjectifDto source) {	
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<ObjectifDto> convertListModelDto(
			Collection<ObjectifModel> source) {
		return convertListModelDto(source, true);
	}

	@Override
	public Collection<ObjectifModel> convertListDtoModel(
			Collection<ObjectifDto> source) {
		return convertListDtoModel(source, true);
	}


	@Override
	public ObjectifDto convertModelDto(ObjectifModel source, boolean includeRelation) {
		ObjectifDto target = new ObjectifDto();
		if(source != null){
			if(includeRelation){

		target.setDescriptions(desConverter.convertListModelDto(source.getDescriptions(), false));
		target.setProjet(projetConverter.convertModelDto(source.getProjet(), false));
		target.setCollaborateurs(colConverter.converteListModelDto(source.getCollaborateurs(), false));
		target.setReponse(repConverter.convertModelDto(source.getReponse(), false));
		}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdObjectif(source.getIdObjectif());
		target.setIntitule(source.getIntitule());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public ObjectifModel convertDtoModel(ObjectifDto source, boolean includeRelation) {
		ObjectifModel target = new ObjectifModel();
		if(source != null){
			if(includeRelation){
		target.setProjet(projetConverter.convertDtoModel(source.getProjet(), false));
		target.setCollaborateurs(colConverter.converteListDtoModel(source.getCollaborateurs(), false));
		target.setDescriptions(desConverter.convertListDtoModel(source.getDescriptions(), false));
		target.setReponse(repConverter.convertDtoModel(source.getReponse(), false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdObjectif(source.getIdObjectif());
		target.setIntitule(source.getIntitule());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public Collection<ObjectifDto> convertListModelDto(
			Collection<ObjectifModel> source, boolean includeRelation) {
		Collection<ObjectifDto> listDto = new ArrayList<ObjectifDto>();
		if(source != null){
			for (ObjectifModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<ObjectifModel> convertListDtoModel(
			Collection<ObjectifDto> source, boolean includeRelation) {
		Collection<ObjectifModel> listModel = new ArrayList<ObjectifModel>();
		if(source != null){
			for (ObjectifDto dto : source) {
				listModel.add(convertDtoModel(dto, includeRelation));
			}
			return listModel;
		}
		return null;
	}


}
