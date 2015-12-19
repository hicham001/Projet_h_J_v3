package com.sqli.echallenge.bap.web.converters.Impl;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.EvaluateurModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IEvaluateurConverter;
import com.sqli.echallenge.bap.web.dto.EvaluateurDto;

public class IEvaluateurConverterImpl implements IEvaluateurConverter {

	private ICollaborateurConverter colConverter;
	private IProjetConverterImpl projetConverter;
	
	
	public void setProjetConverter(IProjetConverterImpl projetConverter) {
		this.projetConverter = projetConverter;
	}

	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}

	@Override
	public EvaluateurDto convertModelDto(EvaluateurModel source) {
		return convertModelDto(source, true);
	}

	@Override
	public EvaluateurModel convertDtoModel(EvaluateurDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public Collection<EvaluateurDto> convertListModelDto(
			Collection<EvaluateurModel> source) {
		return convertListModelDto(source, true);
	}

	@Override
	public Collection<EvaluateurModel> convertListDtoModel(
			Collection<EvaluateurDto> source) {
		return convertListDtoModel(source, true);
	}

	@Override
	public EvaluateurDto convertModelDto(EvaluateurModel source, boolean includeRelation) {
		EvaluateurDto target = new EvaluateurDto();
		if(source != null){
			if(includeRelation){
		target.setCollaborateurs(colConverter.converteListModelDto(source.getCollaborateurs(), false));
		target.setProjets(projetConverter.converteListModelDto(source.getProjets(), false));
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
	public EvaluateurModel convertDtoModel(EvaluateurDto source, boolean includeRelation) {
		EvaluateurModel target = new EvaluateurModel();
		if(source != null){
			if(includeRelation){
		target.setCollaborateurs(colConverter.converteListDtoModel(source.getCollaborateurs(), false));
		target.setProjets(projetConverter.converteListDtoModel(source.getProjets(), false));
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
		
		//BeanUtils.copyProperties(source, target);
		return target;
		}
		return null;
	}

	@Override
	public Collection<EvaluateurDto> convertListModelDto(
			Collection<EvaluateurModel> source, boolean includeRelation) {
		Collection<EvaluateurDto> listDto = new ArrayList<EvaluateurDto>();
		if(source != null){
			for (EvaluateurModel Model : source) {
				listDto.add(convertModelDto(Model, includeRelation));
			}
			return listDto;
		}
		return null;
	}

	@Override
	public Collection<EvaluateurModel> convertListDtoModel(
			Collection<EvaluateurDto> source, boolean includeRelation) {
		Collection<EvaluateurModel> listModel = new ArrayList<EvaluateurModel>();
		if(source != null){
			for (EvaluateurDto Model : source) {
				listModel.add(convertDtoModel(Model, includeRelation));
			}
			return listModel;
		}
		return null;
	}


}
