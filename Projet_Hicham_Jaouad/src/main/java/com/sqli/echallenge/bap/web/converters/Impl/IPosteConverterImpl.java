package com.sqli.echallenge.bap.web.converters.Impl;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.PosteModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IPosteConverter;
import com.sqli.echallenge.bap.web.dto.PosteDto;

public class IPosteConverterImpl implements IPosteConverter{

	private ICollaborateurConverter colConverter;
	
	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}
	
	@Override
	public PosteDto convertModelDto(PosteModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public PosteModel convertDtoModel(PosteDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public PosteDto convertModelDto(PosteModel source, boolean includeRelation) {
		PosteDto target = new PosteDto();
		if(source != null){
			if(includeRelation)
			target.setCollaborateurs(colConverter.converteListModelDto(source.getCollaborateurs(), false));
			
			target.setCreationDate(source.getCreationDate());
			target.setDeleted(source.isDeleted());
			target.setModifiedDate(source.getModifiedDate());
			
			target.setIdPost(source.getIdPost());
			target.setIntitule(source.getIntitule());
			
			//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public PosteModel convertDtoModel(PosteDto source, boolean includeRelation) {
		PosteModel target = new PosteModel();
		if(source != null){
			if(includeRelation)
		target.setCollaborateurs(colConverter.converteListDtoModel(source.getCollaborateurs(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setIdPost(source.getIdPost());
		target.setIntitule(source.getIntitule());
			
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}


	

}
