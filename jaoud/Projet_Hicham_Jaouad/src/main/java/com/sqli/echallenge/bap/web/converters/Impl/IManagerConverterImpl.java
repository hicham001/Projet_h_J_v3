package com.sqli.echallenge.bap.web.converters.Impl;

import org.springframework.beans.BeanUtils;

import com.sqli.echallenge.bap.model.ManagerModel;
import com.sqli.echallenge.bap.web.converters.ICollaborateurConverter;
import com.sqli.echallenge.bap.web.converters.IManagerConverter;
import com.sqli.echallenge.bap.web.converters.IProjetConverter;
import com.sqli.echallenge.bap.web.converters.ISujetConverter;
import com.sqli.echallenge.bap.web.dto.ManagerDto;

public class IManagerConverterImpl implements IManagerConverter{

	private ICollaborateurConverter colConverter;
	private IProjetConverter projetConverter;
	private ISujetConverter sujetConverter;
	
	
	public void setColConverter(ICollaborateurConverter colConverter) {
		this.colConverter = colConverter;
	}

	public void setProjetConverter(IProjetConverter projetConverter) {
		this.projetConverter = projetConverter;
	}

	public void setSujetConverter(ISujetConverter sujetConverter) {
		this.sujetConverter = sujetConverter;
	}
	
	@Override
	public ManagerModel convertDtoModel(ManagerDto source) {
		return convertDtoModel(source, true);
	}

	@Override
	public ManagerDto convertModelDto(ManagerModel source){
		return convertModelDto(source, true);
	}

	@Override
	public ManagerDto convertModelDto(ManagerModel source, boolean includeRelation) {
		ManagerDto target = new ManagerDto();
		if(source != null){
			if(includeRelation){
		target.setCollaborateurs(colConverter.converteListModelDto(source.getCollaborateurs(), false));	
		target.setProjets(projetConverter.converteListModelDto(source.getProjets(), false));
		target.setSujets(sujetConverter.convertListModelDto(source.getSujets(), false));
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
	public ManagerModel convertDtoModel(ManagerDto source, boolean includeRelation) {
		ManagerModel target = new ManagerModel();
		if(source != null){
			if(includeRelation){
		target.setCollaborateurs(colConverter.converteListDtoModel(source.getCollaborateurs(), false));
		target.setProjets(projetConverter.converteListDtoModel(source.getProjets(), false));
		target.setSujets(sujetConverter.convertListDtoModel(source.getSujets(), false));
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

	


}
