package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.ResultatPoidsModel;
import com.sqli.echallenge.bap.web.converters.IResultatPoidsConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.ResultatPoidsDto;

public class IResultatPoidsConverterImpl implements IResultatPoidsConverter{

	private ICollaborateurConverterImpl colConverter;
	private IDescriptionObjConverterImpl desConverter;
	
	public ICollaborateurConverterImpl getColConverter() {
		return colConverter;
	}

	public void setColConverter(ICollaborateurConverterImpl colConverter) {
		this.colConverter = colConverter;
	}

	public IDescriptionObjConverterImpl getDesConverter() {
		return desConverter;
	}

	public void setDesConverter(IDescriptionObjConverterImpl desConverter) {
		this.desConverter = desConverter;
	}

	@Override
	public ResultatPoidsModel convertDtoModel(ResultatPoidsDto source) {
		return convertDtoModel(source, true);
	}
	
	@Override
	public ResultatPoidsDto convertModelDto(ResultatPoidsModel source) {
		
		return convertModelDto(source, true);
	}
	

	@Override
	public Collection<ResultatPoidsDto> converteListModelDto(
			Collection<ResultatPoidsModel> source) {
		return converteListModelDto(source, true);
	}

	@Override
	public Collection<ResultatPoidsModel> converteListDtoModel(
			Collection<ResultatPoidsDto> source) {
		return converteListDtoModel(source, true);
	}


	@Override
	public ResultatPoidsModel convertDtoModel(ResultatPoidsDto source,
			boolean includeRelation) {
		ResultatPoidsModel target = new ResultatPoidsModel();
		if(source != null){
			if(includeRelation){
		target.setCollaborateur(colConverter.convertDtoModel(source.getCollaborateur(), false));
		target.setDescription((desConverter.convertDtoModel(source.getDescriptionObj(), false)));
			}
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setPoids(source.getPoids());
		target.setResultat(source.getResultat());
		target.setId(source.getId());
		
		return target;
		}
		
		return null;
	}

	@Override
	public ResultatPoidsDto convertModelDto(ResultatPoidsModel source,
			boolean includeRelation) {
		ResultatPoidsDto target = new ResultatPoidsDto();
		if(source != null){
			if(includeRelation){
		target.setCollaborateur(colConverter.convertModelDto(source.getCollaborateur(), false));
		target.setDescriptionObj(desConverter.convertModelDto(source.getDescription(), false));
			}
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setPoids(source.getPoids());
		target.setResultat(source.getResultat());
		target.setId(source.getId());
		
		return target;
		}
		
		return null;
	}

	@Override
	public Collection<ResultatPoidsDto> converteListModelDto(
			Collection<ResultatPoidsModel> source, boolean includeRelation) {
		Collection<ResultatPoidsDto> listDto = new ArrayList<ResultatPoidsDto>();
		if(source != null){
			for (ResultatPoidsModel Model : source) {
				listDto.add(convertModelDto(Model,includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<ResultatPoidsModel> converteListDtoModel(
			Collection<ResultatPoidsDto> source, boolean includeRelation) {
		Collection<ResultatPoidsModel> listDto = new ArrayList<ResultatPoidsModel>();
		if(source != null){
			for (ResultatPoidsDto Model : source) {
				listDto.add(convertDtoModel(Model,includeRelation));
			}
			return listDto;
		}
		return null;
	}

	
}
