package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sqli.echallenge.bap.model.CollaborateurModel;
import com.sqli.echallenge.bap.web.converters.IBapConverter;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IEvaluateurConverter;
import com.sqli.echallenge.bap.web.converters.IFeedbackConverter;
import com.sqli.echallenge.bap.web.converters.IManagerConverter;
import com.sqli.echallenge.bap.web.converters.IObjectifConverter;
import com.sqli.echallenge.bap.web.converters.IPosteConverter;
import com.sqli.echallenge.bap.web.dto.CollaborateurDto;

public class ICollaborateurConverterImpl implements ICollaborateurConverter{

	private IManagerConverter managerConverter;
	private IObjectifConverter objectifConverter;
	private IPosteConverter posteConverter;
	private IEvaluateurConverter evConverter;
	private IFeedbackConverter feedbackConverter;
	private IBapConverter bapConverter;
	
	
	public void setPosteConverter(IPosteConverter posteConverter) {
		this.posteConverter = posteConverter;
	}
	public void setEvConverter(IEvaluateurConverter evConverter) {
		this.evConverter = evConverter;
	}
	public void setFeedbackConverter(IFeedbackConverter feedbackConverter) {
		this.feedbackConverter = feedbackConverter;
	}
	public void setBapConverter(IBapConverter bapConverter) {
		this.bapConverter = bapConverter;
	}
	public void setObjectifConverter(IObjectifConverter objectifConverter) {
		this.objectifConverter = objectifConverter;
	}
	public void setManagerConverter(IManagerConverter managerConverter) {
		this.managerConverter = managerConverter;
	}
	
	
	@Override
	public CollaborateurModel convertDtoModel(CollaborateurDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public CollaborateurDto convertModelDto(CollaborateurModel source){
		return convertModelDto(source, true);
	}
	
	@Override
	public Collection<CollaborateurDto> converteListModelDto(
			Collection<CollaborateurModel> source){
		return converteListModelDto(source, true);
	}
	
	@Override
	public Collection<CollaborateurModel> converteListDtoModel(
			Collection<CollaborateurDto> source) {
		
		return converteListDtoModel(source, true);
	}
	@Override
	public CollaborateurDto convertModelDto(CollaborateurModel source, boolean includeRelation) {
		CollaborateurDto target = new CollaborateurDto();
		if(source!= null){
			if(includeRelation){
		target.setManager(managerConverter.convertModelDto(source.getManager(), false));
		target.setObjectifs(objectifConverter.convertListModelDto(source.getObjectifs(), false));
		target.setPoste(posteConverter.convertModelDto(source.getPoste(), false));
		target.setEvaluateurs(evConverter.convertListModelDto(source.getEvaluateurs(), false));
	    target.setBAPs(bapConverter.convertListModelDto(source.getBAPs(),false));
			}
		target.setCreationDate(source.getCreationDate());
		target.setModifiedDate(source.getModifiedDate());
		target.setDeleted(source.isDeleted());
		
		target.setMatricule(source.getMatricule());
		target.setNom(source.getNom());
		target.setPrenom(source.getPrenom());
		target.setAdresse(source.getAdresse());
		target.setDateEmbauche(source.getDateEmbauche());
		target.setEmail(source.getEmail());
		target.setDateDN(source.getDateDN());
		target.setPhoto(source.getPhoto());
		target.setPassword(source.getPassword());
		target.setPsseudo(source.getPsseudo());
		target.setSexe(source.getSexe());
		target.setTelephone(source.getTelephone());
		return target;
		}
		return null;
	}

	@Override
	public CollaborateurModel convertDtoModel(CollaborateurDto source, boolean includeRelation) {
		CollaborateurModel target = new CollaborateurModel();
		if(source != null){
			if(includeRelation){
		target.setManager(managerConverter.convertDtoModel(source.getManager(), false));
		target.setObjectifs(objectifConverter.convertListDtoModel(source.getObjectifs(), false));
		target.setPoste(posteConverter.convertDtoModel(source.getPoste(), false));
		target.setEvaluateurs(evConverter.convertListDtoModel(source.getEvaluateurs(), false));
		target.setFeedbacks(feedbackConverter.convertListDtoModel(source.getFeedbacks(), false));
		target.setBAPs(bapConverter.convertListDtoModel(source.getBAPs(), false));
		}
		target.setCreationDate(source.getCreationDate());
		target.setModifiedDate(source.getModifiedDate());
		target.setDeleted(source.isDeleted());
		
		target.setMatricule(source.getMatricule());
		target.setNom(source.getNom());
		target.setPrenom(source.getPrenom());
		target.setAdresse(source.getAdresse());
		target.setDateEmbauche(source.getDateEmbauche());
		target.setEmail(source.getEmail());
		target.setDateDN(source.getDateDN());
		target.setPhoto(source.getPhoto());
		target.setPassword(source.getPassword());
		target.setPsseudo(source.getPsseudo());
		target.setSexe(source.getSexe());
		target.setTelephone(source.getTelephone());
		
		
		return target;
		}
		return null;
	}
	@Override
	public Collection<CollaborateurDto> converteListModelDto(
			Collection<CollaborateurModel> source, boolean includeRelation) {
		Collection<CollaborateurDto> listDto = new ArrayList<CollaborateurDto>();
		if(source != null){
			for (CollaborateurModel Model : source) {
						listDto.add(convertModelDto(Model,includeRelation));
			}
		}
		return listDto;
	}
	
	@Override
	public Collection<CollaborateurModel> converteListDtoModel(
			Collection<CollaborateurDto> source, boolean includeRelation) {
		Collection<CollaborateurModel> listModel = new ArrayList<CollaborateurModel>();
		if(source != null){
			for (CollaborateurDto dto : source) {
				listModel.add(convertDtoModel(dto,includeRelation));
			}
		}
		return listModel;
	}



}
