package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.BAPModel;
import com.sqli.echallenge.bap.model.FeedbackModel;
import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.web.converters.IBapConverter;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.dto.BAPDto;
import com.sqli.echallenge.bap.web.dto.FeedbackDto;

public class IBapConverterImpl implements IBapConverter{

	private ICollaborateurConverter colConverter;
	
	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}
	
	@Override
	public BAPDto convertModelDto(BAPModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public BAPModel convertDtoModel(BAPDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<BAPDto> convertListModelDto(Collection<BAPModel> source) {
		return convertListModelDto(source, true);
	}

	@Override
	public Collection<BAPModel> convertListDtoModel(Collection<BAPDto> source) {
		return convertListDtoModel(source, true);
	}

	@Override
	public BAPDto convertModelDto(BAPModel source, boolean includeRelation) {
		BAPDto target = new BAPDto();
		if(source != null){
			if(includeRelation)
		target.setCollaborateur(colConverter.convertModelDto(source.getColaborateur(), false));
		
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setDatedebut(source.getDatedebut());
		target.setDatefin(source.getDatefin());
		target.setMode(source.getMode());
		target.setResultatFinale(source.getResultatFinale());
		target.setStatut(source.getStatut());
		target.setId(source.getId());
		
		return target;
		}
		return null;
	}

	@Override
	public BAPModel convertDtoModel(BAPDto source, boolean includeRelation) {
		BAPModel target = new BAPModel();
		if(source != null){
			if(includeRelation)
		target.setColaborateur(colConverter.convertDtoModel(source.getCollaborateur(), false));
			
		target.setCreationDate(source.getCreationDate());
		target.setModifiedDate(source.getModifiedDate());
		target.setDeleted(source.isDeleted());
		
		target.setDatedebut(source.getDatedebut());
		target.setDatefin(source.getDatefin());
		target.setMode(source.getMode());
		target.setResultatFinale(source.getResultatFinale());
		target.setStatut(source.getStatut());
		target.setId(source.getId());
		
		return target;
		}
		return null;
	}

	@Override
	public Collection<BAPDto> convertListModelDto(Collection<BAPModel> source, boolean includeRelation) {
		Collection<BAPDto> listDto = new ArrayList<BAPDto>();
		if(source != null){
			for (BAPModel Model : source) {
				listDto.add(convertModelDto(Model,includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<BAPModel> convertListDtoModel(Collection<BAPDto> source, boolean includeRelation) {
		Collection<BAPModel> listModel = new ArrayList<BAPModel>();
		if(source != null){
			for (BAPDto dto : source) {
				listModel.add(convertDtoModel(dto, includeRelation));
			}
			return listModel;
		}
		return null;
	}



}
