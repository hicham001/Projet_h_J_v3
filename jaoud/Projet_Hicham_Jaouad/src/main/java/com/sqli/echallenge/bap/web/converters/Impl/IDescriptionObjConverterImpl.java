package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.DescriptionObjModel;
import com.sqli.echallenge.bap.web.converters.IDescriptionObjConverter;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.converters.IResultatPoidsConverter;
import com.sqli.echallenge.bap.web.dto.DescriptionObjDto;

public class IDescriptionObjConverterImpl implements IDescriptionObjConverter{

	private IObjectifConverter objectifConverter;
	private IResultatPoidsConverter resultatPoids;
	
	
	public void setResultatPoids(IResultatPoidsConverter resultatPoids) {
		this.resultatPoids = resultatPoids;
	}

	public void setObjectifConverter(IObjectifConverter objectifConverter) {
		this.objectifConverter = objectifConverter;
	}

	@Override
	public DescriptionObjDto convertModelDto(DescriptionObjModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public DescriptionObjModel convertDtoModel(DescriptionObjDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<DescriptionObjDto> convertListModelDto(
			Collection<DescriptionObjModel> source) {
		return convertListModelDto(source, true);
	}

	@Override
	public Collection<DescriptionObjModel> convertListDtoModel(
			Collection<DescriptionObjDto> source) {
		return convertListDtoModel(source, true);
	}
	@Override
	public DescriptionObjDto convertModelDto(DescriptionObjModel source, boolean includeRelation) {
		DescriptionObjDto target = new DescriptionObjDto();
		if(source != null){
			if(includeRelation){
		target.setObjectif(objectifConverter.convertModelDto(source.getObjectif(), false));
		target.setResultatpoids(resultatPoids.converteListModelDto(source.getResultatpoids(),false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setDescription(source.getDescription());
		target.setId(source.getId());
		target.setMesure(source.getMesure());
		target.setResponsableMesure(source.getResponsableMesure());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public DescriptionObjModel convertDtoModel(DescriptionObjDto source, boolean includeRelation) {
		DescriptionObjModel target = new DescriptionObjModel();
		if(source != null){
			if(includeRelation){
		target.setObjectif(objectifConverter.convertDtoModel(source.getObjectif(), false));
        target.setResultatpoids(resultatPoids.converteListDtoModel(source.getResultatpoids(), false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setDescription(source.getDescription());
		target.setId(source.getId());
		target.setMesure(source.getMesure());
		target.setResponsableMesure(source.getResponsableMesure());
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public Collection<DescriptionObjDto> convertListModelDto(
			Collection<DescriptionObjModel> source, boolean includeRelation) {
		Collection<DescriptionObjDto> listDto = new ArrayList<DescriptionObjDto>();
		if(source != null){
			for (DescriptionObjModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<DescriptionObjModel> convertListDtoModel(
		Collection<DescriptionObjDto> source, boolean includeRelation) {
		Collection<DescriptionObjModel> listModel = new ArrayList<DescriptionObjModel>();
		if(source != null){
			for (DescriptionObjDto dto : source) {
				listModel.add(convertDtoModel(dto, includeRelation));
			}
			return listModel;
		}
		return null;
	}

	

}
