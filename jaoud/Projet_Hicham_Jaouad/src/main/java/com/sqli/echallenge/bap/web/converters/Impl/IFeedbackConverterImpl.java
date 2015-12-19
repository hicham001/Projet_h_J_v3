package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.FeedbackModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IFeedbackConverter;
import com.sqli.echallenge.bap.web.converters.IProjetConverter;
import com.sqli.echallenge.bap.web.converters.IQualificationConverter;
import com.sqli.echallenge.bap.web.dto.FeedbackDto;

public class IFeedbackConverterImpl implements IFeedbackConverter {
	
	private IQualificationConverter qualificationConverter;
	private ICollaborateurConverter colConverter;
	private IProjetConverter projetconverter;
	

	public void setProjetconverter(IProjetConverter projetconverter) {
		this.projetconverter = projetconverter;
	}

	public void setQualificationConverter(
			IQualificationConverter qualificationConverter) {
		this.qualificationConverter = qualificationConverter;
	}

	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}
	

	@Override
	public FeedbackDto convertModelDto(FeedbackModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public FeedbackModel convertDtoModel(FeedbackDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<FeedbackModel> convertListDtoModel(
			Collection<FeedbackDto> source){
		return convertListDtoModel(source, true);
	}

	@Override
	public Collection<FeedbackDto> convertListModelDto(
			Collection<FeedbackModel> source) {
		return convertListModelDto(source, true);
	}


	@Override
	public FeedbackDto convertModelDto(FeedbackModel source, boolean includeRelation) {
		FeedbackDto target = new FeedbackDto();
		if(source != null){
			if(includeRelation){
		target.setQualifications(qualificationConverter.converteListModelDto(source.getQualifications(), false));
		target.setCollaborateur(colConverter.convertModelDto(source.getCollaborateur(), false));
		target.setProjet(projetconverter.convertModelDto(source.getProjet(),false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setDatedebut(source.getDatedebut());
		target.setDatefin(source.getDatefin());
		target.setIdFeedback(source.getIdFeedback());
		target.setNbrJourValorise(source.getNbrJourValorise());
		target.setRemarqueG(source.getRemarqueG());
		target.setRolejouer(source.getRolejouer());
		target.setNoteGlobale(source.getNoteGlobale());
		target.setNbrThemeqal(source.getNbrThemeqal());
		target.setTotalPoids(source.getTotalPoids());
		
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public FeedbackModel convertDtoModel(FeedbackDto source, boolean includeRelation) {
		FeedbackModel target = new FeedbackModel();
		if(source != null){
			if(includeRelation){
		target.setQualifications(qualificationConverter.converteListDtoModel(source.getQualifications(), false));
		target.setCollaborateur(colConverter.convertDtoModel(source.getCollaborateur(), false));
		target.setProjet(projetconverter.convertDtoModel(source.getProjet(),false));
		}
		target.setCreationDate(source.getCreationDate());
		target.setDeleted(source.isDeleted());
		target.setModifiedDate(source.getModifiedDate());
		
		target.setDatedebut(source.getDatedebut());
		target.setDatefin(source.getDatefin());
		target.setIdFeedback(source.getIdFeedback());
		target.setNbrJourValorise(source.getNbrJourValorise());
		target.setRemarqueG(source.getRemarqueG());
		target.setRolejouer(source.getRolejouer());
		target.setNoteGlobale(source.getNoteGlobale());
		target.setNbrThemeqal(source.getNbrThemeqal());
		target.setTotalPoids(source.getTotalPoids());
	
		return target;
		}
		return null;
	}

	@Override
	public Collection<FeedbackModel> convertListDtoModel(
			Collection<FeedbackDto> source, boolean inclueRelation) {
		Collection<FeedbackModel> listModel = new ArrayList<FeedbackModel>();
		if(source != null){
			for (FeedbackDto dto : source) {
				listModel.add(convertDtoModel(dto, inclueRelation));
			}
			return listModel;
		}
		return null;
	}

	@Override
	public Collection<FeedbackDto> convertListModelDto(
			Collection<FeedbackModel> source, boolean includeRelation) {
		Collection<FeedbackDto> listDto = new ArrayList<FeedbackDto>();
		if(source != null){
			for (FeedbackModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

}
